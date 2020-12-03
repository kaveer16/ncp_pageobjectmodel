package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.linkText("Register");

    //method for clicking login link
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }
    //method on clicking register link
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
    }

}
