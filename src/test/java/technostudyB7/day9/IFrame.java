package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

public class IFrame extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");


//        driver.switchTo().frame("frame1");

//        WebElement iFrame = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);

       driver.switchTo().frame(0);
        WebElement topicInput = driver.findElement(By.xpath("/html/body/input"));
        topicInput.sendKeys("John Snow");

//        to mak you go previous parent frame
        driver.switchTo().parentFrame();
//        to make you go beginning html
/**        driver.switchTo().defaultContent();*/

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());
    }
}
