package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjecs;

public class Test_GoogleSearch {

	
	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		
		
		googleSearchText();

	}
	
	public static void googleSearchText() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		GoogleSearchPageObjecs searchPageObjecs = new GoogleSearchPageObjecs(driver);
		
		searchPageObjecs.setTextInSearchBox("A B C D");
		
		searchPageObjecs.clickSearchButton();
		
		driver.close();
		
	}

}
