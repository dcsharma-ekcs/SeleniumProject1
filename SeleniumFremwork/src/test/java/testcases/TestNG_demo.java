package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjecs;

public class TestNG_demo {

	
	private WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.get("https://google.com/");
		
	}
	
	@Test
	public void googleSearchText() {	
				
		GoogleSearchPageObjecs searchPageObjecs = new GoogleSearchPageObjecs(driver);		
		searchPageObjecs.setTextInSearchBox("A B C D");		
		searchPageObjecs.clickSearchButton();
		
		
	}
	
	@AfterTest
	public void tearDownTest() {
		
		driver.close();
		driver.quit();
		System.out.println("Test Compleated Successfuly");
		
	}

}
