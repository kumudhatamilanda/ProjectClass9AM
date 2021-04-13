package org.parallel;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	private void tc10() {
	System.out.println("method 10");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
	System.out.println("method 11");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc21() {
	System.out.println("method 21");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc31() {
	System.out.println("method 31");
	System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc41() {
	System.out.println("method 41");
	System.out.println(Thread.currentThread().getId());
	}

}
