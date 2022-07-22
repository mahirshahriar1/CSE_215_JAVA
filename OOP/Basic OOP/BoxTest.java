package com.mahir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoxTest {

	Box c;
	
		
	@Test
	void volumeTest() {
		c=new Box(3);
		assertEquals(27.0, c.volume());
	}
	
	@Test
	void toStringTest()
	{
		c=new Box(1,2,3);
		assertEquals("Height : 2.0, Width : 1.0, Depth : 3.0", c.toString());
	}
	
	@Test
	void equalToTest()
	{
		c=new Box(1,5,3);
		Box o=new Box(1,5,3);
		assertEquals(true, c.equalTo(o));
	}

}
