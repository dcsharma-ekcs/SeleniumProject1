import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String ProjrctPath = System.getProperty("user.dir");
		
		System.out.println("ProjectPath:"+ProjrctPath);
		
		//System.setProperty("webdriver.gecko.driver", ProjrctPath+"\\drivers\\geckodriver\\geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", ProjrctPath+"\\drivers\\chromedriver92\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://selenium.dev/");
				
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
