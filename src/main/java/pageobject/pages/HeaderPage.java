package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ulyana_Opolska on 4/20/2016.
 */
public class HeaderPage extends Page {

    @FindBy(id = "main-header")
    WebElement headerElem;

    @FindBy(id = "logo")
    private WebElement logoImage;

    /*@FindBy(xpath = "//a[@href=\"http://www.villageprint.com\"]")
    WebElement logoLink;*/

    @FindBy(xpath = ".//*[@id='menu-item-47']/a")
    WebElement homeTab;

    @FindBy(xpath = ".//*[@id='menu-item-71']/a")
    private WebElement aboutTab;

    @FindBy(xpath = ".//*[@id='menu-item-4557']/a")
    private WebElement servicesTab;

    @FindBy(xpath = ".//*[@id='menu-item-4572']/a")
    private WebElement workTab;

    @FindBy(xpath = ".//*[@id='menu-item-4526']/a")
    private WebElement blogTab;

    @FindBy(xpath = ".//*[@id='menu-item-4827']/a")
    private WebElement contactTab;

    public HeaderPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean logoImageVerification() {
        return logoImage.isDisplayed();
    }

    public String logoLinkAttributeVerification (){
        return logoImage.getAttribute("href");
    }

    public boolean homeTabIsDisplayed() {
        return homeTab.isDisplayed();}

    public String homeLinkAttributeVerification (){
        return homeTab.getAttribute("href");
    }

    public String homeLinkTextVerification (){
        return homeTab.getText();
    }

    public boolean aboutTabIsDisplayed() {
        return aboutTab.isDisplayed();}

    public String aboutLinkAttributeVerification (){
        return aboutTab.getAttribute("href");
    }

    public String aboutLinkTextVerification (){
        return aboutTab.getText();
    }

    public boolean servicesTabIsDisplayed() {
        return servicesTab.isDisplayed();}

    public String servicesLinkAttributeVerification (){
        return servicesTab.getAttribute("href");
    }

    public String servicesLinkTextVerification (){
        return servicesTab.getText();
    }


    public boolean workTabIsDisplayed() {
        return workTab.isDisplayed();}

    public String workLinkAttributeVerification (){
        return workTab.getAttribute("href");
    }

    public String workLinkTextVerification (){
        return workTab.getText();
    }

    public boolean blogTabIsDisplayed() {
        return blogTab.isDisplayed();}

    public String blogLinkAttributeVerification (){
        return blogTab.getAttribute("href");
    }

    public String blogLinkTextVerification (){
        return blogTab.getText();
    }

    public boolean contactTabIsDisplayed() {
        return contactTab.isDisplayed();}

    public String contactLinkAttributeVerification (){
        return contactTab.getAttribute("href");
    }

    public String contactLinkTextVerification (){
        return contactTab.getText();
    }



    public AboutPage clickOnAboutTab() {
        aboutTab.click();
        return PageFactory.initElements(webDriver, AboutPage.class);
    }

    public ServicesPage clickOnServicesTab() {
        servicesTab.click();
        return PageFactory.initElements(webDriver, ServicesPage.class);
    }

    public WorkPage clickOnWorkTab() {
        workTab.click();
        return PageFactory.initElements(webDriver, WorkPage.class);
    }

    public BlogPage clickOnBlogTab() {
        blogTab.click();
        return PageFactory.initElements(webDriver, BlogPage.class);
    }

    public ContactPage clickOnContactTab() {
        contactTab.click();
        return PageFactory.initElements(webDriver, ContactPage.class);
    }


}
