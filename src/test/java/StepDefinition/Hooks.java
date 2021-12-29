package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static helpers.utilClasses.BrowserUtil.whenDriverIsInitialized;
import static helpers.utilClasses.BrowserUtil.whenDriverIsQuit;

public class Hooks {

    @Before
    public void initializeDriver(){
        whenDriverIsInitialized();
    }

    @After
    public void afterMethod(){
        whenDriverIsQuit();
    }

}
