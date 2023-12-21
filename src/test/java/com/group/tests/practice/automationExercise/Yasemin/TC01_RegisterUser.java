package com.group.tests.practice.automationExercise.Yasemin;

import com.group.tests.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_RegisterUser {
    AutomationRegisterPage registerPage;

    @Test
    public void registerUser(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("https://automationexercise.com/");
        registerPage=new AutomationRegisterPage();

        //3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://automationexercise.com/");
        System.out.println(Driver.getDriver().getCurrentUrl());

        //4. Click on 'Signup / Login' button
        registerPage.signUpLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(registerPage.newUserSignupText.isDisplayed());

        //6. Enter name and email address
        registerPage.enterName.sendKeys("Sema");
        registerPage.enterEmail.sendKeys("semaa@abcd.com");

        //7. Click 'Signup' button
        registerPage.signupButtonNewUser.click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(registerPage.accountInfoText.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registerPage.femaleRadioButton.click();
        registerPage.passwordButton.sendKeys("123456");


        Select daysDropDown=new Select(registerPage.daysDrop);
        daysDropDown.selectByValue("20");

        Select monthsDropDown=new Select(registerPage.monthsDrop);
        monthsDropDown.selectByVisibleText("March");

        Select yearsDropDown=new Select(registerPage.yearsDrop);
        yearsDropDown.selectByValue("1993");

       //10. Select checkbox 'Sign up for our newsletter!'
        registerPage.newsLetterCheckBox.click();

        // 11. Select checkbox 'Receive special offers from our partners!'
        registerPage.receiveOffersCheckBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        registerPage.inputNameForm.sendKeys("Semaa");
        registerPage.inputLastnameForm.sendKeys("Ince");
        registerPage.inputCompanyForm.sendKeys("CYDEO");
        registerPage.inputAdressForm.sendKeys("3/3 Cool Street");
        registerPage.inputAdress2Form.sendKeys("Elie Path");
        Select inputCountryNameForm=new Select(registerPage.inputCountryForm);
        inputCountryNameForm.selectByVisibleText("Canada");
        registerPage.inputStateForm.sendKeys("DA");
        registerPage.inputCityForm.sendKeys("Toronto");
        registerPage.inputZipcodeForm.sendKeys("DA 123");
        registerPage.inputMobileNumberForm.sendKeys("111 222 3333");

        //13. Click 'Create Account button'
        registerPage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        Assert.assertTrue(registerPage.accountCreatedText.isDisplayed());

        //15. Click 'Continue' button
        registerPage.continueButton.click();

        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(registerPage.loggedAsAUsername.isDisplayed());


        //17. Click 'Delete Account' button
        registerPage.deleteAccount.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        registerPage.accountDeletedText.isDisplayed();
        registerPage.continueButton.click();

        Driver.closeDriver();





    }


}
