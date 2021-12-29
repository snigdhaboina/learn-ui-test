package helpers.utilClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserUtil {

    public static WebDriver theDriver;
    public static String theUrl;

    public static void whenDriverIsInitialized()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/panda/Documents/learn-ui-test/src/test/java/helpers/driver/chromedriver");
        theDriver = new ChromeDriver();
    }

    public static void whenUrlIsLaunched(String url)
    {
        theDriver.get(theUrl);
        theDriver.manage().window().maximize();
    }

    public static void waitNumberOfSecondsPassed(int seconds) throws InterruptedException {
        theDriver.wait(seconds);
    }

    public static void waitUntilPageIsLoaded(int seconds) throws Exception {
        theDriver.manage().timeouts().pageLoadTimeout(seconds, TimeUnit.SECONDS);
    }

    public static void waitUntilAllElementsOnPageAreLoaded(int seconds) throws Exception {
        theDriver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static String getTitleOfThePage() throws Exception {
        waitUntilPageIsLoaded(20);
        return theDriver.getTitle();
    }

    public static void whenBrowserIsClosed() {
        theDriver.close();
    }

    public static void whenDriverIsQuit()
    {
        theDriver.quit();
    }

}
