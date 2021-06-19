package com.ugurhmz.jsftest;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;



@Named
@RequestScoped
public class TestBean {

	private String result;

	
	public TestBean() {
		result = "Hello Boston";
	}
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	
}
