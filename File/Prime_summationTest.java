package com.taskss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class task5Test {	

	@Test
	void isPrimeTest() {
		task5 c=new task5();
		
		assertAll(
				()->assertEquals(false, c.isPrime(1)),
				()->assertEquals(true, c.isPrime(2)),
				()->assertEquals(false, c.isPrime(4))				
				);
		
		
	}

}
