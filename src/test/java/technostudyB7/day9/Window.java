package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

import java.util.Set;

public class Window extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle(); // we are getting the id of the main page

        WebElement registerNowButton = driver.findElement(By.cssSelector("a[href='https://seleniumconf.com/']"));
        registerNowButton.click();

        Set<String> allIds = driver.getWindowHandles();

        for (String id : allIds) {
            if (!id.equals(mainPageId)) {
                driver.switchTo().window(id);
            }
        }

        System.out.println(driver.getTitle());

        driver.switchTo().window(mainPageId);
        System.out.println(driver.getTitle());
    }
}
