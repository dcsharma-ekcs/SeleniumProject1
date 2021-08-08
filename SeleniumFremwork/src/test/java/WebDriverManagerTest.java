import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.phantomjs().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.chromiumdriver().setup();
		*/
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		//WebDriverManager.iedriver().setup();
		//WebDriver driver = new InternetExplorerDriver();

		
		driver.get("https://google.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@title='Search']"));
		
		textBox.sendKeys("Automation Step by..");
		
		//Thread.sleep(3000);
		
		//driver.close();
		
	}

}
