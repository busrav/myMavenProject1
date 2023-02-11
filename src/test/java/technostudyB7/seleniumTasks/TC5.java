package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {
    /*TC #5: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String actTitle = driver.getTitle();
//        <title>Google</title>
        String expTitle = "Google";
//<a class="gb_p" aria-label="Gmail" data-pid="23" href="https://mail.google.com/mail/&amp;ogbl" target="_top">Gmail</a>
        WebElement gmailLink = driver.findElement(By.className("gb_p"));
        gmailLink.click();
        driver.getTitle();
        driver.navigate().back();
        if(actTitle.equals(expTitle)){
            System.out.println("verification: PASS");
        }else{
            System.out.println("verification: FAILED");
            System.out.println("actual title" + actTitle);
        }
    }
}
