package technostudyB7.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class XPATH2 {
    /**1- Go to https://www.saucedemo.com/
     2- login with valid credentials
     3- Click on Sauce Labs Backpack and add to the cart
     4- Click on Back To Products
     5- Click on Sauce Labs Bolt T-Shirt and add to the cart
     6- Click on the cart
     7- Click on the Check Out button
     8- Fill the form and click on Continue
     9- Check if you see your products*/

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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

//        <div class="inventory_item_name">Sauce Labs Backpack</div>
        WebElement product1 = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        String product1Str = product1.getText();
        product1.click();
//        <button class="btn btn_primary btn_small btn_inventory"
//        data-test="add-to-cart-sauce-labs-backpack" id="add-to-cart-sauce-labs-backpack" name="add-to-cart-sauce-labs-backpack">Add to cart</button>
        WebElement addToCartButton = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();


        driver.navigate().back();
//<div class="inventory_item_name">Sauce Labs Bolt T-Shirt</div>

        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")); //We located the element with its text
        String product2Str = product2.getText();
        product2.click();
//        <button class="btn btn_primary btn_small btn_inventory"
//        data-test="add-to-cart-sauce-labs-bolt-t-shirt" id="add-to-cart-sauce-labs-bolt-t-shirt"
//        name="add-to-cart-sauce-labs-bolt-t-shirt">Add to cart</button>

        WebElement buttonAddToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        buttonAddToCart.click();
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


//        <div class="inventory_item_name">Sauce Labs Backpack</div>

//        <div class="inventory_item_name">Sauce Labs Bolt T-Shirt</div>
        WebElement checkOutProduct1 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        WebElement checkOutProduct2 = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[2]"));

        List<String> checkOutList = new ArrayList<>();
        checkOutList.add(checkOutProduct1.getText());
        checkOutList.add(checkOutProduct2.getText());

        System.out.println(checkOutList.contains(product1Str));
        System.out.println(checkOutList.contains(product2Str));

        driver.quit();
    }
}
