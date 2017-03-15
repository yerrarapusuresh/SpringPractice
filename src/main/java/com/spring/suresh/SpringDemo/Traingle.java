package com.spring.suresh.SpringDemo;

import java.util.List;

public class Traingle {
	
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	
	public Point getPointOne() {
		return pointOne;
	}
	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}
	public Point getPointTwo() {
		return pointTwo;
	}
	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}
	public Point getPointThree() {
		return pointThree;
	}
	public void setPointThree(Point pointThree) {
		this.pointThree = pointThree;
	}
	
	public void draw() {
		System.out.println("( "+pointOne+" "+pointTwo+" "+pointThree+" )");
	}

}
