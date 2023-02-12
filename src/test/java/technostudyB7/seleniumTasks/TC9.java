package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        driver.get("http://zero.webappsecurity.com/login.html");

//        <a href="/index.html" class="brand">Zero Bank</a>

        WebElement linkText = driver.findElement(By.className("brand"));
        String actLinkText = linkText.getText();
        String expLinkText = "Zero Bank";

        if(actLinkText.equals(expLinkText)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
            System.out.println(actLinkText);
        }


        String actualHREF = linkText.getAttribute("href");
        String expectedInHREF = "index.html";

        if (actualHREF.equals(expectedInHREF)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
            System.out.println(actualHREF);
        }
    }
}
