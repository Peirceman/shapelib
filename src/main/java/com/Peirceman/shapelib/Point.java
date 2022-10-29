package com.Peirceman.shapelib;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return this.x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return this.y;
	}

	public double distanceSquared(Point p) {
		return Math.pow(Math.abs(this.x - p.x), 2) + Math.pow(Math.abs(this.y - p.y), 2);
	}

	public double distance(Point p) {
		return Math.sqrt(distanceSquared(p));
	}
}

