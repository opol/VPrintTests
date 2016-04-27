package pageobject.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.pages.BlogPage;
import pageobject.pages.WorkPage;

import pageobject.testbase.TestBase;

import java.text.ParseException;

/**
 * Created by Ulyana_Opolska on 4/22/2016.
 */
public class BlogPageTest extends TestBase {

    @Test
    public void verifyArticlesSorting() throws ParseException {
        BlogPage blogPage = header.clickOnBlogTab();
        Assert.assertTrue(blogPage.returnDatesPublished(), "Articles are not sorted by DatePublished Descending");

    }
    @Test
    public void verifySearch() throws ParseException, InterruptedException {
        BlogPage blogPage = header.clickOnBlogTab();
        Assert.assertTrue(blogPage.searchVerification(), "Search does not work");
    }



}
