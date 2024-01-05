package com.group.tests.practice.automationExercise.Yasemin;

import com.group.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomationRegisterPage {
    public AutomationRegisterPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    // WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign in']"));

    //#2- Use @FindBy annotation instead of findElement method

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement enterName;
    @FindBy(xpath = "//form/input[@data-qa='signup-email']")
    public WebElement enterEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButtonNewUser;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement accountInfoText;

    @FindBy(id = "uniform-id_gender2")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//select[@data-qa='days']")
    public WebElement daysDrop;


    @FindBy(xpath = "//select[@data-qa='months']")
    public WebElement monthsDrop;

    @FindBy(xpath = "//select[@data-qa='years']")
    public WebElement yearsDrop;

    @FindBy(id = "newsletter")
    public  WebElement newsLetterCheckBox;

    @FindBy(id = "optin")
    public WebElement receiveOffersCheckBox;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    public  WebElement inputNameForm;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    public  WebElement inputLastnameForm;

    @FindBy(xpath = "//input[@data-qa='company']")
    public  WebElement inputCompanyForm;

    @FindBy(xpath = "//input[@data-qa='address']")
    public  WebElement inputAdressForm;

    @FindBy(xpath = "//input[@data-qa='address2']")
    public  WebElement inputAdress2Form;

    @FindBy(xpath = "//select[@data-qa='country']")
    public  WebElement inputCountryForm;

    @FindBy(xpath = "//input[@data-qa='state']")
    public  WebElement inputStateForm;

    @FindBy(xpath = "//input[@data-qa='city']")
    public  WebElement inputCityForm;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    public  WebElement inputZipcodeForm;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    public  WebElement inputMobileNumberForm;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public  WebElement createAccountButton;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(xpath = "//i[@class='fa fa-user']")
    public WebElement loggedAsAUsername;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccount;

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginAccountText;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(partialLinkText = "<incorrect>")
    public WebElement incorrectText;












}
