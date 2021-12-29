package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Amazon.feature",
        glue= {"StepDefinition"},
        strict= true,
        monochrome= true
        ,plugin={"pretty"}
)

public class AmazonTest {

}
