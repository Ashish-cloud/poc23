package com.racksapace.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="registration")

public class RegDto {
	@javax.persistence.Id
	
	@Column(name="CId")
	public int Id;
    public String cname;
    public String Gender;
    public String city;
    public String Account_Type;
    public String MailID;
    public String Phone_Number;
	
		// TODO Auto-generated constructor stub
	public RegDto(int id, String cname, String gender, String city, String account_Type, String mailID,
			String phone_Number) {
		super();
		Id = id;
		this.cname = cname;
		Gender = gender;
		this.city = city;
		Account_Type = account_Type;
		MailID = mailID;
		Phone_Number = phone_Number;
	}
	
	public RegDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		MailID = mailID;
	}
	public String getPhone_Number() {
		return Phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}
    

}
