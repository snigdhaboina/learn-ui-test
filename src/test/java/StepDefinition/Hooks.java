package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.utilClasses.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @Before
    public void initializeDriver(){
        BrowserUtil.whenDriverIsInitialized();
    }

    @After
    public void afterMethod(){
        BrowserUtil.whenDriverIsQuit();
    }

}
