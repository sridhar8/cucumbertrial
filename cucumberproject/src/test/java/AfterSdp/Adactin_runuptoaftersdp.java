package AfterSdp;


	import org.baseclass.adactin.BaseClass_Adactin;
	import org.openqa.selenium.By;
	import org.openqa.selenium.SearchContext;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.pomadactin.com.Address_page;
	import org.pomadactin.com.CheckinDetails_page;
	import org.pomadactin.com.Detailsconfirm_page;
	import org.pomadactin.com.Logout_page;
	import org.pomadactin.com.Signin_page;
import org.sdp.com.P_O_M_adactin;

	public class Adactin_runuptoaftersdp extends BaseClass_Adactin{
		public static WebDriver driver=BaseClass_Adactin.Search_Engine("chrome");
		public static P_O_M_adactin pom=new P_O_M_adactin(driver);
		
		Signin_page sign=new Signin_page(driver);
		CheckinDetails_page c_p = new CheckinDetails_page(driver);
		Detailsconfirm_page d_p=new Detailsconfirm_page(driver);
		Address_page a_p= new Address_page(driver);
		Logout_page logout=new Logout_page(driver);
		
		
//		public static WebDriver driver;
	public static void main(String[] args) {

//	Search_Engine("chrome");
	search_url("https://adactinhotelapp.com/index.php");	


	//WebElement username = driver.findElement(By.id("username"));
	inputvalue(pom.getInstanceSignin().getUsername(), "sridharKumar0220");

	//WebElement password = driver.findElement(By.id("password"));
	inputvalue(pom.getInstanceSignin().getPassword(),"Sri@8190");

	//WebElement login = driver.findElement(By.id("login"));
	clickonelement(pom.getInstanceSignin().getLogin());
	wait(5);


	//WebElement location = driver.findElement(By.id("location"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getLocation(), "Sydney");

	//WebElement hotels = driver.findElement(By.id("hotels"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getHotel(), "Hotel Creek");

	//WebElement room = driver.findElement(By.id("room_type"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getRoomtype(), "Standard");

	//WebElement roomcount = driver.findElement(By.id("room_nos"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getRoomnos(), "2");

	//WebElement adultcount = driver.findElement(By.id("adult_room"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getAdultrooms(), "2");

	//WebElement childcount = driver.findElement(By.id("child_room"));
	select("selectbyvalue", pom.getInstanceCheckindetails().getChildroom(), "2");

	//WebElement submit = driver.findElement(By.id("Submit"));
	clickonelement(pom.getInstanceCheckindetails().getSumbmit());
	wait(5);


	//WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));

	clickonelement(pom.getInstanceDetails().getRadiobutton());

	//WebElement contine = driver.findElement(By.id("continue"));
	clickonelement(pom.getInstanceDetails().getContine());
	wait(5);

	//WebElement firstname = driver.findElement(By.id("first_name"));
	inputvalue(pom.getInstanceAddress().getFirstname(),"sridhar");

	//WebElement lastname = driver.findElement(By.id("last_name"));
	inputvalue(pom.getInstanceAddress().getLastname(),"k");

	//WebElement address = driver.findElement(By.name("address"));
	inputvalue(pom.getInstanceAddress().getAddress(),"poror");

	//WebElement ccnum = driver.findElement(By.id("cc_num"));
	inputvalue(pom.getInstanceAddress().getCcnum(),"1234235432555685");

	//WebElement cc_type = driver.findElement(By.id("cc_type"));
	select("selectbyvalue", pom.getInstanceAddress().getCctype(), "AMEX");

	//WebElement ccexmon = driver.findElement(By.id("cc_exp_month"));
	select("selectbyvalue", pom.getInstanceAddress().getCcexmon(), "2");

	//WebElement ccexyr = driver.findElement(By.id("cc_exp_year"));
	select("selectbyvalue", pom.getInstanceAddress().getCcexpyr(), "2012");

	//WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
	inputvalue(pom.getInstanceAddress().getCvv(),"767");

	//WebElement book = driver.findElement(By.id("book_now"));
	clickonelement(pom.getInstanceAddress().getBooknow());
	wait(5);

	//WebElement logout = driver.findElement(By.id("logout"));
	clickonelement(pom.getInstanceLogout().getLogout());

	}


	}


