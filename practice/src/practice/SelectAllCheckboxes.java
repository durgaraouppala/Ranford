package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllCheckboxes {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		WebElement cheBox=(WebElement) driver.findElement(By.xpath("//htmltag[@attribute='checkBox']"));
		
		//for(int i=0;i<cheBox.size();i++)
		{
			//cheBox.get(i).click();
		}

	}

}
