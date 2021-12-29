package helpers.utilClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

    public static WebDriver driver;
    public static String theUrl;
    private BrowserUtil(WebDriver driver) {
        this.driver = driver;
    }

    public static void whenDriverIsInitialized()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/panda/Documents/learn-ui-test/src/test/java/helpers/driver/chromedriver");
        driver = new ChromeDriver();
    }

    public static void whenUrlIsLaunched(String url)
    {
        driver.get(theUrl);
        driver.manage().window().maximize();
    }

    public static void whenDriverIsQuit()
    {
        driver.quit();
    }
}
