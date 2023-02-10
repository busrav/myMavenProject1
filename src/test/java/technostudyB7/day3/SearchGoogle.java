package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

//        <input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false"
//        autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search"
//        value="" aria-label="Search" data-ved="0ahUKEwiM2OqB3Yn9AhWRAjQIHUfNAtYQ39UDCAY">

//        <title>bamboo pen - Google Search</title>

//        1- go to google page
//        2- locate search box
//        3-send bamboo pen keys to the box
//        4- get the title of the new opened page
//        5- do verification with actual one and expected one
        String input = "bamboo pen";
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(input + Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification: Passed");
        }else{
            System.out.println("verification: Failed");
            System.out.println("actual title: " + actualTitle);
        }
        driver.quit();


    }
}
