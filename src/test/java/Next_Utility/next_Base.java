package Next_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class next_Base {
	
	public static WebDriver driver;
	public static Properties nextPro;

	public next_Base() {
		try {
			FileInputStream nextfile = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Next_Config//next_config.properties"));
			 nextPro = new Properties();
			 nextPro.load(nextfile);
		} catch (FileNotFoundException e) {
			System.out.println("Please look the code");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Please look the code");
			e.printStackTrace();
		}
	}
	public void nextBrowser() {
		String nextAllbrowser = nextPro.getProperty("nextBrowser1"); 
		if(nextAllbrowser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+ ("//NEXTeTICKET//Next_ChromeDriver//chromedriver.exe"));
			  ChromeOptions nextBrow = new ChromeOptions();
			  nextBrow.addArguments("--remote-allow-origins=*");
			  
			  driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(next_utiliti.pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(next_utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
		      }
		else if(nextAllbrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.edge.driver", System.getProperty("user.dir")+ ("//NEXTeTICKET//Next_EdgeDriver//msedgedriver.exe"));
			  ChromeOptions nextBrow2 = new ChromeOptions();
			  nextBrow2.addArguments("--remote-allow-origins=*");
			  
			  driver= new ChromeDriver();
			  
			  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(next_utiliti.pageLoadTimeout));   
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(next_utiliti.implicitlyWait)); 
			  driver.manage().window().maximize(); 
		}
	}
	public void nextLaunchurl(String url) {
		driver.get(nextPro.getProperty("nextURL"));
	}
}












