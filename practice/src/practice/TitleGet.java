package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleGet {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("durgaraouppala529@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("Durga8688632343");
		driver.findElement(By.id("signIn")).click();
		String str=driver.getTitle();
				
		if(str.contains("Gmail"))
		{
			System.out.println("title is there");
		}
		else
		{
			System.out.println("title is not there");
		}
		
		driver.quit();

	}

}
