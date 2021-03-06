package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class LoginPage extends Utility {
    //creating web elements to use in  test suite
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginBtn = By.xpath("//input[@value='Log in']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By errorMessage = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)");

    /*
     This method will enter email id to Email field
     */
    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + "to email field " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
    }
    // method to enter password to password field
    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + "to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }
    // method to click on login link
    public void clickOnLoginButton() {
        Reporter.log("Clicking on Login Button " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
    }
    // method to verify welcome text
    public String getWelcomeText() {

        return getTextFromElement(welcomeText);
    }
    // method to verify error messsage
    public String getErrorMessage() {

        return getTextFromElement(errorMessage);
    }
    // method to login
    public void loginToApplication(String email, String password) {
        enterEmailId(email);
        enterPassword(password);
        clickOnLoginButton();
    }
}
