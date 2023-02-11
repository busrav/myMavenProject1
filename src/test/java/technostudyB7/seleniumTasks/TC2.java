package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
    /*TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”
TC #2: Facebook incorrect login title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Enter incorrect username
4. Enter incorrect password
5. Verify title changed to:
Expected: “Log into Facebook”*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String email = "bus4546@gmail.com";
        String password = "12345";

        driver.get("https://www.facebook.com");
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(email);

        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        loginButton.click();

        String newTitle = driver.getTitle();
        String expTitle = "Log into Facebook";

        if(newTitle.equals(expTitle)){
            System.out.println("verification: pass");
            System.out.println("incorrect username and incorrect password");
        }else{
            System.out.println("verification: failed");
            System.out.println("actual title is: " + newTitle);
        }
    }
}
