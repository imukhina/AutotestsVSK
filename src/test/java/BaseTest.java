import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homepage;
    protected LoginSignupPage loginpage;
    protected EnterAccountInformationPage enterAccountInformationPage;
    protected AccountCreatedPage accountCreatedPage;
    protected ContactUpPage contactUpPage;
    protected ProductsPage productsPage;

    @BeforeTest
    public void Setup()
    {
        driver= new ChromeDriver();
        homepage= new HomePage(driver);
        loginpage= new LoginSignupPage(driver);
        enterAccountInformationPage = new EnterAccountInformationPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
        contactUpPage = new ContactUpPage(driver);
        productsPage = new ProductsPage(driver);
        driver.get("http://automationexercise.com");
    }
    @AfterTest
    public void CloseDriver()
    {
        driver.quit();
    }
}
