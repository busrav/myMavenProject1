package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.utilities.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindElementsExample2 extends UtilityClass {
    /**1- Go to https://www.saucedemo.com/
     2- login with valid credentials
     3- Add 3 random products to the cart
     6- Click on the cart
     7- Click on the Check Out button
     8- Fill the form and click on Continue
     9- Check if you see your products*/
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");
//        <input class="input_error form_input" placeholder="Username"
//        type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

//        <input class="input_error form_input" placeholder="Password"
//        type="password" data-test="password" id="password" name="password" autocorrect="off" autocapitalize="none" value="">
        WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
        passWord.sendKeys("secret_sauce");
//        <input type="submit" class="submit-button btn_action" data-test="login-button" id="login-button" name="login-button" value="Login">
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();
//<button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-bike-light" id="add-to-cart-sauce-labs-bike-light" name="add-to-cart-sauce-labs-bike-light">Add to cart</button>
        List<WebElement> products = driver.findElements(By.className("inventory_item_name"));
        List<String> productsNames = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
//        Random rand = new Random();
//            int value = rand.nextInt(products.size());
//            products.get(value).click();

        while(productsNames.size()<3) {
            int randIndex = (int)(Math.random()*products.size());
            if(indexList.contains(randIndex)){
                continue;
            }
            indexList.add(randIndex);
            productsNames.add(products.get(randIndex).getText());
            products.get(randIndex).click();
            WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCart.click();
            driver.navigate().back();
        }

//        <a class="shopping_cart_link"><span class="shopping_cart_badge">2</span></a>

        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();

//        <button class="btn btn_action btn_medium checkout_button" data-test="checkout" id="checkout" name="checkout">Checkout</button>

        WebElement checkoutButton = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
        checkoutButton.click();

//        <input class="input_error form_input"
//        placeholder="First Name" type="text" data-test="firstName" id="first-name" name="firstName" autocorrect="off" autocapitalize="none" value="">
        WebElement customerName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        customerName.sendKeys("John");

//        <input class="input_error form_input"
//        placeholder="Last Name" type="text" data-test="lastName" id="last-name" name="lastName" autocorrect="off" autocapitalize="none" value="">
        WebElement customerLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        customerLastName.sendKeys("Doe");


//        <input class="input_error form_input" placeholder="Zip/Postal Code"
//        type="text" data-test="postalCode" id="postal-code" name="postalCode" autocorrect="off" autocapitalize="none" value="">
        WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
        zipCode.sendKeys("549867");

        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();



    }
}
