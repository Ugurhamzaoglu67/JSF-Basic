package com.ugurhmz.jsftest.entity;




public class Data {
	
	private long dataId;
	private String dataName;
	private double dataValue;
	
	
	public Data() {
		
	}
	
	
	public Data(int dataId, String dataName, double dataValue) {
		this.dataId = dataId;
		this.dataName = dataName;
		this.dataValue = dataValue;
	}



	// GETTER & SETTER
	public long getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public double getDataValue() {
		return dataValue;
	}
	public void setDataValue(double dataValue) {
		this.dataValue = dataValue;
	}
	
	
}
