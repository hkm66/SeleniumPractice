package com.group.tests.aziz;

import com.github.javafaker.Faker;
import com.group.tests.utilities.BrowserUtils;
import com.group.tests.utilities.ConfigurationReader;
import com.group.tests.utilities.Driver;
import org.apache.commons.io.filefilter.ConditionalFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_RegisterUSer {


    @Test
    public void register_user(){
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("https://automationexercise.com/");
        BrowserUtils.sleep(1);

//3. Verify that home page is visible successfully
//4. Click on 'Signup / Login' button
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//a[@href='/login']"));
        signInButton.click();
        BrowserUtils.sleep(1);

        //5. Verify 'New User Signup!' is visible
        WebElement message = Driver.getDriver().findElement(By.xpath("(//h2)[3]"));
        Assert.assertTrue(message.isDisplayed());
        BrowserUtils.sleep(1);
//6. Enter name and email address
//7. Click 'Signup' button
        WebElement name = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));
        name.sendKeys(ConfigurationReader.getProperty("name"));

        WebElement email = Driver.getDriver().findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(ConfigurationReader.getProperty("username") + Keys.ENTER);
        BrowserUtils.sleep(1);

//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement message1 = Driver.getDriver().findElement(By.xpath("(//b)[1]"));
        Assert.assertTrue(message1.isDisplayed());
        //scroll down a little (test)
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        BrowserUtils.sleep(1);

//9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement titleMr = Driver.getDriver().findElement(By.xpath("(//input[@name='title'])[1]"));
        titleMr.click();

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

        Select selectDay = new Select(Driver.getDriver().findElement(By.id("days")));
        selectDay.selectByValue("27");
        BrowserUtils.sleep(1);
        Select selectMonth = new Select((Driver.getDriver().findElement(By.id("months"))));
        selectMonth.selectByVisibleText("July");
        BrowserUtils.sleep(1);
        Select selectYear = new Select(Driver.getDriver().findElement(By.id("years")));
        selectYear.selectByValue("1992");
        BrowserUtils.sleep(1);

//10. Select checkbox 'Sign up for our newsletter!'
        WebElement newsletter = Driver.getDriver().findElement(By.xpath("//input[@id='newsletter']"));
        newsletter.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(newsletter.isSelected());

//11. Select checkbox 'Receive special offers from our partners!'
        WebElement specialOffer = Driver.getDriver().findElement(By.xpath("//input[@id='optin']"));
        specialOffer.click();
        BrowserUtils.sleep(1);
        Assert.assertTrue(specialOffer.isSelected());

//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //firstname
        Driver.getDriver().findElement(By.xpath("//input[@id='first_name']")).sendKeys(ConfigurationReader.getProperty("name"));
        //lastname
        Driver.getDriver().findElement(By.xpath("//input[@id='last_name']")).sendKeys(ConfigurationReader.getProperty("lastname"));
        //company
        Driver.getDriver().findElement(By.xpath("//input[@id='company']")).sendKeys(ConfigurationReader.getProperty("company"));
        BrowserUtils.sleep(2);
        //creating faker for the address
        Faker fake = new Faker();
        String address = fake.address().streetAddress()+", "+fake.address().zipCode()+", "+fake.address().city();

        //address
        Driver.getDriver().findElement(By.xpath("//input[@id='address1']")).sendKeys(address);
        BrowserUtils.sleep(2);

        //Country
        Select selectCountry = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='country']")));
        selectCountry.selectByVisibleText("United States");

        //State
        Driver.getDriver().findElement(By.xpath("//input[@id='state']")).sendKeys("California");

        //City
        Driver.getDriver().findElement(By.xpath("//input[@id='city']")).sendKeys("Ashqabat");

        //zipcode
        Driver.getDriver().findElement(By.xpath("//input[@id='zipcode']")).sendKeys("40202");

        //Mobile number
        Driver.getDriver().findElement(By.xpath("//input[@id='mobile_number']")).sendKeys(ConfigurationReader.getProperty("phone"));

//13. Click 'Create Account button'
        WebElement createAccountButton = Driver.getDriver().findElement(By.xpath("(//button)[1]"));
        createAccountButton.click();

        BrowserUtils.sleep(2);

//14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement message3 = Driver.getDriver().findElement(By.xpath("//b"));
        Assert.assertTrue(message3.isDisplayed());
        BrowserUtils.sleep(1);

//15. Click 'Continue' button
        WebElement continueButton = Driver.getDriver().findElement(By.xpath("(//a[@href='/'])[3]"));
        continueButton.click();

        WebElement loggedInUserName = Driver.getDriver().findElement(By.xpath("//b"));
        String displayedName = loggedInUserName.getText();


        String expectedResult = "Logged in as " + ConfigurationReader.getProperty("name");
        String actualResult = "Logged in as " + displayedName;

        Assert.assertEquals(actualResult,expectedResult);

//17. Click 'Delete Account' button
        WebElement deleteAccountButton = Driver.getDriver().findElement(By.xpath("//a[@href='/delete_account']"));
        deleteAccountButton.click();
        BrowserUtils.sleep(2);

//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement message4 = Driver.getDriver().findElement(By.xpath("(//b)[1]"));
        Assert.assertTrue(message4.isDisplayed());

        WebElement continueButton1 = Driver.getDriver().findElement(By.xpath("(//a[@href='/'])[3]"));
        continueButton1.click();

        Driver.closeDriver();

    }
}
