package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

/*
userShouldLoginSuccessfullyWithValid

Credentials
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify the text “PRODUCTS”

2. verifyThatSixProductsAreDisplayedOnPage

* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify that six products are displayed
on page
 */
public class LoginTest extends Utility {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        sendTextToElement(By.cssSelector("#user-name"), "standard_user");
        //Enter “secret_sauce” password
        sendTextToElement(By.cssSelector("#password"), "secret_sauce");
        //Click on 'login' button
        clickOnElement(By.cssSelector("#login-button"));
//verify the text “PRODUCTS”
        getTextFromElement(By.cssSelector(".title"));

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter “standard_user” username
        sendTextToElement(By.xpath("//input[@id='user-name']"), "standard_user");
        //Enter “secret_sauce” password
        sendTextToElement(By.xpath("//input[@id='password']"), "secret_sauce");
        //Click on 'login' button
        clickOnElement(By.xpath("//input[@id='login-button']"));
        // Verify that six products are displayed on page
        verifyNumberFromElement(By.className("inventory_item"), 6);
    }
    public void tearDown() {
        closeBrowser();
    }
}
