package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomshoping {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement siginingin;
	
	@FindBy(id="email")
	public WebElement emailid;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="SubmitLogin")
	public WebElement siginin;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	public WebElement perform;
	
	@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
	public WebElement casualdress;
	
	@FindBy(xpath="//form[@method='post']")
	public WebElement scrollview;
	
	@FindBy(xpath="//img[@title='Printed Dress']")
	public WebElement img;

	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	public WebElement switchtoframe;
	
	@FindBy(xpath="(//a[@data-field-qty='qty'])[2]")
	public WebElement addqty;
	
	@FindBy(xpath="//select[@class='form-control attribute_select no-print']")
	public WebElement size;
	
	@FindBy(xpath="//button[@class='exclusive']")
	public WebElement cartadd;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	public WebElement addcartsummary ;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	public WebElement checksummary ;
	
	@FindBy(name="message")
	public WebElement message ;
	
	@FindBy(name="processAddress")
	public WebElement addresscon ;
	
	@FindBy(id="cgv")
	public WebElement track;
	
	@FindBy(name="processCarrier")
	public WebElement trackid ;
	
	@FindBy(xpath="//a[@class='bankwire']")
	public WebElement bankchoose ;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement sumbit;
	
	@FindBy(className="logout")
	public WebElement logout;

	public pomshoping(WebDriver driver2) {
		this.driver=driver2;
PageFactory.initElements(driver2, this);
}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSiginingin() {
		return siginingin;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSiginin() {
		return siginin;
	}

	public WebElement getPerform() {
		return perform;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getScrollview() {
		return scrollview;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getSwitchtoframe() {
		return switchtoframe;
	}

	public WebElement getAddqty() {
		return addqty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getCartadd() {
		return cartadd;
	}

	public WebElement getAddcartsummary() {
		return addcartsummary;
	}

	public WebElement getChecksummary() {
		return checksummary;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getAddresscon() {
		return addresscon;
	}

	public WebElement getTrack() {
		return track;
	}

	public WebElement getTrackid() {
		return trackid;
	}

	public WebElement getBankchoose() {
		return bankchoose;
	}

	public WebElement getSumbit() {
		return sumbit;
	}

	public WebElement getLogout() {
		return logout;
	}
	






}