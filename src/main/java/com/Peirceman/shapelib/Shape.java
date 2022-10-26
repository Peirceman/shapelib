package com.Peirceman.shapelib;

import java.awt.Graphics2D;

public interface Shape {
	public boolean collides(Shape s);
	public double getArea();
	public double getPermiter();
	public void draw(Graphics2D g2d);
}

