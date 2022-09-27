package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class PageBase {
    WebDriverWait wait ;
    WebDriver driver ;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickByXpath(String elementXpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath))).click();
    }

    public void clickById(String elementId) {
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId))).click();
    }

    public void clickByClassName(String elementId) {
        WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.className(elementId)));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();
    }

    public void sendKey(String elementId, String value) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId))).sendKeys(value + Keys.ENTER);
    }

    public void changeTab() {
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
    }

    public void scrollUntilFind(String elementId) {
        WebElement Element = driver.findElement(By.id(elementId));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public String getElementTextById(String elementId) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId))).getText();
    }

    public String getElementTextByClassName(String elementId) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(elementId))).getText();
    }
}
