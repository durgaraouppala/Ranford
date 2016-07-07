package Samplemaven.sample;

import org.testng.annotations.Test;

public class NewTestMaven {
  @Test
  public void f() {
	  String valuefrommaven = System.getProperty("propertyName");
	  System.out.println(valuefrommaven);
  }
}
