package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;

import static helpers.utilClasses.BrowserUtil.theUrl;
import static helpers.utilClasses.BrowserUtil.whenUrlIsLaunched;

public class Common {

    @Given("^the user launch the url$")
    public void theUserLaunchTheUrl(DataTable aDataTable) {
        List<String> myDataList = aDataTable.asList(String.class);
        theUrl = myDataList.get(0);
        whenUrlIsLaunched(theUrl);
    }

}
