package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Ulyana_Opolska on 4/22/2016.
 */
public class WorkPage extends Page {

    @FindBy(xpath = ".//*[@id='post-4569']/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/a")
    private WebElement beautyBrochureLink;

    @FindBy(xpath = "html/body/div[2]/div/div[1]/div/figure/img")
    private WebElement beautyBrochurePicture;

    @FindBy(xpath = "html/body/div[2]/div/div[1]/div/button")
    private WebElement closeBtn;

    @FindBy(xpath = "html/body/div[2]/div/button[2]")
    private WebElement nextArrow;

    @FindBy(xpath = "html/body/div[2]/div/button[1]")
    private WebElement prevArrow;

    @FindBy(xpath = "html/body/div[2]/div/div[1]/div/figure/figcaption/div/div[1]")
    private WebElement imageSignature;

    @FindBy(xpath = "html/body/div[2]/div/div[1]/div/figure/figcaption/div/div[2]")
    private WebElement counter;


    public WorkPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isBeautyBroshureDisplayed() throws InterruptedException {
        beautyBrochureLink.click();
        //Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(beautyBrochurePicture));
        return beautyBrochurePicture.isDisplayed();
    }

    public boolean isCloseBtnDisplayed () {
        beautyBrochureLink.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(closeBtn));
        return closeBtn.isDisplayed();
    }

    public boolean closeBtnVerification (){
        closeBtn.click();
        return beautyBrochureLink.isDisplayed();
    }

    public boolean isNextArrowDisplayed (){
        beautyBrochureLink.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(nextArrow));
        return nextArrow.isDisplayed();
    }

    public boolean nextArrowVerification () {
        nextArrow.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(counter, "2 of 15"));
        return counter.isDisplayed();
    }

    public boolean isPrevArrowDisplayed () {
        beautyBrochureLink.click();
        return nextArrow.isDisplayed();
    }
//TODO: investigate
    /*public boolean prevArrowVerification () {
        prevArrow.click();
        WebDriverWait wait = new WebDriverWait(webDriver, 15);
        wait.until(ExpectedConditions.textToBePresentInElementValue(counter, "15 of 15"));
        if (counter.isDisplayed() *//*&&
                counter.getText() == "15 of 15"*//*){
        return true;}
        else {return false;}
    }*/

    public boolean imageSignatureVerification () {
        beautyBrochureLink.click();
        String signatureText = imageSignature.getText();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(imageSignature, signatureText));
        return true;
    }

    public boolean imageCounterVerification () {
        beautyBrochureLink.click();
        String counterText = counter.getText();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(counter, counterText));
        return true;
    }
}
