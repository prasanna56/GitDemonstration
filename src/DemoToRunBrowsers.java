import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoToRunBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///for each and every browser there are different  classes
		///webdriver.gecko.driver    webdriver.ie.driver
		//to invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		// create Driver object for  chrome browser
		
		WebDriver driver = new ChromeDriver();
		System.out.println("chrome browser opened");
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
        WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("https://www.google.com/");
        System.out.println("firefox browser opened");
		System.out.println(firefoxdriver.getTitle());
		firefoxdriver.close();
		
//        WebDriver iedriver = new InternetExplorerDriver();
//		iedriver.get("https://www.google.com/");
//        System.out.println("InternetExplorer browser opened");
//		System.out.println(iedriver.getTitle());
//		iedriver.close();
		

	}

}
