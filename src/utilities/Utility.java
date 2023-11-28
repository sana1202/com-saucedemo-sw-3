package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void switchToAlert() {
        driver.switchTo().alert();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void getTextFromAlert() {
        driver.switchTo().alert().getText();
    }

    public void sendTextFromAlert() {
        driver.switchTo().alert().sendKeys("Text");
    }

    //*****************************Select Class Methods*****************************************************
    public void selectByValueFromDropDown(By by, String value) {
        WebElement dropDown = driver.findElement(by);
        //Create the object of select class
        Select select = new Select(dropDown);
        select.selectByValue(value);
    }

    //****************************Action method*****************************************************
    public void mouseHoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }
    public boolean verifyNumberFromElement(By by, int expectedNumber) {
        int actualNumber = driver.findElements(by).size();
        assert actualNumber == expectedNumber : "Expected Number of items not displayed: " + expectedNumber;
        return true;
    }
}
