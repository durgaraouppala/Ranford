package practice;


import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileOperations {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("http://money.rediff.com/");
	        
		WebElement element=driver.findElement(By.id("allpage_links"));

		List<WebElement> rowCollection=element.findElements(By.xpath("//*[@id='allpage_links']/tbody/tr"));


		System.out.println("Numer of rows in this table: "+rowCollection.size());
		
		//Here i_RowNum and i_ColNum, i am using to indicate Row and Column numbers. It may or may not be required in real-time Test Cases.       
		
		int i_RowNum=1;

		for(WebElement rowElement:rowCollection)
		{

		      List<WebElement> colCollection=rowElement.findElements(By.xpath("td"));
		      int i_ColNum=1;
		      for(WebElement colElement:colCollection)
		      {
		           System.out.println("Row "+i_RowNum+" Column "+i_ColNum+" Data "+colElement.getText());
		           i_ColNum=i_ColNum+1;
		      }
		    i_RowNum=i_RowNum+1;
		}
	 	driver.close();

	}

}
