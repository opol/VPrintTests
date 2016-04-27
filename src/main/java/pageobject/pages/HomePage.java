package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageobject.pages.Page;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class HomePage extends Page {
    @FindBy(xpath = ".//*[@id='post-41']/div/div[1]/div/div/div")
    private WebElement homeHeroImage;


    @FindBy(xpath = ".//*[@id='react-root']/span/span/strong")
    private WebElement homePageText1;

    @FindBy(xpath = ".//*[@id='post-41']/div/div[3]/div/div/div[2]/a")
    private WebElement requestAQuoteBtn;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getHomeHeroImageUrl (){
       return homeHeroImage.getCssValue("background-image");
    }


    public boolean isHomePageText1Displayed() {
        return homePageText1.isDisplayed();
    }

    public String isHomePageText1Correct() {
        return homePageText1.getText();
    }


    public boolean requestAQuoteBtnDisplayed() {
        return requestAQuoteBtn.isDisplayed();}

    public String requestAQuoteBtnAttributeVerification (){
        return requestAQuoteBtn.getAttribute("href");
    }

    public String requestAQuoteBtnTextVerification (){
        return requestAQuoteBtn.getText();
    }


}
