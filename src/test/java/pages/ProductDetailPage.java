package pages;

import base.PageBase;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends PageBase {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public static String PRODUCT_REVIEWS_TAB_ID = "reviewsTabTrigger";
    public static String PRODUCT_REVIEWS_TAB_THUMBSUPS_CLASS_NAME = "thumbsUp";
    public static String THANKS_MESSAGE_AFTER_RATING_REVIEW_CLASS_NAME = "hermes-ReviewCard-module-eFtSSTU4lYZLCnzHtzca";


    public void clickProductReviewsTab() {
        scrollUntilFind(PRODUCT_REVIEWS_TAB_ID);
        clickById(PRODUCT_REVIEWS_TAB_ID);
    }

    public String commentCount() {
        return getElementTextById(PRODUCT_REVIEWS_TAB_ID);
    }

    public void clickFirstThumbsUp() {
        clickByClassName(PRODUCT_REVIEWS_TAB_THUMBSUPS_CLASS_NAME); // class'ın ilk elemanına tıklar
    }

    public String ratingReviewThanksMessageVisibility() {
        return getElementTextByClassName(THANKS_MESSAGE_AFTER_RATING_REVIEW_CLASS_NAME);
    }

}
