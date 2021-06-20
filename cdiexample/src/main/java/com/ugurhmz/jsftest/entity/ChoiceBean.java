package com.ugurhmz.jsftest.entity;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ChoiceBean {

	private long selectedDataId;
	private long[] selectedDataIds;
	private boolean dataSelected;
	private Type selectedType;
	

	public ChoiceBean() {
		//selectedDataId = 37; // Varsayılan olarak bu seçilsin diyoruz.
		
	}
	
	// GET DATA LIST
	public List<Data> getDataList(){
		List<Data> dataList =  new ArrayList<>();
		dataList.add(new Data(35,"Data 35",1.15));
		dataList.add(new Data(36,"Data 36",2.15));
		dataList.add(new Data(37,"Data 37",3.15));
		dataList.add(new Data(38,"Data 38",4.15));
		
		return dataList;
	}

	
	// GETTER & SETTER
	public long getSelectedDataId() {
		return selectedDataId;
	}

	public void setSelectedDataId(long selectedDataId) {
		this.selectedDataId = selectedDataId;
	}
	
	public long[] getSelectedDataIds() {
		return selectedDataIds;
	}


	public void setSelectedDataIds(long[] selectedDataIds) {
		this.selectedDataIds = selectedDataIds;
	}
		
	public boolean isDataSelected() {
		return dataSelected;
	}

	public void setDataSelected(boolean dataSelected) {
		this.dataSelected = dataSelected;
	}

	
	public Type getSelectedType() {
		return selectedType;
	}

	public void setSelectedType(Type selectedType) {
		this.selectedType = selectedType;
	}

	// GET TYPES
	public Type[] getTypes() {
		return Type.values();
	}
	
		
		
	// SAVE 
	public void save() {
		System.out.println("Seçilen ID : "+selectedDataId);
		System.out.println("Seçilenler ID : ");
		for(long dataId : selectedDataIds) {
			System.out.println(dataId);
		}
		
		System.out.println("Veri Seçildi : "+dataSelected);
		System.out.println("Tür Seçildi : "+selectedType);
		
	}
	
	
	
	
}


