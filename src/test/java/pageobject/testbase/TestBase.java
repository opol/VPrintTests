package pageobject.testbase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageobject.pages.HeaderPage;
import pageobject.pages.HomePage;
import pageobject.webdriver.WebDriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class TestBase {
    protected WebDriver webDriver;
    protected HomePage homePage;
    protected HeaderPage header;

    @BeforeMethod
    @Parameters({ "browserName", "baseUrl" })
    public void setup(String browserName, String baseUrl) throws Exception {
        webDriver = WebDriverFactory.getInstance(browserName);
        webDriver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        // webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.get(baseUrl);
        header = PageFactory.initElements(webDriver, HeaderPage.class);
        homePage = PageFactory.initElements(webDriver, HomePage.class);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("D:\\Automation\\PageObjectModel\\VillagePrint\\Screenshots\\" + System.currentTimeMillis() + ".png"));
        if (webDriver != null) {
            WebDriverFactory.killDriverInstance();
        }
    }
}
