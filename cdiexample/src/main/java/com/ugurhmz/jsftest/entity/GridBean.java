package com.ugurhmz.jsftest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class GridBean {
	
	private List<Data> dataList;

	
	public GridBean() {
		dataList = new ArrayList<Data>();
		dataList.add(new Data(10,"Veri 2",5.2));
		dataList.add(new Data(11,"Veri 3",6.2));
		dataList.add(new Data(12,"Veri 4",7.2));
		
	}
	
	
	public List<Data> getDataList() {
		return dataList;
	}
	

}
