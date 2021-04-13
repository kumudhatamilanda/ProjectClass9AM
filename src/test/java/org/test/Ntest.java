package org.test;

import org.testng.annotations.Test;

public class Ntest {
@Test(priority = 10, enabled = false)
private void test1() {
System.out.println("hoooiiiii");
}

@Test(priority = -10, invocationCount = 2)
private void test2() {
	System.out.println("mass ah");
}

@Test(priority = -5)
private void test3() {
	System.out.println("captain ah");
}

@Test(priority = -7)
private void test4() {
	System.out.println("geth ah");
}

@Test
private void test5() {
	System.out.println("oooohhhhh");
}
}

