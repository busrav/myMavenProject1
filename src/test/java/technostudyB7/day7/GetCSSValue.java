package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

public class GetCSSValue extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
//        <input autocomplete="off" name="keyword" type="text" class="col-xs-20
//        searchformInput keyword" id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands" value="">
        WebElement searchInput = driver.findElement(By.id("inputValEnter"));

        System.out.println( "what value does the autocomplete attribute has " + searchInput.getAttribute("autocomplete"));

        System.out.println("value of name attribute " + searchInput.getAttribute("name"));


        System.out.println(searchInput.getCssValue("background"));
        System.out.println(searchInput.getCssValue("font-family"));
        System.out.println(searchInput.getCssValue("color"));

    }
}
