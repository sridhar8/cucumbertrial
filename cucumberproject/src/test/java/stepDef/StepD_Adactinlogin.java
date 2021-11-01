package stepDef;

import org.baseclass.adactin.BaseClass_Adactin;
import org.openqa.selenium.WebDriver;
import org.sdp.com.P_O_M_adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.RunnerClasss;

public class StepD_Adactinlogin extends BaseClass_Adactin {

	public static WebDriver driver=RunnerClasss.driver;
	public static P_O_M_adactin pom=new P_O_M_adactin(driver);

@Given("^User Is Entering The Login page$")
public void user_Is_Entering_The_Login_page() throws Throwable {
	wait(5);
	System.out.println("welcome mayil");
	search_url("https://adactinhotelapp.com/index.php");
	
}

@When("^User Typing The Valid Username \"([^\"]*)\"$")
public void user_Typing_The_Valid_Username(String arg1) throws Throwable {
	inputvalue(pom.getInstanceSignin().getUsername(), "sridharKumar0220");
}

@When("^User Typing The Valid Password \"([^\"]*)\"$")
public void user_Typing_The_Valid_Password(String arg1) throws Throwable {
	inputvalue(pom.getInstanceSignin().getPassword(),"Sri@8190");
}

@Then("^The User Click On The Login Btn User Navigated To Homepage$")
public void the_User_Click_On_The_Login_Btn_User_Navigated_To_Homepage() throws Throwable {
	clickonelement(pom.getInstanceSignin().getLogin());
}

}
