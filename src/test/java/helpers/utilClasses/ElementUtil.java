package helpers.utilClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static helpers.utilClasses.BrowserUtil.theDriver;

public class ElementUtil {

    public static void whenElementIsClicked(String aLocator) throws Exception {
        findWebElement(aLocator).click();
    }

    public static WebElement findWebElement(String aLocator) throws Exception {
        waitUntilElementsIsPresent(20, aLocator);
        return theDriver.findElement(By.xpath(aLocator));
    }

    public static void getTextFromElement(String aLocator) throws Exception {
        findWebElement(aLocator).getText();
    }

    public static void whenElementFromListIsClickedBasedOnIndex(String aLocator, int anIndex)
    {
        List<WebElement> myElements = theDriver.findElements(By.xpath(aLocator));
        myElements.get(anIndex).click();
    }

    public static void waitUntilElementsIsPresent(int seconds, String aLocator) throws Exception {
        WebDriverWait myWait = new WebDriverWait(theDriver, seconds);
        myWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(aLocator)));
    }

}
