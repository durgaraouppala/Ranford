package testngpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeOptions {
	private static final String CAPABILITY = null;

	@Test
	public void f()
	{
		String pathToChrome = "E:\\Durga_maven\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", pathToChrome);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String chromeProfile = "C:\\Users\\SIVA\\AppData\\Local\\Google\\Chrome\\User Data\\Default";
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfile);
		capabilities.setCapability("chrome.switches", switches);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
	}
}
