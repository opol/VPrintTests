package listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


import pageobject.webdriver.WebDriverFactory;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
/**
 * Created by Ulyana_Opolska on 4/29/2016.
 */
public class OnTestFailureListener extends TestListenerAdapter {
    public void onTestFailure(ITestResult arg0) {
        testScreenshotOnFinish(WebDriverFactory.getInitDriver());
    }

    @Step("Screenshot")
    public void testScreenshotOnFinish(WebDriver driver) {
        getScreenshot(driver);
    }

    @Attachment(value = "Screenshot after test", type = "image/png")
    public byte[] getScreenshot(WebDriver driver) {
        File screenshot =
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] screen = null;
        try {
            screen = IOUtils.toByteArray(new FileInputStream(screenshot));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return screen;
    }
}
