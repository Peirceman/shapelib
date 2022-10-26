package com.Peirceman.shapelib;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	@Test
	public void testCollision() {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		assertTrue(c1.collides(c2));
	}
}

