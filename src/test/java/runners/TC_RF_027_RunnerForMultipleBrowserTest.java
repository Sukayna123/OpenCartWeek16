package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utility.BasicDriver;

public class TC_RF_027_RunnerForMultipleBrowserTest {

    @CucumberOptions(
            features = {"src/test/java/featureFiles/TC_RF_027.feature"},
            glue = {"stepDefinitions"}
    )

    public class RunnerForMultipleBrowserTest extends AbstractTestNGCucumberTests {
        @BeforeClass
        @Parameters(value = "browser")
        public void beforeClass(String browserName) {
            BasicDriver.setThreadDriverName(browserName);
        }
    }
}
