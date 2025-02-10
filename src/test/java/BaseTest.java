import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected LoginSignupPage loginPage;
    protected EnterAccountInformationPage enterAccountInformationPage;
    protected AccountCreatedPage accountCreatedPage;
    protected ContactUpPage contactUpPage;
    protected ProductsPage productsPage;

    @BeforeTest
    public void Setup()
    {
        driver= new ChromeDriver();
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        loginPage = new LoginSignupPage(driver);
        enterAccountInformationPage = new EnterAccountInformationPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
        contactUpPage = new ContactUpPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @AfterTest
    public void CloseDriver()
    {
        driver.quit();
    }
}
