package HelpPackge;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUsableMet {
	public static WebDriver driver;
	public static void openVoyaah() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nb21049\\Desktop\\naveena\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://web-int.stg.voyaah.com/#/");
	}
	public static void closeVoyaah()
	{
		driver.close();
	}
	}
	


