package com.group.tests.aziz;

import com.group.tests.utilities.BrowserUtils;
import com.group.tests.utilities.ConfigurationReader;
import com.group.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_Login_with_incorrect_details {






    //9. Click 'Delete Account' button
    //10. Verify that 'ACCOUNT DELETED!' is visible
    @Test
    public void login_with_correct_credentials(){
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //3. Verify that home page is visible successfully
        //4. Click on 'Signup / Login' button
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        signInButton.click();
        BrowserUtils.sleep(1);

        //5. Verify 'Login to your account' is visible
        String actualText = Driver.getDriver().findElement(By.tagName("h2")).getText();
        String expectedText = "Login to your account";
        Assert.assertEquals(actualText, expectedText);

        //6. 6. Enter incorrect email address and password
        //7. Click 'login' button
        WebElement emailInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailInputBox.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement passwordInputBox = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password") + Keys.ENTER);

        //8. Verify error 'Your email or password is incorrect!' is visible
        String actualText1 = Driver.getDriver().findElement(By.xpath("//p[@style = 'color: red;']")).getText();
        String expectedText1 = "Your email or password is incorrect!";

        Assert.assertEquals(actualText1, expectedText1);







    }
}
