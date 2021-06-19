package com.ugurhmz.jsftest.mvc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;




@ManagedBean
@RequestScoped
public class AdderBean {

	private double leftNumber;
	private double rightNumber;
	private double sumNumbers;
	
	public AdderBean() {
		
		
	}

	// GETTER & SETTER
	public double getLeftNumber() {
		return leftNumber;
	}

	public void setLeftNumber(double leftNumber) {
		this.leftNumber = leftNumber;
	}

	public double getRightNumber() {
		return rightNumber;
	}

	public void setRightNumber(double rightNumber) {
		this.rightNumber = rightNumber;
	}

	public double getSumNumbers() {
		return sumNumbers;
	}
	
	// ADD
	public void add () {
		this.sumNumbers = leftNumber+rightNumber;		
	}
	
}
