package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JSAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//        <button onclick="jsAlert()">Click for JS Alert</button>
        WebElement jsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlert.click();
//        it will give alert message text
        String jsAlertText = driver.switchTo().alert().getText();
        System.out.println(jsAlertText);
//        it will click on ok button
        driver.switchTo().alert().accept();


//        <button onclick="jsConfirm()">Click for JS Confirm</button>
        WebElement jsConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        jsConfirm.click();
        String jsConfirmText = driver.switchTo().alert().getText();
        System.out.println(jsConfirmText);
        driver.switchTo().alert().dismiss();


//        <button onclick="jsPrompt()">Click for JS Prompt</button>
        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();


    }
}
