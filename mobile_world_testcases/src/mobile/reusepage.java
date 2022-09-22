package mobile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

public class reusepage {
	WebDriver driver;
	public actionspage actionspage;
	public WebDriver basetest()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asa.ajay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","C:\\Users\\asa.ajay\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		return driver;
	}
	@BeforeMethod
	public actionspage launchapp()
	{
		driver = basetest();
		actionspage =new actionspage (driver);
		actionspage.open_mobileworld();
		return actionspage;
	}

}
