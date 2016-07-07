package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  WebElement ele=(WebElement) driver.findElements(By.tagName("a"));
	  System.out.println(ele.getSize());
//	  
//	  WebElement element=driver.findElement(By.xpath("/html/body/div/span/form[2]/div[1]/div[1]/div[3]/div[2]/ul/span[3]/li/a"));
//
//	  Actions act=new Actions(driver);
//	  act.moveToElement(element).build().perform();
//
//
//	  WebElement element2=driver.findElement(By.xpath("/html/body/div/span/form[2]/div[1]/div[1]/div[3]/div[2]/ul/span[3]/li/ul/span[1]/li/a"));
//	  Actions act1=new Actions(driver);
//	      //act1.click(element2);
//	  act1.moveToElement(element2).click(element2).build().perform();
  }
}
