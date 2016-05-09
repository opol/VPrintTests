package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.pages.AboutPage;
import pageobject.testbase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class AboutPageTest extends TestBase {

    @Test(priority = 1)
    public void verifyVideoFrame () {
        AboutPage aboutPage = header.clickOnAboutTab();
        Assert.assertTrue(aboutPage.isVideoFrameDisplayed(), "Video Iframe is not displayed");
        Assert.assertTrue(aboutPage.isVideoPreloadDisplayed(), "Video Preload is not displayed");
        Assert.assertTrue(aboutPage.isPlayBtnDisplayed(), "PlayBtn is not displayed");
    }

    @Test(priority = 2)
            public void verifyServicesLink() {
        AboutPage aboutPage = header.clickOnAboutTab();
        //Assert.assertTrue(aboutPage.servicesLinkVerification(), "ServicesLink is not displayed");
        Assert.assertTrue(aboutPage.servicesLinkDisplayed(), "servicesLink is not displayed");
        Assert.assertEquals(aboutPage.servicesLinkAttributeVerification(),"http://www.villageprint.com/services/","servicesLink attribute is incorrect");
        Assert.assertEquals(aboutPage.servicesLinkTextVerification(),"Services,", "services link text is incorrect");
    }
}
