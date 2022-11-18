package junitTestpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumber{

	@Test
	public void test() {
		junitFunctions jUnit = new junitFunctions();
		int result = jUnit.addNumbers(100, 200);
		assertEquals(300, result);
	}
}