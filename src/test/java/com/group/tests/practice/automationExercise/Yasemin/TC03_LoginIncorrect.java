package com.group.tests.practice.automationExercise.Yasemin;


import com.group.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_LoginIncorrect {

    AutomationRegisterPage registerPage;


    @Test
    public void loginInCorrectCrudental() {


        registerPage = new AutomationRegisterPage();

        //Test Case 2: Login User with correct email and password
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://automationexercise.com/");
        System.out.println(Driver.getDriver().getCurrentUrl());

        //4. Click on 'Signup / Login' button
        registerPage.signUpLoginButton.click();

        //5. Verify 'Login to your account' is visible
        registerPage.loginAccountText.isDisplayed();

        //6. Enter correct email address and password
        registerPage.loginEmail.sendKeys("sevgi@abcd.com");
        registerPage.loginPassword.sendKeys("123456");

        //7. Click 'login' button
        registerPage.loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible
        registerPage.incorrectText.isDisplayed();

        Driver.closeDriver();
    }

    }
