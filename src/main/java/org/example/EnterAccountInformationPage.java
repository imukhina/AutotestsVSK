package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.example.Constant.enterRassword1;

public class EnterAccountInformationPage extends BasePage{

    private By passwordInputXpath = By.xpath("//input[@data-qa='password']");
    private By daysInputXpath = By.xpath("//select[@data-qa='days']");
    private By monthsInputXpath = By.xpath("//select[@data-qa='months']");
    private By yearsInputXpath = By.xpath("//select[@data-qa='years']");
    private By checkboxSignUpForOurNewsletterXpath = By.xpath("//input[@id='newsletter']");
    private By checkboxReceiveSpecialOffersFromOurPartnersXpath = By.xpath("//input[@id='optin']");
    private By inputFirstNameXpath = By.xpath("//input[@id='first_name']");
    private By inputLastNameXpath = By.xpath("//input[@id='last_name']");
    private By inputAddress1Xpath = By.xpath("//input[@id='address1']");
    private By inputCountryXpath = By.xpath("//select[@data-qa='country']");
    private By inputStateXpath = By.xpath("//input[@data-qa='state']");
    private By inputCityXpath = By.xpath("//input[@data-qa='city']");
    private By inputZipcodeXpath = By.xpath("//input[@data-qa='zipcode']");
    private By inputMobileNumberXpath = By.xpath("//input[@data-qa='mobile_number']");
    private By buttonCreateAccountXpath = By.xpath("//button[@data-qa='create-account']");

    public WebElement genderInput = driver.findElement(By.xpath("//input[@id='id_gender1']"));
    private WebElement passwordInput = driver.findElement(passwordInputXpath);
    private WebElement daysInput = driver.findElement(daysInputXpath);
    private WebElement monthsInput = driver.findElement(monthsInputXpath);
    private WebElement yearsInput = driver.findElement(yearsInputXpath);
    private WebElement checkboxSignUpForOurNewsletter = driver.findElement(checkboxSignUpForOurNewsletterXpath);
    private WebElement checkboxReceiveSpecialOffersFromOurPartners = driver.findElement(checkboxReceiveSpecialOffersFromOurPartnersXpath);
    private WebElement inputFirstName = driver.findElement(inputFirstNameXpath);
    private WebElement inputLastName = driver.findElement(inputLastNameXpath);
    private WebElement inputAddress1 = driver.findElement(inputAddress1Xpath);
    private WebElement inputCountry = driver.findElement(inputCountryXpath);
    private WebElement inputState = driver.findElement(inputStateXpath);
    private WebElement inputCity = driver.findElement(inputCityXpath);
    private WebElement inputZipcode = driver.findElement(inputZipcodeXpath);
    private WebElement inputMobileNumber = driver.findElement(inputMobileNumberXpath);
    private WebElement buttonCreateAccount = driver.findElement(buttonCreateAccountXpath);


    public EnterAccountInformationPage (WebDriver driver)
    {
        super(driver);
    }
    public void FillInInformation()
    {
        //Выбираем пол и пароль
        genderInput.click();
        passwordInput.sendKeys(enterRassword1);
        //Выбираем дату рождения
        var selectDays = new Select(daysInput);
        selectDays.selectByValue("6");

        var selectMonths = new Select(monthsInput);
        selectMonths.selectByValue("6");

        var selectYear = new Select(yearsInput);
        selectYear.selectByValue("2001");

        //Два чекбокса
        checkboxSignUpForOurNewsletter.click();
        checkboxReceiveSpecialOffersFromOurPartners.click();

        //Address Information
        inputFirstName.sendKeys("Василий");
        inputLastName.sendKeys("Иванов");
        inputAddress1.sendKeys("Иваново, Ленина 6");

        var selectCountry = new Select(inputCountry);
        selectCountry.selectByValue("India");

        inputState.sendKeys("First");
        inputCity.sendKeys("Deli");
        inputZipcode.sendKeys("452315");
        inputMobileNumber.sendKeys("8532266622");

        buttonCreateAccount.click();
    }
}
