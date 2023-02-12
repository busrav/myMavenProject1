package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC8 {
    /*TC #8: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
TIPS FOR TASK #8:
1. Set up driver
2. Open browser
3. Get webpage: http://zero.webappsecurity.com/login.html
4. Locate header. Get the text using getText()
5. Create expectedTitle String
6. Create if conditions to do your verification
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

//        <div class="page-header"><h3>Log in to ZeroBank</h3></div>
        WebElement header = driver.findElement(By.className("page-header"));
        String actHeader = header.getText();
        String expHeader = "Log in to ZeroBank";

        if (actHeader.equals(expHeader)) {
            System.out.println("verification: Pass");
        }else {
            System.out.println("verification: failed");
            System.out.println("actual header is " + actHeader);
        }
    }
}
