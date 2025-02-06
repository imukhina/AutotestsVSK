package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    public void ClickSignupButton()
    {
        var signupButton=driver.findElement(By.xpath("//a[@href='/login']"));
        signupButton.click();
    }
    public void ClickDeleteButton()
    {
        var deleteButton =driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteButton.click();
    }
    public void ClickProductsButton()
    {
        var productsButton =driver.findElement(By.xpath("//a[@href='/products']"));
        productsButton.click();
    }
}
