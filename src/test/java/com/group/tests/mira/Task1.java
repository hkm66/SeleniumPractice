package com.group.tests.mira;

import com.google.common.base.Verify;
import com.group.tests.utilities.BrowserUtils;
import com.group.tests.utilities.ConfigurationReader;
import com.group.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class Task1 {

  // @AfterMethod
   //public void tearDownMethod(){
   // Driver.closeDriver();

// }

   @Test
   public void userSignUp(){

   Driver.getDriver().get("http://automationexercise.com");

   WebElement signupLoginButton = Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
   signupLoginButton.click();

   WebElement newUserSignUpButton = Driver.getDriver().findElement(By.xpath("//h2[.='New User Signup!']"));
   Assert.assertTrue(newUserSignUpButton.isDisplayed());

    WebElement enterName = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
    enterName.sendKeys("mira");

    WebElement enterEmail = Driver.getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"));
    enterEmail.sendKeys("knburshgh@gmail.com");

    WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Signup']"));
    signUpButton.click();

    WebElement verifyEnterInformationDisplayed = Driver.getDriver().findElement(By.xpath("//b[.='Enter Account Information']"));

    String expectedMessage = "ENTER ACCOUNT INFORMATION";
    String actualInformation = verifyEnterInformationDisplayed.getText();

    Assert.assertEquals(actualInformation,expectedMessage);

    WebElement radioButton = Driver.getDriver().findElement(By.id("id_gender2"));
    radioButton.click();


       WebElement password = Driver.getDriver().findElement(By.id("password"));
       password.sendKeys("123");

       Select selectDay = new Select(Driver.getDriver().findElement(By.id("days")));
       selectDay.selectByValue("21");

       Select selectMonth = new Select(Driver.getDriver().findElement(By.id("months")));
       selectMonth.selectByValue("2");

       Select selectYear = new Select(Driver.getDriver().findElement(By.id("years")));
       selectYear.selectByValue("1995");

       WebElement checkBox = Driver.getDriver().findElement(By.xpath("//input[@id='newsletter']"));
       BrowserUtils.sleep(4);
       checkBox.click();
       Assert.assertTrue(checkBox.isSelected());

       WebElement checkBox2 = Driver.getDriver().findElement(By.id("optin"));
       checkBox2.click();
       Assert.assertTrue(checkBox.isSelected());

       WebElement firstName =  Driver.getDriver().findElement(By.xpath("//input[@id='first_name']"));
       firstName.sendKeys("azat");

       WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@id='last_name']"));
       lastName.sendKeys("kurshat");

       WebElement companyName =  Driver.getDriver().findElement(By.xpath("//input[@id='company']"));
       companyName.sendKeys("tarim");

       WebElement address =  Driver.getDriver().findElement(By.xpath("//input[@id='address1']"));
       address.sendKeys("7 rugby avenue");

       Select selectCountry = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='country']")));
       selectCountry.selectByVisibleText("United States");

       WebElement state = Driver.getDriver().findElement(By.xpath("//input[@id='state']"));
       state.sendKeys("England");

       WebElement city = Driver.getDriver().findElement(By.xpath("//input[@id='city']"));
       city.sendKeys("London");

       WebElement zipCode = Driver.getDriver().findElement(By.xpath("//input[@id='zipcode']"));
       zipCode.sendKeys("HA0 8AG");

       WebElement mobileNumber = Driver.getDriver().findElement(By.xpath("//input[@id='mobile_number']"));
       mobileNumber.sendKeys("0783646363");

      WebElement createButton = Driver.getDriver().findElement(By.xpath("(//button[@type='submit'])[1]"));
      BrowserUtils.sleep(4);
      createButton.click();

       WebElement accountCreated = Driver.getDriver().findElement(By.xpath("//b[.='Account Created!']"));
       Assert.assertTrue(accountCreated.isDisplayed());

       WebElement continueButton = Driver.getDriver().findElement(By.xpath("//a[@data-qa='continue-button']"));
       continueButton.click();

       WebElement loginAsUserName = Driver.getDriver().findElement(By.xpath("//b"));
       loginAsUserName.getText();

       WebElement deleteAccount = Driver.getDriver().findElement(By.xpath("//a[@href='/delete_account']"));
       deleteAccount.click();

       WebElement accountDeleted = Driver.getDriver().findElement(By.xpath("//b[.='Account Deleted!']"));
       BrowserUtils.sleep(4);
       Assert.assertTrue(accountDeleted.isDisplayed());

       WebElement continueButtonEnd = Driver.getDriver().findElement(By.xpath("//a[@data-qa='continue-button']"));
       continueButtonEnd.click();






   }



}
/*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
 */