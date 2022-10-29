package com.Peirceman.shapelib;

import java.awt.Graphics2D;

public class Circle implements Shape {
	private Point center;
	private final double radius;

	public Circle(double centerX, double centerY, double radius) {
		this.center = new Point(centerX, centerY);
		this.radius = radius;
	}

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public boolean collides(Shape s) {
		if (s instanceof Circle c) {
			return this.center.distance(c.center) < this.radius + c.radius;
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

	public Point getCenter() {
		return this.center;
	}

	public double getRadius() {
		return this.radius;
	}
}
