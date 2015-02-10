package com.springorm.entity;

public class SchoolDetails {
	
	private int school_code;
	
	public int getSchool_code() {
		return school_code;
	}
	public void setSchool_code(int school_code) {
		this.school_code = school_code;
	}
	private String district;
	private String area;
	private String school_Name;
	private String address;
	private Long telephone;
	private Long fax;
	private String email_Id;
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSchool_Name() {
		return school_Name;
	}
	public void setSchool_Name(String school_Name) {
		this.school_Name = school_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public Long getFax() {
		return fax;
	}
	public void setFax(Long fax) {
		this.fax = fax;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	
	
	

}
