package runner;

import org.baseclass.adactin.BaseClass_Adactin;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featurefile\\opengooglee.feature",
glue ="stepDef",
plugin = {"html:Report/HtmlReport"},
monochrome = true
)

public class RunnerClasss {
	
public static WebDriver driver;

@BeforeClass
public static void setup() {
driver=BaseClass_Adactin.Search_Engine("chrome");
}

@AfterClass
public static void tear_down() {
driver.close();
}


//It should combine the feature file and the step definition (stepD)



}





