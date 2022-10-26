package com.Peirceman.shapelib;

import java.awt.Graphics2D;

public class Circle implements Shape {



	public Circle(


	public boolean collides(Shape s) {
		if (s instanceof Circle c) {
		}
		assert false : "uknown shape " + s.getClass().getName();
		return true;
	}

	public double getArea() {
		assert false: "getArea is not implemented";
		return 0.0D;
	}

	public double getPermiter() {
		assert false: "getPermiter is not implemented";
		return 0.0D;
	}

	public void draw(Graphics2D g2d) {
		assert false: "draw is not implemented";
	}
}

