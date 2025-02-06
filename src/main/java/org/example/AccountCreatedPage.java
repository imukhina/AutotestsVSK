package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountCreatedPage extends BasePage{
    public AccountCreatedPage(WebDriver driver)
    {
        super(driver);
    }
    public void ClickContinueButton() {
        var continueButton=driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
        continueButton.click();
    }
}
