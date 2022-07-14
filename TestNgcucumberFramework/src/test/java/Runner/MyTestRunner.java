package Runner;

import Base.CustomizeTestNGCucumberRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/org/features/VtigerContacts.feature",
		glue = {"stepDef","Hooks"},
		monochrome=true,
		dryRun=false,
//		tags="Smoke",
		plugin = {"pretty",
				"html:target/html_report/cucumber_reports.html",
				"junit:target/junit_report/junit_reports.xml",
				"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
//		format = {"pretty","html:report"} //for older versions
		)
public class MyTestRunner extends CustomizeTestNGCucumberRunner{
	
}