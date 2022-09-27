package pages;

import base.PageBase;
import org.openqa.selenium.WebDriver;

public class ProductSearchResultPage extends PageBase {
    public static String FIRST_ITEM_ID = "i0";
    public ProductSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickFirstItem() {
        clickById(FIRST_ITEM_ID);
        changeTab();
    }

}
