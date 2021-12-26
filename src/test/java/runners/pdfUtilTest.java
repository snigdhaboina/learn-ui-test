package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/pdfUtil.feature",
        glue= {"StepDefinition"},
        strict= true,
        monochrome= true
        ,plugin={"pretty"}
)

public class pdfUtilTest {

}

//feature, glue, strict , dryrun, monochrome, plugin, tag
