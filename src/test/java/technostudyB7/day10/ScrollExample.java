package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

import java.util.List;

public class ScrollExample extends UtilityClass {
    public static void main(String[] args) {
        /**
         * Go to "https://www.youtube.com/"
         * Scroll down until there are at least 300 videos on the page
         * Print the name of the 300th video
         * */
        driver.get("https://www.youtube.com/");
        Wait(3);
        List<WebElement> videoList = driver.findElements(By.id("video-title"));
        System.out.println(videoList.size());

        while(videoList.size()<100){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");
            Wait(3);
            videoList = driver.findElements(By.id("video-title"));
        }
        System.out.println(videoList.size());
        System.out.println(videoList.get(99).getText());








    }
}
