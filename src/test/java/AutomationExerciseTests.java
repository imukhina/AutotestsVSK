import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Constant.actualTitle;

public class AutomationExerciseTests extends BaseTest {

    @Test
    public void RegisterUser()
    {
        Assert.assertTrue(homePage.AtCorrectPage(actualTitle), "Wrong page");

        homePage.ClickSignupButton();
        loginPage.Signup();
        enterAccountInformationPage.FillInInformation();

        //Страница Account Created!
        var accountCreated = driver.findElement(By.xpath("//h2[@data-qa='account-created']"));
        Assert.assertTrue(accountCreated.isDisplayed(), "Аккаунт не создан");

        accountCreatedPage.ClickContinueButton();
        homePage.ClickDeleteButton();

        var accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        Assert.assertTrue(accountDeleted.isDisplayed(), "Element User Name isn't displayed");

        accountCreatedPage.ClickContinueButton();
    }

    @Test
    public void  LoginUserWithCorrectEmailAndPassword()
    {
        Assert.assertTrue(homePage.AtCorrectPage(actualTitle), "Wrong page");
        homePage.ClickSignupButton();

        var loginFormName= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginFormName.isDisplayed(),"Login Form isn't displayed");

        loginPage.Login();

        var userName= driver.findElement(By.xpath("//b[text()='Василий']"));
        Assert.assertTrue(userName.isDisplayed(),"Element User Name isn't displayed");
    }

    @Test
    public void ContactUs()
    {
        contactUpPage.FillInContactInformation();
        var actualText= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
        var actualTextProperty= actualText.getText();
        Assert.assertEquals(actualTextProperty,"Success! Your details have been submitted successfully.");

        var homeButton= driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        homeButton.click();

        Assert.assertTrue(homePage.AtCorrectPage(actualTitle), "Wrong page");
    }

    @Test
    public void AddProductsInCart()
    {
        Assert.assertTrue(homePage.AtCorrectPage(actualTitle), "Wrong page");

        homePage.ClickProductsButton();
        productsPage.AddProductToCart();

        var firstProduct = driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        var secondProduct = driver.findElement(By.xpath("//a[@href='/product_details/2']"));
        Assert.assertTrue(firstProduct.isDisplayed(),"Element First Product isn't displayed");
        Assert.assertTrue(secondProduct.isDisplayed(),"Element Second Product isn't displayed");

        var firstProductPrice= driver.findElement(By.xpath("//p[text()='Rs. 500']"));
        Assert.assertEquals(firstProductPrice.getText(),"Rs. 500","Price isn't correct");
    }
}
