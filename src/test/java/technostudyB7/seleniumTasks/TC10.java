package technostudyB7.seleniumTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC10 {
    /*TC #9: EtsySearchTest
1- Navigate to etsy homepage
https://www.etsy.com/
2- Search for “bamboo pen"
3- Verify title starts with "part of the item"
4- Click on "Gifts for Every Valentine" link
5- Read the text of the Header using h1 tag
6- Verify the header equals " Gifts for Every Valentine "
7- Close the browser*/
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.etsy.com/");

//        <input id="global-enhancements-search-query" data-id="search-query" data-search-input="" type="text" name="search_query"
//        class="wt-input wt-input-btn-group__input global-enhancements-search-input-btn-group__input
//                     wt-pr-xs-7
//                                        " placeholder="Search for anything" value="" autocomplete="off" autocorrect="off" autocapitalize="off">

        String input = "bamboo pen";
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys(input + Keys.ENTER);
        String actTitle = driver.getTitle();
        String expTitle = "part of the item";
//        <span class="wt-display-table-cell wt-text-left-xs">Gifts for Every Valentine</span>
        Thread.sleep(3000);
        WebElement link = driver.findElement(By.cssSelector("span[class='wt-display-table-cell wt-text-left-xs']"));
        link.click();
//        <h1 class="wt-text-display-01 wt-pb-xs-2 wt-text-black">Valentine's Day Gifts</h1>
        WebElement header = driver.findElement(By.cssSelector("h1[class='wt-text-display-01 wt-pb-xs-2 wt-text-black']"));
        header.getText();
    }
}
