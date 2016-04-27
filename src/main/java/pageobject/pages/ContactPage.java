package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

/**
 * Created by Ulyana_Opolska on 4/25/2016.
 */
public class ContactPage extends Page {
    private static Logger log = Logger.getLogger(ContactPage.class);

    @FindBy(id = "input_2_5_3")
    private WebElement firstNameFld;

    @FindBy(id = "input_2_5_6")
    private WebElement lastNameFld;

    @FindBy(id = "input_2_6")
    private WebElement emailFld;

    @FindBy(id = "input_2_3")
    private WebElement subjectFld;

    @FindBy(id = "input_2_4")
    private WebElement descriptionFld;

    @FindBy(xpath = ".//*[@id='gform_2']/div[1]")
    private WebElement mainValidationErr;

    @FindBy(xpath = ".//*[@id='field_2_5']/div[2]")
    private WebElement nameValidationErr;

    @FindBy(xpath = ".//*[@id='field_2_6']/div[2]")
    private WebElement emailValidationErr;

    @FindBy(id = "gform_submit_button_2")
    private WebElement submitBtn;

    public ContactPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isMainValidationErrDisplayed() {
        submitBtn.click();
        return mainValidationErr.isDisplayed();
    }

    public String isMainValidationErrCorect() {
        submitBtn.click();
        log.debug("Verified required validation message for Email field on Contact page");
        return mainValidationErr.getText();
    }

    public boolean isNameValidationErrDisplayed() {
        submitBtn.click();
        return nameValidationErr.isDisplayed();
    }

    public String isNameValidationErrCorect() {
        submitBtn.click();
        return nameValidationErr.getText();
    }

    public boolean isEmailValidationErrDisplayed() {
        submitBtn.click();
        return emailValidationErr.isDisplayed();
    }

    public String isEmailValidationErrCorect() {
        submitBtn.click();
        return emailValidationErr.getText();
    }



}
