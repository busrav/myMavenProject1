package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6 {
    /*TC #6: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Click google search button (or press enter)
5- Verify title:
Expected: Title should start with “apple” word
*/
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

//        <input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
//        autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value=""
//        aria-label="Search" data-ved="0ahUKEwit3Mbvj4z9AhU0kYkEHTqhCS0Q39UDCAY">

        String input = "apple";
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(input + Keys.ENTER);
//<title>apple - Google Search</title>
        String actTitle = driver.getTitle();
        String expTitle = "apple - Google Search";

        if(actTitle.equals(expTitle)){
            System.out.println("verification: PASS");
        }else{
            System.out.println("verification: FAILED");
            System.out.println("actual title" + actTitle);
        }

    }
}
