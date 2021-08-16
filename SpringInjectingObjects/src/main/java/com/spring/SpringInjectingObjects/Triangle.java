package com.spring.SpringInjectingObjects;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	void draw() {
		
		System.out.println("Point A values "+getPointA().getX()+","+getPointA().getY());
		System.out.println("Point B values "+getPointB().getX()+","+getPointB().getY());
		System.out.println("Point C values "+getPointC().getX()+","+getPointC().getY());
	}
}
