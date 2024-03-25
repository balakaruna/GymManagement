package entity;

import java.util.Date;

public class member {
	 
	int trainerId;
	String name;
	String dob;
	String address;
	long phn;
	String email;
	
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(int trainerId, String name, String dob, String address, long phn, String email) {
		super();
		this.trainerId = trainerId;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.phn = phn;
		this.email = email;
	}
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhn() {
		return phn;
	}
	public void setPhn(long phn) {
		this.phn = phn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
