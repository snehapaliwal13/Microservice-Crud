/**
 * sneha paliwal
 */
package com.restMicroCrud.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author admin
 *
 */
@Entity
@Table(name="USER")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USERID")
	private Integer userId;
	@Column(name="FIRSTNAME")
	private String firstName;
	@Column(name="LASTNAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="ADDRESSLINE1")
	private String addressLine1;
	@Column(name="ADDRESSLINE2")
	private String addressLine2;
	@Column(name="PHONENUMBER")
	private Long phoneNumber;
	@Column(name= "ACCOUNT_DETAILS")
	private String accountDetails;
	
	public String getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(String accountDetails) {
		this.accountDetails = accountDetails;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber=" + phoneNumber
				+ ", accountDetails=" + accountDetails + "]";
	}
	
	

	
	
	

}
