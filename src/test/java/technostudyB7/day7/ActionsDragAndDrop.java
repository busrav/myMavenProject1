package technostudyB7.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import technostudyB7.utilities.UtilityClass;

public class ActionsDragAndDrop extends UtilityClass {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//        <div class="dragableBox" id="box3" dragableelement="2">Washington</div>   //the one we drag
        WebElement washington = driver.findElement(By.id("box3"));
        System.out.println(washington.getCssValue("background-color"));
//        <div id="box103" class="dragableBoxRight">United States</div>      //target the one we drop
        WebElement unitedStates = driver.findElement(By.id("box103"));
        Actions actions = new Actions(driver);
        Action dragAndDropWashington = actions.dragAndDrop(washington,unitedStates).build();
        dragAndDropWashington.perform();
        System.out.println(washington.getCssValue("background-color"));

//        <div class="dragableBox" id="box4" dragableelement="3">Copenhagen</div>
        WebElement copenhagen = driver.findElement(By.id("box4"));
//<div id="box104" class="dragableBoxRight">Denmark</div>
        WebElement denmark = driver.findElement(By.id("box104"));
        Action dragAndDropCopenhagen = actions.dragAndDrop(copenhagen,denmark).build();
        dragAndDropCopenhagen.perform();
    }
}
