package com.spring.SpringInitializingCollections;

import java.util.List;

public class Triangle {
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	void draw() {
		
		for(Point point:points) {
			System.out.println(point.getX()+","+point.getY());
		}
	}
}
