package onlineclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingValidation {
  @Test
  public void test1() {
	  String mystr="harikrish";
	  Assert.assertTrue(mystr.contains("hari"),"Name is matching");
  }
  @Test
  public void test2() {
	  String mystr="hari";
	  Assert.assertTrue(mystr.contains("harikrishh"),"Name is not matching");
  }
  @Test
  public void test3() {
	  Assert.assertEquals(5, 6, "Dropdown count does not match please check with developer");
  }
  @Test
  public void test4() {
	  Assert.assertEquals(5, 5, "Dropdown count does match please check with developer");
  }
}