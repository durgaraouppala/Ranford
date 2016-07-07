package testngpractice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Text {
  @Test
  public void f()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
	  WebDriverWait wait=new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gsc-i-id1")));

 // Waiting 30 seconds for an element to be present on the page, checking
 
  // for its presence once every 5 seconds.
	  Wait wait1 = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
 
 
	  driver.get("http://www.gmail.com");
	  //WebElement cssValue= driver.findElement(By.xpath("//input[@id='Email']"));
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("document.getElementById('Email').value='durgaraouppala'");
		 
  }
}
