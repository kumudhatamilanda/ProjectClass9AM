package org.group;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Group {
@Test
private void tc0() {
String s ="abcdef";
System.out.println(s);
SoftAssert sa = new SoftAssert();
sa.assertEquals("Abcdef", s);
sa.assertAll();
System.out.println("Assert Fails");
}

@Test
private void tc1() {
System.out.println("end");
}
}
