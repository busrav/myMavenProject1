package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        int input1 = 9;
        int input2 = 6;
        WebElement num1 = driver.findElement(By.id("sum1"));
        num1.sendKeys(Integer.toString(input1));

        WebElement num2 = driver.findElement(By.id("sum2"));
        num2.sendKeys(Integer.toString(input2));

        WebElement button = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        button.click();

        WebElement result = driver.findElement(By.id("displayvalue"));

        String actResult = result.getText();
        String expResult = Integer.toString(input1 + input2);


        if(expResult.equals(actResult)){
           System.out.println("it is verified: Passed");
       } else{
           System.out.println("verification is failed");
           System.out.println(actResult);
       }


//        <input type="text" class="form-control" placeholder="Enter value" id="sum1">

//        <input type="text" class="form-control" placeholder="Enter value" id="sum2">

//        <button type="button" onclick="return total()" class="btn btn-default">Get Total</button>

//        <span id="displayvalue">15</span>

        driver.quit();
    }
}
