package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {


    @Before
    public void initializeDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/panda/Documents/learn-ui-test/src/test/resources/driver/chromedriver");
    }

    @After
    public void afterMethod(){
        System.out.println("End of execution");
    }

}
