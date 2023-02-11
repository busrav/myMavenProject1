package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4 {
    /*TC #4: Facebook "create a page" link verification
1. Open Chrome browser
2. Go to https://www.facebook.com
3. Verify “Create a page” link href value contains text:
Expected: “registration_form”
TIPS FOR TASK #4:
1. Set up driver
2. Open browser
3. Get webpage: https://www.facebook.com
4. Locate the link, get the attribute value using .getAttribute() method
and store it in actualHREF String
5. Create expectedInHREF String
6. Create if conditions to do your verification*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
//        <a href="/pages/create/?ref_type=registration_form" class="_8esh">Create a Page</a>
        WebElement link = driver.findElement(By.className("_8esh"));
        String actualHREF = link.getAttribute("href");
        String expectedInHREF = "registration_form";

        if(actualHREF.equals(expectedInHREF)){
            System.out.println("verification: PASS");
        }else{
            System.out.println("verification: FAILED");
            System.out.println("actual header: " + actualHREF);
        }
    }
}
