package com.mahir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void test() {
		Task c=new Task();
		
		assertAll(
				()->assertEquals(true, c.isAnagram("cat", "act"), ()->"should be true"),
				()->assertEquals(false, c.isAnagram("cat", "dog"), ()->"should be false"),
				()->assertEquals(true, c.isAnagram("race", "care"), ()->"should be true")
				
				);
	}

}
