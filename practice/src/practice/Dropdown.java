package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("*****"));
		Select x=new Select(ele);
		java.util.List<WebElement> y=x.getOptions();
		for(WebElement x1:y)
		{
			if(x1.getText().equalsIgnoreCase("y"))
			{
				x1.click();
			}
		}

	}

}
