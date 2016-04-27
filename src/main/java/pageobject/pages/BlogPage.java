package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ulyana_Opolska on 4/22/2016.
 */
public class BlogPage extends Page {

    @FindBy(id = "s")
    private WebElement searchFld;

    @FindBy(id = "searchsubmit")
    private WebElement searchSubmitBtn;

    /*@FindBy(partialLinkText = "Dear Moleskine Notebook")
    private WebElement searchSubmitBtn;*/

    @FindBy(id = "main-content")
    private WebElement mainContentPage;

    @FindBy(tagName = "a")
    private WebElement allLinks;

    @FindBy(className = "published")
    private WebElement datePublished;


    public BlogPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean searchVerification() throws InterruptedException {
        CharSequence articleName = "Dear Moleskine Notebook";
        boolean isArticleCorrect = true;
        searchFld.clear();
        searchFld.sendKeys(articleName);
        searchSubmitBtn.click();
        List<WebElement> links = webDriver.findElements(By.tagName("a"));
        for (WebElement elem : links) {
            String linkText = elem.getText();
            if (linkText.contains(articleName) == true) {
                isArticleCorrect = true;
                break;
            } else {
                isArticleCorrect = false;
            }
        }
        return isArticleCorrect;
    }

    public boolean returnDatesPublished() throws ParseException {
        boolean datesSorting = false;
        Date datePublished = null;
        String datePattern = "MMM dd, yyyy";
        List<WebElement> dates = webDriver.findElements(By.className("published"));
        List<Date> dateList = new ArrayList<Date>();
        for (WebElement elem : dates) {

            String dateStr = elem.getText();
            DateFormat dateForm = new SimpleDateFormat(datePattern);

            datePublished = dateForm.parse(dateStr);

            dateList.add(datePublished);
        }

        Date firstDate = dateList.get(0);
        for (int i = 1; i < dateList.size(); i++
                ) {
            /*System.out.println(firstDate + " "+ dateList.get(i));
            System.out.println(firstDate.compareTo(dateList.get(i)));*/
            if (firstDate.compareTo(dateList.get(i)) >=0 ) {
                datesSorting = true;
            } else {
                datesSorting = false;
            }
            firstDate = dateList.get(i);
        }

        return datesSorting;


    }
}
