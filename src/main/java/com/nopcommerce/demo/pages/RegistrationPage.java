package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegistrationPage extends Utility {
     By maleOption = By.xpath("//label[contains(text(),'Male')]");
     By firstNameField = By.cssSelector("#FirstName");
     By lastNameField = By.cssSelector("#LastName");
     By dayField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
     By monthField = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
     By yearField = By.xpath("/body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
     By emailField = By.cssSelector("#Email");
     By companyField = By.cssSelector("#Company");
     By newsLetterCheckbox = By.cssSelector("#Newsletter");
     By passwordField = By.cssSelector("#Password");
     By confirmPasswordField = By.cssSelector("#ConfirmPassword");
     By registerButton = By.xpath("//input[@id='register-button']");
     By yourRegistrationCompleted = By.xpath("html/body/div[6]/div[3]/div/div/form/div/div[2]/div[1]");

     // method for choosing male option radio button
     public void choosingMaleOption(){
         Reporter.log("Clicking on male option radio button" + maleOption.toString() + "<br>");
         clickOnElement(maleOption);
     }
     // method to enter name to first name field
    public void enterFirstName(String firstname){
         Reporter.log("Enter first name" + firstname + " to first name field" + firstNameField.toString() + "<br>");
         sendTextToElement(firstNameField, firstname);
    }
    // method to enter last name field
    public void enterLastName(String lastname) {
        Reporter.log("Enter last name" + lastname + " to last name field " + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastname);
    }
    // method to enter day to birthday field
    public void enterDay(String day) {
        Reporter.log("Enter Day" + dayField.toString() + "<br>");
        sendTextToElement(dayField, day);
    }
    // method to enter month to birthday field
    public void enterMonth(String month) {
        Reporter.log("Enter Month" + monthField.toString() + "<br>");
        sendTextToElement(monthField, month);
    }
    // method to enter day to birthday field
    public void enterYear(String year) {
        Reporter.log("Enter Year" + yearField.toString() + "<br>");
        sendTextToElement(yearField, year);
    }
    //method to enter email field
    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + "to email field " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
     }
     //method to enter company name
     public void enterCompanyName(String company){
         Reporter.log("Enter company name" + company + "to company field" + companyField.toString() + "<br>");
         sendTextToElement(companyField,company);
     }
     //method to tick checkbox
    public void clickOnNewsLetter(){
         Reporter.log("Click on NewsLetter checkbox" + newsLetterCheckbox.toString() + "<br>");
         clickOnElement(newsLetterCheckbox);
    }
    //method to enter password to password field
    public void enterPassword(String password) {
        Reporter.log("password email " + password + "to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField,password);
    }
    //method to enter confirm password to field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Enter confirm password " + confirmPassword + "to confirm password field " + confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    //method to click on register button
    public void clickOnRegisterButton(){
         Reporter.log( "Click ON register button" + registerButton.toString() + "<br>");
         clickOnElement(registerButton);
    }
    //method to verify Your registration completed text
    public String getYourRegistrationCompleted(){
         return getTextFromElement(yourRegistrationCompleted);
    }


}
