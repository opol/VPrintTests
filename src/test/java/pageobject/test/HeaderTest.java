package pageobject.test;

import org.apache.log4j.Logger;
import pageobject.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class HeaderTest extends TestBase {
    private Logger log = Logger.getLogger(this.getClass());

    @Test(priority = 1)
    public void verifyLogo() {
        Assert.assertTrue(header.logoImageVerification(), "Logo image is not displayed");
        //Assert.assertEquals(header.logoLinkAttributeVerification(),"http://www.villageprint.com/", "Logo link attribute is incorrect");
        log.info("Verified logo image on Header");
    }

    @Test(priority = 2)
    public void verifyHomeTab() {
        Assert.assertTrue(header.homeTabIsDisplayed(), "Home tab is not displayed");
        Assert.assertEquals(header.homeLinkAttributeVerification(),"http://www.villageprint.com/","Home tab link attribute is incorrect");
        Assert.assertEquals(header.homeLinkTextVerification(),"HOME", "Home tab link text is incorrect");
        log.info("Verified Home tab on Header");
    }

    @Test(priority = 3)
    public void verifyAboutTab (){
        Assert.assertTrue(header.aboutTabIsDisplayed(), "about tab is not displayed");
        Assert.assertEquals(header.aboutLinkAttributeVerification(),"http://www.villageprint.com/about/","about tab link attribute is incorrect");
        Assert.assertEquals(header.aboutLinkTextVerification(),"ABOUT", "about tab link text is incorrect");
        log.info("Verified About tab on Header");
    }

    @Test(priority = 4)
    public void verifyServicesTab (){
        Assert.assertTrue(header.servicesTabIsDisplayed(), "services tab is not displayed");
        Assert.assertEquals(header.servicesLinkAttributeVerification(),"http://www.villageprint.com/services/","services tab link attribute is incorrect");
        Assert.assertEquals(header.servicesLinkTextVerification(),"SERVICES", "services tab link text is incorrect");
        log.info("Verified Services tab on Header");
    }

    @Test(priority = 5)
    public void verifyWorkTab (){
        Assert.assertTrue(header.workTabIsDisplayed(), "work tab is not displayed");
        Assert.assertEquals(header.workLinkAttributeVerification(),"http://www.villageprint.com/work/","work tab link attribute is incorrect");
        Assert.assertEquals(header.workLinkTextVerification(),"WORK", "work tab link text is incorrect");
        log.info("Verified Work tab on Header");
    }

    @Test(priority = 6)
    public void verifyBlogTab (){
        Assert.assertTrue(header.blogTabIsDisplayed(), "Blog tab is not displayed");
        Assert.assertEquals(header.blogLinkAttributeVerification(),"http://www.villageprint.com/blog/","Blog tab link attribute is incorrect");
        Assert.assertEquals(header.blogLinkTextVerification(),"BLOG", "Blog tab link text is incorrect");
        log.info("Verified Blog tab on Header");
    }

    @Test(priority = 7)
    public void verifyContactTab (){
        Assert.assertTrue(header.contactTabIsDisplayed(), "contact tab is not displayed");
        Assert.assertEquals(header.contactLinkAttributeVerification(),"http://www.villageprint.com/contact/","contact tab link attribute is incorrect");
        Assert.assertEquals(header.contactLinkTextVerification(),"CONTACT", "contact tab link text is incorrect");
        log.info("Verified Contact tab on Header");
    }
}
