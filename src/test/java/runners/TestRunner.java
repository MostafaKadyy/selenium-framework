package runners;

import cucumber.api.CucumberOptions;
import tests.TestBase;
@CucumberOptions(features = "E:\\mostafa\\.1testing\\tef\\src\\test\\java\\features"
,glue = {"steps"}
,plugin = {"pretty","html:target/cucumber-html-report"}
)
public class TestRunner extends TestBase {

}
