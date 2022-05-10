package runners;

import cucumber.api.CucumberOptions;
import tests.TestBase;
@CucumberOptions(features = "E:\\mostafa\\.1testing\\selenium-framework\\src\\test\\java\\features"
,glue = {"steps"}
,plugin = {"pretty","html:target/cucumber-html-report"}
)
public class TestRunner extends TestBase {

}
