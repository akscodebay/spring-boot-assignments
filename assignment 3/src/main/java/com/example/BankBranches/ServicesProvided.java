package com.example.BankBranches;

public class ServicesProvided {
	
	private String serviceName;
	private String Desc;
	
	public ServicesProvided(String serviceName, String desc) {
		super();
		this.serviceName = serviceName;
		Desc = desc;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	
	@Override
	public String toString() {
		return "ServicesProvided [serviceName=" + serviceName + ", Desc=" + Desc + "]";
	}	

}
