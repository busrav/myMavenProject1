package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

//        <input autofocus="" type="text" class="form-control" placeholder="Please enter your Message" id="user-message">
//        <button type="button" onclick="showInput();" class="btn btn-default">Show Message</button>

        WebElement messageBox = driver.findElement(By.id("user-message"));
        messageBox.sendKeys("Hello");

        WebElement button = driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        button.click();

//        <span id="display">Hello</span>

       WebElement result = driver.findElement(By.id("display"));
        System.out.println(result.getText());

        String expResult = "Hello";
        String actResult = result.getText();

        if(expResult.equals(actResult)){
            System.out.println("it is verified: PASSED");
        }else{
            System.out.println("verification is Failed");
            System.out.println("the actual result is: " + actResult);
        }

        driver.quit();
    }
}
