package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import static org.example.Constant.enterRassword1;

public class EnterAccountInformationPage extends BasePage{

    public EnterAccountInformationPage (WebDriver driver)
    {
        super(driver);
    }

    public void FillInInformation()
    {
        var genderInput = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        var passwordInput = driver.findElement(By.xpath("//input[@data-qa='password']"));
        var daysInput = driver.findElement(By.xpath("//select[@data-qa='days']"));
        var monthsInput = driver.findElement(By.xpath("//select[@data-qa='months']"));
        var yearsInput = driver.findElement(By.xpath("//select[@data-qa='years']"));
        var checkboxSignUpForOurNewsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        var checkboxReceiveSpecialOffersFromOurPartners = driver.findElement(By.xpath("//input[@id='optin']"));
        var inputFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        var inputLastName = driver.findElement(By.xpath("//input[@id='last_name']"));
        var inputAddress1 = driver.findElement(By.xpath("//input[@id='address1']"));
        var inputCountry = driver.findElement(By.xpath("//select[@data-qa='country']"));
        var inputState = driver.findElement(By.xpath("//input[@data-qa='state']"));
        var inputCity = driver.findElement(By.xpath("//input[@data-qa='city']"));
        var inputZipcode = driver.findElement(By.xpath("//input[@data-qa='zipcode']"));
        var inputMobileNumber = driver.findElement(By.xpath("//input[@data-qa='mobile_number']"));
        var buttonCreateAccount = driver.findElement(By.xpath("//button[@data-qa='create-account']"));

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
