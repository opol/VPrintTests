package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class AboutPage extends Page {

    @FindBy(id = "fitvid0")
    private WebElement videoIFrame;

    @FindBy(xpath = ".//*[@id='player']/div[5]/div[2]/button")
    private WebElement playBtn;

    @FindBy(xpath = ".//*[@id='player']/div[1]/div/div/video")
    private WebElement videoPreload;

    @FindBy(xpath = ".//*[@id='post-60']/div/div[2]/div/div/div/p[1]/a")
    private WebElement servicesLink;

    public AboutPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isVideoFrameDisplayed () {
       return videoIFrame.isDisplayed();
    }

    public boolean isVideoPreloadDisplayed (){
        return videoPreload.isDisplayed();
    }


    public boolean servicesLinkDisplayed() {
        return servicesLink.isDisplayed();}

    public String servicesLinkAttributeVerification (){
        return servicesLink.getAttribute("href");
    }

    public String servicesLinkTextVerification (){
        return servicesLink.getText();
    }

    public boolean isPlayBtnDisplayed (){
        try {
            webDriver.switchTo().frame(videoIFrame);
            return playBtn.isDisplayed();
        } catch (Exception e) {
            return false;
        } finally {
            webDriver.switchTo().defaultContent();
        }
    }
}
