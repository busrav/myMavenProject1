package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7 {
/*TC #7: Basic login authentication
1- Open a chrome browser
2- Go to:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrder
s/login.aspx
3- Verify title equals:
Expected: Web Orders Login
4- Enter username: “Tester”
5- Enter password: “test”
6- Click “Sign In” button
7- Verify title equals:
Expected: Web Orders
*/
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    String username = "Tester";
    String password = "test";
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrder\n" +
            "s/login.aspx");
    String actTitle = driver.getTitle();
//    <title>Web Orders Login</title>
    String expTitle = "Web Orders Login";

    if(actTitle.equals(expTitle)){
        System.out.println("verification: PASS");
    }else{
        System.out.println("verification: FAILED");
        System.out.println("actual title" + actTitle);
    }

//    <input name="ctl00$MainContent$username" type="text" id="ctl00_MainContent_username" class="txt" style="width:142px">
//    <input name="ctl00$MainContent$password" type="password" id="ctl00_MainContent_password" class="txt" style="width:142px">
//    <input type="submit" name="ctl00$MainContent$login_button" value="Login" id="ctl00_MainContent_login_button" class="button">
    WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
    userName.sendKeys(username);
    WebElement passWord = driver.findElement(By.id("ctl00_MainContent_password"));
    passWord.sendKeys(password);
    WebElement submit = driver.findElement(By.id("ctl00_MainContent_login_button"));
    submit.click();
//    <title>Web Orders</title>
    String newTitle = driver.getTitle();
    String expectedTitle = "Web Orders";

    if(newTitle.equals(expectedTitle)){
        System.out.println("verification: PASS");
    }else{
        System.out.println("verification: FAILED");
        System.out.println("actual title" + newTitle);
    }
}
}
