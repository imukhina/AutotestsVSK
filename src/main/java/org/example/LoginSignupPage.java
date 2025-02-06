package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSignupPage extends BasePage {
    public LoginSignupPage(WebDriver driver)
    {
    super(driver);
    }
    public void Login()
    {
        var passwordInput = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        var emailInput = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        passwordInput.sendKeys("qwerty123");
        emailInput.sendKeys("login34234@gmail.com");

        var buttonLogin = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        buttonLogin.click();
    }
    public void Signup()
    {
            var nameInput = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
            var emailInput = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
            nameInput.sendKeys("Василий");
            emailInput.sendKeys("login34234@gmail.com");
            var buttonSignup = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
            buttonSignup.click();
    }
}
