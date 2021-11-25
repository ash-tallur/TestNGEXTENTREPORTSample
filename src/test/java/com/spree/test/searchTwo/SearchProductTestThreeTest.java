package com.spree.test.searchTwo;

import com.spree.core.BaseTest;
import com.spree.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchProductTestThreeTest extends BaseTest {

    @Test
    public void ShouldGetProductsMatchingSearchTextRubyDup1(){
        LandingPage landingPage =new LandingPage(driver);
        landingPage.searchProduct("ruby");
        Assert.assertEquals(landingPage.getSearchResultsTitle(), "Search results for 'Ruby'");
    }

    @Test
    public void ShouldGetProductsMatchingSearchTextRailsDup2(){
        LandingPage landingPage =new LandingPage(driver);
        landingPage.searchProduct("rails");
        Assert.assertEquals(landingPage.getSearchResultsTitle(), "Search results for 'rails'");
    }
}
