package pages;

import base.PageBase;
import org.openqa.selenium.WebDriver;


public class HomePage extends PageBase {

    public static String SEARCH_BOX_XPATH = "//INPUT[@type='text']";
    // eğer sayfaya yeni bir input(type=text) eklenirse "INPUT[starts-with(@class,"desktopOldAutosuggestTheme")]" bu
    // kullanılabilir

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    WebDriver driver;

    public void searchProduct(String string) {
        clickByXpath(SEARCH_BOX_XPATH);
        sendKey(SEARCH_BOX_XPATH, string);
    }

}
