package org.parallel;

import org.testng.annotations.Test;

public class ParallelExecution {
@Test
private void tc0() {
System.out.println("method 1");
System.out.println(Thread.currentThread().getId());
}

@Test
private void tc1() {
System.out.println("method 2");
System.out.println(Thread.currentThread().getId());
}

@Test
private void tc2() {
System.out.println("method 3");
System.out.println(Thread.currentThread().getId());
}

@Test
private void tc3() {
System.out.println("method 4");
System.out.println(Thread.currentThread().getId());
}

@Test
private void tc4() {
System.out.println("method 5");
System.out.println(Thread.currentThread().getId());
}

}
