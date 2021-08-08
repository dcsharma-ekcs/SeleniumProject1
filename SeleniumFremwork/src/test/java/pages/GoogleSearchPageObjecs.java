package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjecs {
	
	WebDriver driver = null;
	
	By textboxe_search = By.name("q");
	By button_search = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	
	public GoogleSearchPageObjecs(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textboxe_search).sendKeys(text);
	}
	
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	
	

}
