package com.Peirceman.shapelib;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

public class AppTest {
	@Test
	public void testCircleCollision() {
		Circle c1 = new Circle(10.0, 10.0, 10.0);
		Circle c2 = new Circle(0.0, 0.0, 100.0);
		assertTrue(c1.collides(c2));

		c1 = new Circle(20.0, 30.0, 1.0);
		c2 = new Circle(30.0, 20.0, 1.0);
		assertFalse(c2.collides(c1));
	}
}

