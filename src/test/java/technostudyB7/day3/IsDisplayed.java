package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

//        <div id="start">
//    <button>Start</button>
//  </div>

//        <div id="finish" style="">
//    <h4>Hello World!</h4>
//  </div>

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));

        System.out.println("before click on start button: " + hiddenText.isDisplayed());
        startButton.click();
        Thread.sleep(7000);
        System.out.println("after click on start button: " + hiddenText.isDisplayed());
        driver.quit();

    }
}
