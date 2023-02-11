package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {
    /*TC #1: Facebook title verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify title:
Expected: “Facebook - Log In or Sign Up”
TIPS FOR TASK #1:
1. Set up driver
2. Open browser
3. Get webpage: https://www.facebook.com
4. Use .getTitle() method, and store the actual title in a String
5. Create expectedTitle String
6. Create if conditions to do your verification*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
//        <title id="pageTitle">Facebook - log in or sign up</title>
        String expectedTitle = "Facebook - log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification: PASS");
        }else{
            System.out.println("verification: FAILED");
            System.out.println("actual title" + actualTitle);
        }
    }
}
