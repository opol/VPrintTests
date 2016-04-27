package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Ulyana_Opolska on 4/21/2016.
 */
public class ServicesPage extends Page {

    @FindBy(xpath = ".//*[@id='post-4548']/div/div[1]/div/div[3]/a[2]")
    private WebElement secondRoundBtn;

    @FindBy(xpath = ".//*[@id='post-4548']/div/div[1]/div/div[1]/div[2]")
    private WebElement secondSlideImage;

    @FindBy(xpath = ".//*[@id='post-4548']/div/div[2]/div[2]/div[1]/div[1]/h5")
    private WebElement digitalPrintingBtn;

    @FindBy(xpath = ".//*[@id='post-4548']/div/div[2]/div[2]/div[1]/div[1]/div/ul")
    private WebElement digitalPrintingMenu;


    public ServicesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String get2ndSlideImageUrl (){
        secondRoundBtn.click();
        return secondSlideImage.getCssValue("background-image");
    }

    public List<WebElement> getlistval (){
        digitalPrintingBtn.click();
        List<WebElement> list = webDriver.findElement(By.xpath(".//*[@id='post-4548']/div/div[2]/div[2]/div[1]/div[1]/div/ul")).findElements(By.tagName("li"));
        //List<WebElement> DigitalPrintingMenu = webDriver.findElements(By.xpath("./[@id='post-4548']/div/div[2]/div[2]/div[1]/div[1]/div/ul/li"));
        for (WebElement element: list){
            System.out.println(element.getText());
        }
        return list;
    }
}
