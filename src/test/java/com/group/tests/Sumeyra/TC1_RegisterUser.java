package com.group.tests.Sumeyra;

import com.github.javafaker.Faker;
import com.group.tests.utilities.BrowserUtils;
import com.group.tests.utilities.ConfigurationReader;
import com.group.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_RegisterUser {

    @Test
    public void register_user() {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        //4. Click on 'Signup / Login' button

        WebElement signUp_Login = Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        BrowserUtils.sleep(2);
        signUp_Login.click();

        //5. Verify 'New User Signup!' is visible

        WebElement NewUserSignupText = Driver.getDriver().findElement(By.className("signup-form"));

        BrowserUtils.sleep(2);
        Assert.assertTrue(NewUserSignupText.isDisplayed());

        //6. Enter name and email address

       WebElement nameInput = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
       nameInput.sendKeys(ConfigurationReader.getProperty("name"));

        BrowserUtils.sleep(2);

        WebElement emailInput = Driver.getDriver().findElement(By.xpath("(//input[@type='email'])[2]"));
        emailInput.sendKeys(ConfigurationReader.getProperty("email"));

        //7. Click 'Signup' button

        WebElement signupButton = Driver.getDriver().findElement(By.xpath("//button[@data-qa='signup-button']"));
        signupButton.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible

        WebElement enterAccInfoText = Driver.getDriver().findElement(By.xpath("(//h2/b)[1]"));
        Assert.assertTrue(enterAccInfoText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth

        WebElement titleMrs = Driver.getDriver().findElement(By.xpath("//input[@id='id_gender2']"));
        titleMrs.click();

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@type='password']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        Select selectDay = new Select(Driver.getDriver().findElement(By.id("days")));
        selectDay.selectByValue("1");

        Select selectMonth = new Select(Driver.getDriver().findElement(By.id("months")));
        selectMonth.selectByVisibleText("October");

        Select selectYear = new Select(Driver.getDriver().findElement(By.id("years")));
        selectYear.selectByIndex(20);


        //10. Select checkbox 'Sign up for our newsletter!'

        WebElement signupCheckbox = Driver.getDriver().findElement(By.xpath("//input[@id='newsletter']"));
        signupCheckbox.click();


        //11. Select checkbox 'Receive special offers from our partners!'

        WebElement receiveCheckbox = Driver.getDriver().findElement(By.xpath("//input[@id='optin']"));
        receiveCheckbox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number


        //13. Click 'Create Account button'
        //14. Verify that 'ACCOUNT CREATED!' is visible
        //15. Click 'Continue' button
        //16. Verify that 'Logged in as username' is visible
        //17. Click 'Delete Account' button
        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button



    }
}