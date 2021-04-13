package org.parallel;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	private void tc02() {
	System.out.println("method 02");
	System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc12() {
	System.out.println("method 12");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc22() {
	System.out.println("method 22");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc32() {
	System.out.println("method 32");
	System.out.println(Thread.currentThread().getId());
	}
@Test
private void tc42() {
System.out.println("method 42");
System.out.println(Thread.currentThread().getId());
}

}
