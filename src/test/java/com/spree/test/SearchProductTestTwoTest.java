package com.spree.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spree.pages.LandingPage;

public class SearchProductTestTwoTest extends BaseTest {

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
