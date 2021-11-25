package com.spree.test.searchOne;

import com.spree.core.BaseTest;
import com.spree.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

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
