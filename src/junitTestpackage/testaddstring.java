package junitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		junitFunctions jUnit = new junitFunctions();
		String result = jUnit.addStrings("a", "b");
		assertEquals ("ab", result);
	}
}