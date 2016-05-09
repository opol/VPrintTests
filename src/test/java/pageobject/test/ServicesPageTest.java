package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.pages.ServicesPage;
import pageobject.testbase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/21/2016.
 */
public class ServicesPageTest extends TestBase {

    @Test(priority = 1)
    public void is2ndSlideImageDisplayed () {
        ServicesPage servicesPage = header.clickOnServicesTab();
        Assert.assertEquals(servicesPage.get2ndSlideImageUrl(), "url(\"http://www.villageprint.com/wp-content/uploads/2015/11/VPM_Website_Slider_Work_1920x900_Calgon_50.jpg\")",
                "Second slide image is not displayed or source is incorrect");
    }

    @Test(priority = 2)
    public void isDigitalPrintingmenuCorrect (){
        ServicesPage servicesPage = header.clickOnServicesTab();
        System.out.println(servicesPage.getlistval());
    }
}
