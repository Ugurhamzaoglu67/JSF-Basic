package com.ugurhmz.jsftest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class TestBean {

	private String result;

	
	public TestBean() {
		result = "Life is Good";
	}
	
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	
}
