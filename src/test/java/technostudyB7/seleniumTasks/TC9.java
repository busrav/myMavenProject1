package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9 {
    /*TC #9: Zero Bank link text verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify link text from top left:
Expected: “Zero Bank”
4. Verify link href attribute value contains:
Expected: “index.html”
TIPS FOR TASK #9:
1. Set up driver
2. Open browser
3. Get webpage: http://zero.webappsecurity.com/login.html
4. Locate the “Zero Bank” link using className locator
5. get the attribute value of href using .getAttribute() method and store it in actualHREF
String
6. Create expectedInHREF String
7. Create if conditions to check actual value contains the expected value
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
