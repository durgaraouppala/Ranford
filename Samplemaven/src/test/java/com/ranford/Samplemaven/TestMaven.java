package com.ranford.Samplemaven;

import org.testng.annotations.Test;

public class TestMaven {
  @Test
  public void f() {
	  String valuefrommaven = System.getProperty("propertyName");
	  System.out.println(valuefrommaven);
  }
}
