package com.spree.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spree.pages.LandingPage;

public class SearchProductTestOneTest extends BaseTest {

    @Test
    public void ShouldGetProductsMatchingSearchTextRuby(){
        LandingPage landingPage =new LandingPage(driver);
        landingPage.searchProduct("ruby");
        Assert.assertEquals(landingPage.getSearchResultsTitle(), "Search results for 'ruby'");
    }

    @Test
    public void ShouldGetProductsMatchingSearchTextRails(){
        LandingPage landingPage =new LandingPage(driver);
        landingPage.searchProduct("rails");
        Assert.assertEquals(landingPage.getSearchResultsTitle(), "Search results for 'rails' ");
    }
}
