package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
    public static void main(String[] args) {
//        tagName[attribute='value']
//        //tagName[@attribute='value']     relative xpath   we are going to use relative
//        /tagName[@attribute='value']     absolute xpath  it starts from beginning as /html/body....

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.worldometers.info/world-population/");
//        <div id="maincounter-wrap"> <h1> Current World Population</h1> <div class="maincounter-number"> <span class="rts-counter" rel="current_population"><span class="rts-nr-sign"></span><span class="rts-nr-int rts-nr-10e9">8</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e6">016</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e3">804</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e0">243</span></span></div> </div>
       WebElement worldPopulationTitle = driver.findElement(By.xpath("//div[@id='maincounter-wrap']//h1"));
        System.out.println(worldPopulationTitle.getText());
//        <div class="maincounter-number"> <span class="rts-counter" rel="current_population"><span class="rts-nr-sign"></span><span class="rts-nr-int rts-nr-10e9">8</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e6">016</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e3">804</span><span class="rts-nr-thsep">,</span><span class="rts-nr-int rts-nr-10e0">787</span></span></div>
        WebElement worldPopulationNumber = driver.findElement(By.xpath("//div[@class='maincounter-number']//span"));
//        //span[@class='rts-counter']"
        System.out.println(worldPopulationNumber.getText());
    }
}
