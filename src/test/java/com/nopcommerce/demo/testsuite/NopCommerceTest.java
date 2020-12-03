package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegistrationPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay
 */
public class NopCommerceTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegistrationPage registrationPage= new RegistrationPage();

    @Test
    public void verifyUserShouldRegisterSuccessfully(){
        homePage.clickOnRegisterLink();
        registrationPage.choosingMaleOption();
        waitFor(2);
        registrationPage.enterFirstName("Kaveer");
        waitFor(2);
        registrationPage.enterLastName("Kumar");
        waitFor(2);
        registrationPage.enterDay("10");
        waitFor(2);
        registrationPage.enterMonth("October");
        waitFor(2);
        registrationPage.enterYear("1985");
        waitFor(2);
        int num = getRandomNumeric();
        registrationPage.enterEmailId("kaveer" + num + "gmail.com");
        waitFor(2);
        registrationPage.enterCompanyName("Raj Consultants");
        waitFor(2);
        registrationPage.clickOnNewsLetter();
        waitFor(2);
        registrationPage.enterPassword("123456");
        waitFor(2);
        registrationPage.enterConfirmPassword("123456");
        waitFor(2);
        registrationPage.clickOnRegisterButton();
        waitFor(2);
        registrationPage.getYourRegistrationCompleted();
        String expectedMessage = "Your registration completed";
        String actualMessage = registrationPage.getYourRegistrationCompleted();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNotLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        waitFor(2);
        loginPage.enterEmailId("abcd@yahoo.com");
        waitFor(2);
        loginPage.enterPassword("pass1");
        waitFor(2);
        loginPage.clickOnLoginButton();
        waitFor(2);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
