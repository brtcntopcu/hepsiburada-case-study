package tests;

import base.TestBase;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.ProductSearchResultPage;

public class MainTest extends TestBase {

    public static String SEARCH_ITEM_KEYWORD = "nevresim";
    public static String THANK_MESSAGE_RATE_REVIEW = "Teşekkür Ederiz.";

    @Test
    public void rateReviewTest() {
        HomePage homePage = new HomePage(driver);
        ProductSearchResultPage productSearchResults = new ProductSearchResultPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);

        homePage.searchProduct(SEARCH_ITEM_KEYWORD);
        productSearchResults.clickFirstItem();
        productDetailPage.clickProductReviewsTab();
        if(!productDetailPage.commentCount().equals("Değerlendirmeler (0)")) {
            productDetailPage.clickFirstThumbsUp();
            Assert.assertEquals(THANK_MESSAGE_RATE_REVIEW, productDetailPage.ratingReviewThanksMessageVisibility());
        }
    }
}
