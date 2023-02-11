package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3 {
    /*1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify header text is as expected:
Expected: “Connect with friends and the world around you on Facebook.”
TIPS FOR TASK #3:
1. Set up driver
2. Open browser
3. Get webpage: https://www.facebook.com
4. Locate header, get the text and store it in actualHeader
String
5. Create expectedHeader String
6. Create if conditions to do your verification*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
//        <h2 class="_8eso">Connect with friends and the world around you on Facebook.</h2>
        String expHeader = "Connect with friends and the world around you on Facebook.";
        WebElement header = driver.findElement(By.className("_8eso"));
        String actHeader = header.getText();

        if(actHeader.equals(expHeader)){
            System.out.println("verification: PASS");
        }else{
            System.out.println("verification: FAILED");
            System.out.println("actual header" + actHeader);
        }
    }
}
