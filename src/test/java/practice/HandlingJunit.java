package practice;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.Assert;

public class HandlingJunit {
	@Test
	public void onetimesetup () {

	Assert.assertEquals("yahoo", "yahoo");
	}

	@BeforeClass
	public static void google() {
	Assert.assertEquals("google","google");
	}

	@Ignore
	public void facebook() {
	Assert.assertEquals("google","google");
	}
}
