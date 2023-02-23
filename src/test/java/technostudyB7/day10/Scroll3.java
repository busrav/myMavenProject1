package technostudyB7.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

public class Scroll3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");
        WebElement hire = driver.findElement(By.xpath("//div[text()='Hire faster']"));

        Wait(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",hire);
        System.out.println(hire.getText());
        quitDriver(2);
    }
}
