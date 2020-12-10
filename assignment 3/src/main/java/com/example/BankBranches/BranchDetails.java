package com.example.BankBranches;

public class BranchDetails {
	
	private String address;
	private long phoneNum;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public BranchDetails(String address, long phoneNum) {
		super();
		this.address = address;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "BranchDetails [address=" + address + ", phoneNum=" + phoneNum + "]";
	}

}
