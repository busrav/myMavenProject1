package technostudyB7.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.utilities.UtilityClass;


public class Hw extends UtilityClass {
    /** Navigate to https://www.phptravels.net
     * Click on Account button
     * Click on Customer Sign Up
     * Fill the form
     * Check the "I am not robot" check box
     * Click on Sign Up button
     * Check if the title is "Login - PHPTRAVELS"
     * Enter same login information that you used during registration and click login
     * Verify the welcome message contains the first name that you used during registration then close the browser
     * Note: You can use any locator you want.
     * */
    public static void main(String[] args) {
        driver.get("https://www.phptravels.net");
//        <button class="btn btn-primary dropdown-toggle waves-effect" type="button" id="ACCOUNT" data-bs-toggle="dropdown" aria-expanded="false">
//                                    <svg class="pe-1" xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="#ffffff" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"><path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path><circle cx="12" cy="7" r="4"></circle></svg>
//                                    Account                                    <i class="la la-angle-down"></i>
//                                    </button>
        WebElement accountButton = driver.findElement(By.id("ACCOUNT"));
        accountButton.click();

//        <a class="dropdown-item waves-effect" href="https://phptravels.net/signup">Customer Signup</a>
        WebElement customerSignUp = driver.findElement(By.linkText("Customer Signup"));
        customerSignUp.click();
//        <input class="form-control" type="text" placeholder="First Name" name="first_name" value="" required="">
        String fName = "John";
        String lName = "Doe";
        String phone = "2018768889";
        String email = "jdoe@gmail.com";
        String password = "12345";
        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys(fName);
//        <input class="form-control" type="text" placeholder="Last Name" name="last_name" value="" required="">
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys(lName);
//        <input class="form-control" type="text" placeholder="Phone" name="phone" value="" required="">
        WebElement phoneNumber = driver.findElement(By.name("phone"));
        phoneNumber.sendKeys(phone);
//        <input class="form-control" type="text" placeholder="Email" name="email" value="" required="">
        WebElement emailEnter = driver.findElement(By.name("email"));
        emailEnter.sendKeys(email);
//        <input class="form-control" type="password" placeholder="Password" name="password" value="" required="">
        WebElement passwordEnter = driver.findElement(By.name("password"));
        passwordEnter.sendKeys(password);
//<div class="recaptcha-checkbox-border" role="presentation" style=""></div>


        WebElement cookiesButton = driver.findElement(By.id("cookie_stop"));
        cookiesButton.click();


//<button type="submit" id="button" class="btn btn-default btn-lg
// btn-block effect ladda-button waves-effect" data-style="zoom-in"><span class="ladda-label">Signup</span><span class="ladda-spinner"></span></button>
        WebElement signUpButton = driver.findElement(By.xpath("//*[@id=\"button\"]"));

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Login - safa";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("verification: pass");
        }else{
            System.out.println("verification: fail");
        }

        WebElement loginEmail = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));
        loginEmail.sendKeys(email);

        WebElement loginPass = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[2]/div[1]/input"));
        loginPass.sendKeys(password);

        WebElement loginButton = driver.findElement(By.cssSelector("button[class=\"btn btn-default btn-lg btn-block effect ladda-button waves-effect\"]"));
        loginButton.click();

        WebElement welcomeMessage = driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[1]/div/div[1]/div[1]/div/div/h2"));
        Wait(3);
        System.out.println(welcomeMessage.getText());
        if(welcomeMessage.getText().contains(fName)){
            System.out.println("verification: pass");
        }else {
            System.out.println("verification: fail");
        }

//        quitDriver(4);
    }
}
