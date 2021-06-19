package com.ugurhmz.jsftest.entity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;




@ManagedBean
@RequestScoped
public class FormBean {

	private Data data;

	
	
	public FormBean() {
		data = new Data(1,"My Data",35.2);
	}
	
	
	// ONLY GETTER
	public Data getData() {
		return data;
	}
	
	public void perform() {
		
		System.out.println("Veri işleniyor : "+
				data.getDataId()+" "+
				data.getDataName()+" "+
				data.getDataValue());	
	}
	
	
}
