package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver)
    {
        super(driver);
    }
    public void AddProductToCart() {
        Actions actions= new Actions(driver);
        actions.pause(Duration.ofSeconds(10));
        var addToCartButton=driver.findElement(By.xpath("//a[@data-product-id='1']"));
        actions.moveToElement(addToCartButton);
        actions.perform();
        addToCartButton.click();

        var continueShoppingButton = driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
        Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(element -> continueShoppingButton.isDisplayed());
        continueShoppingButton.click();

        var addToCartButton2=driver.findElement(By.xpath("//a[@data-product-id='2']"));
        wait.until(element -> addToCartButton2.isDisplayed());
        actions.moveToElement(addToCartButton2);
        actions.perform();
        addToCartButton2.click();

        var viewCartLink = driver.findElement(By.xpath("//u[text()='View Cart']"));
        wait.until(element -> viewCartLink.isDisplayed());
        viewCartLink.click();

    }
}
