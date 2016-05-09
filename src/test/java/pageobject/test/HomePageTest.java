package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.testbase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class HomePageTest extends TestBase {

    @Test(priority = 1)
    public void isHomeHeroImageDisplayed () {
        Assert.assertEquals(homePage.getHomeHeroImageUrl(), "url(\"http://www.villageprint.com/wp-content/uploads/2015/11/VPM_Website_Header_1920x900_95.jpg\")", " Hero image is not displayed or source is incorrect");
    }
    @Test(priority = 2)
    public void isHomePageText1DisplayedAndCorrect () {
        Assert.assertTrue(homePage.isHomePageText1Displayed(), "HomePageText1 is not displayed");
        Assert.assertEquals(homePage.isHomePageText1Correct(), "Manhattan’s most innovative creative solutions agency.", "HomePageText1 is not correct");

    }

    @Test(priority = 3)
    public void verifyRequestAQuoteBtn (){
        Assert.assertTrue(homePage.requestAQuoteBtnDisplayed(), "requestAQuoteBtn is not displayed");
        Assert.assertEquals(homePage.requestAQuoteBtnAttributeVerification(),"http://www.villageprint.com/request-a-quote/","requestAQuoteBtn attribute is incorrect");
        Assert.assertEquals(homePage.requestAQuoteBtnTextVerification(),"REQUEST A QUOTE", "requestAQuoteBtn link text is incorrect");
    }
}
