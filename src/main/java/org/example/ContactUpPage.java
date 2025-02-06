package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class ContactUpPage extends BasePage{
    public ContactUpPage(WebDriver driver)
    {
        super(driver);
    }
    public void FillInContactInformation()
    {
        var contactUpButton = driver.findElement(By.xpath("//a[@href=\"/contact_us\"]"));
        contactUpButton.click();

        var nameInput = driver.findElement(By.xpath("//input[@data-qa='name']"));
        nameInput.sendKeys("Name");

        var emailInput= driver.findElement(By.xpath("//input[@data-qa='email']"));
        emailInput.sendKeys("sdfgsdfg@hdf.lk");

        var subjectInput = driver.findElement(By.xpath("//input[@data-qa='subject']"));
        subjectInput.sendKeys("subject");

        var messageInput = driver.findElement(By.xpath("//textarea[@data-qa='message']"));
        messageInput.sendKeys("message messagemessagemessagemessagemessagemessage messagemessagemessagemessage ");

        var fileInput = driver.findElement(By.xpath("//input[@type='file']"));
        File uploadFile= new File("C:/For_tests/ddd.png");
        fileInput.sendKeys(uploadFile.getAbsolutePath());

        var submitButton = driver.findElement(By.xpath("//input[@data-qa='submit-button']"));
        submitButton.click();

        Alert alert= driver.switchTo().alert();
        var alertName= alert.getText();
        alert.accept();
    }

}
