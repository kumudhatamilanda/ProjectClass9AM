package org.group;

import org.testng.annotations.Test;

public class Smoke {
@Test(groups= {"smoke"})
private void tc0() {
System.out.println("Method 1");
}

@Test(groups= {"smoke","sanity"})
private void tc1() {
System.out.println("Method 2");
}

@Test(groups= {"reg"},dependsOnGroups= {"smoke"},alwaysRun = true)
private void tc2() {
System.out.println("Method 3");
}

@Test(groups= {"retest"},dependsOnGroups= {"smoke"},alwaysRun = true)
private void tc3() {
System.out.println("Method 4");
}

@Test(groups= {"E2E"})
private void tc4() {
System.out.println("Method 5");
}

}
