package com.example.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AddressImpl implements Address {
	
	@Value("seru veedu")
	private String add1;
	@Value("Raji veedu")
	private String add2;
	@Value("7569")
	private int contact;

	public AddressImpl() {
		super();
	}

	public AddressImpl(String add1, String add2, int contact) {
		super();
		this.add1 = add1;
		this.add2 = add2;
		this.contact = contact;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee Address:"+add1+" "+add2+" "+"\nContact:"+contact;
	}

	@Override
	public String getAddressDetails() {
		// TODO Auto-generated method stub
		return toString();
	}
	
}
