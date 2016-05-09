package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import pageobject.pages.ContactPage;

import pageobject.testbase.TestBase;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Ulyana_Opolska on 4/25/2016.
 */
public class ContactPageTest extends TestBase {

  private Logger log = Logger.getLogger(this.getClass());

    @Step
    @Test(priority = 1)
    public void verifyRequiredFieldsMainValidation() {
        ContactPage contactPage = header.clickOnContactTab();
        Assert.assertTrue(contactPage.isMainValidationErrDisplayed(), "Main validation message is not displayed");
        Assert.assertEquals(contactPage.isMainValidationErrCorect(), "There was a problem with your submission. Errors have been highlighted below.",
                "Main validation message is incorrect");
        log.info("Verified main validation message on Contact page");

    }

    @Test(enabled = false, priority = 2)
    public void verifyRequiredNameFieldsValidation() {
        ContactPage contactPage = header.clickOnContactTab();
        Assert.assertTrue(contactPage.isNameValidationErrDisplayed(), "Name validation message is not displayed");
        Assert.assertEquals(contactPage.isNameValidationErrCorect(), "This field is required.",
                "Name validation message is incorrect");
        log.info("Verified Name validation message on Contact page");
    }

    @Test(enabled = false,priority = 3)
    public void verifyRequiredEmailFieldValidation() {
        ContactPage contactPage = header.clickOnContactTab();
        Assert.assertTrue(contactPage.isEmailValidationErrDisplayed(), "Email validation message is not displayed");
        Assert.assertEquals(contactPage.isEmailValidationErrCorect(), "This field is required.",
                "Email validation message is incorrect");
        log.info("Verified Email validation message on Contact page");
    }

}
