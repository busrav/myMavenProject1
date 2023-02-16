package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.utilities.UtilityClass;

public class ActionClickAndHold extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        //        <div class="dragableBox" id="box3" dragableelement="2">Washington</div>   //the one we drag
        WebElement washington = driver.findElement(By.id("box3"));
        //        <div id="box103" class="dragableBoxRight">United States</div>      //target the one we drop
        WebElement unitedStates = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);
        Action clickAndHoldWashington = actions.clickAndHold(washington).build();
        clickAndHoldWashington.perform();

        Action moveWashington = actions.moveToElement(unitedStates).release().build();
        moveWashington.perform();

        /*Action clickAndHoldWashington2 = actions.clickAndHold(washington).moveToElement(unitedStates).release().build();    //can write in same line
        clickAndHoldWashington2.perform();*/

    }
}
