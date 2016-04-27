package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.pages.WorkPage;

import pageobject.testbase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/22/2016.
 */
public class WorkPageTest extends TestBase {

    @Test(enabled = false, priority=1)
    public void verifyBroshure() throws InterruptedException {
        WorkPage workPage = header.clickOnWorkTab();
        Assert.assertTrue(workPage.isBeautyBroshureDisplayed(), "Broshure is not displayed or source picture is incorrect");
    }

    @Test(enabled = false, priority=2)
    public void closeBtnVerification() {
        WorkPage workPage = header.clickOnWorkTab();
        Assert.assertTrue(workPage.isCloseBtnDisplayed(), "Close bnt is not displayed or disabled");
        Assert.assertTrue(workPage.closeBtnVerification(), "Close btn has closed the picture");
    }

    @Test(enabled = false,priority=3)
    public void nextArrowVerification() {
        WorkPage workPage = header.clickOnWorkTab();
        Assert.assertTrue(workPage.isNextArrowDisplayed(), "Next Arr is not displayed");
        Assert.assertTrue(workPage.nextArrowVerification(), "Next Arr does not work");
    }

    @Test(priority=4)
    public void prevArrowVerification() {
        WorkPage workPage = header.clickOnWorkTab();
        Assert.assertTrue(workPage.isPrevArrowDisplayed(), "Prev Arr is not displayed");
        //Assert.assertTrue(workPage.prevArrowVerification(), "Prev Arr does not work");
    }

    @Test(priority=5)
    public void imageSignatureVerification() throws InterruptedException {
        WorkPage workPage = header.clickOnWorkTab();
        //System.out.println("lala " + workPage.imageSignatureVerification());
        Assert.assertTrue(workPage.imageSignatureVerification(), "Image signature is incorrect");

    }

    @Test(priority=6)
    public void imageCounterVerification() {
        WorkPage workPage = header.clickOnWorkTab();
        Assert.assertTrue(workPage.imageCounterVerification(), "Image counter is incorrect");
    }
}
