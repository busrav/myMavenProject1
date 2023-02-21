package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import technostudyB7.utilities.UtilityClass;

public class IFrame3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topicInput = driver.findElement(By.xpath("/html/body/input"));
        topicInput.sendKeys("Busra Vural");

        driver.switchTo().frame(0);
        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

        driver.switchTo().frame(1);
        WebElement dropDownMenu = driver.findElement(By.id("animals"));
        Select select = new Select(dropDownMenu);
        select.selectByIndex(2);

        driver.switchTo().defaultContent();
        System.out.println(header.getText());
    }
}
