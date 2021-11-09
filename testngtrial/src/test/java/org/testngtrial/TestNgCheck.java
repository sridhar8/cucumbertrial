package org.testngtrial;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pomclass.pomshoping;

public class TestNgCheck extends BaseClass{
	
	
	
	
	public static WebDriver driver=BaseClass.Search_Engine("chrome");	
	public static pomshoping pom=new pomshoping(driver);
	@Test
	private void sample() {
		
		clickonelement(pom.getSiginingin());
		inputvalue(pom.getEmailid(), "greens@gmail.com");
		inputvalue(pom.getPassword(), "Ashur@12345");
		clickonelement(pom.getSiginin());
		
		wait(4);
		action(pom.perform, "onlyperform");
		clickonelement(pom.getCasualdress());
		wait(5);
		javascriptelement(pom.getScrollview());
		clickonelement(pom.getImg());
		wait(4);
		int frame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(frame);
		switchToFramebyElement(pom.getSwitchtoframe());
		clickonelement(pom.getAddqty());
		clickonelement(pom.getAddqty());
		select("selectbyvalue", pom.getSize(), "2");
		clickonelement(pom.getCartadd());
		switchintoDefaultFrame();
		wait(5);
		clickonelement(pom.getAddcartsummary());
		wait(4);
		javascriptelement(pom.getChecksummary());
		clickonelement(pom.getChecksummary());
		wait(5);
		javascriptelement(pom.getMessage());
		inputvalue(pom.getMessage(), "Hi");
		clickonelement(pom.getAddresscon());
		wait(4);
		javascriptelement(pom.getTrack());
		clickonelement(pom.getTrack());
		clickonelement(pom.getTrackid());
		wait(4);
		javascriptelement(pom.getBankchoose());
		clickonelement(pom.getBankchoose());
		wait(5);
		clickonelement(pom.getSumbit());
	}

	@BeforeMethod
	private void searchEngine() {
		get_url("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	private void closed() {
		close();
	}
}
