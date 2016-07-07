package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
	  List<WebElement> rows = driver.findElements(By.cssSelector(".grid_16.alpha>table>tbody"));
	  System.out.println("Total number of rows :"+ rows.size());
	  driver.quit();

  }
}
