package org.example;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public boolean AtCorrectPage(String title) {
        return driver.getTitle().equals(title);
    }
}
