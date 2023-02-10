package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        /** 1-visit the page
         * 2- locate enable button
         * 3-click on the button
         * 4- verify if it is enabled*/

//        <form id="input-example">
//    <input type="text" style="width: 30%;" disabled="">
//    <button autocomplete="off" type="button" onclick="swapInput()">Enable</button>
//    <p id="message">It's disabled!</p><div id="loading" style="display: none;">Wait for it...
//    <img src="/img/ajax-loader.gif"></div><br><div id="loading" style="display: none;">Wait for it...
//    <img src="/img/ajax-loader.gif"></div><br>
//  </form>

      WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));

      WebElement input = driver.findElement(By.cssSelector("#input-example>input"));
      boolean isInputFieldEnabled = input.isEnabled();
        System.out.println("before click on enable button: " + isInputFieldEnabled);
        enableButton.click();
        Thread.sleep(5000);

        boolean isInputFieldEnabled2 = input.isEnabled();
        System.out.println("after click on enable button: " + isInputFieldEnabled2);

        driver.quit();
    }
}
