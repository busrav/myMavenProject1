package technostudyB7.day10;

import org.openqa.selenium.JavascriptExecutor;
import technostudyB7.utilities.UtilityClass;

public class Scroll extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        Wait(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        Wait(2);
        js.executeScript("window.scrollBy(0,-1000)");

        quitDriver(2);
    }
}
