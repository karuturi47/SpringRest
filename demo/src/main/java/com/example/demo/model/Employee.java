package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3202955133986487852L;
	@Id
	@Column(name = "EMP_ID", nullable = false)
	public long EmpId;
	@Column(name = "EMP_FNAME")
	public String EmpFName;
	@Column(name = "EMP_LNAME")
	public String EmpLName;
	@Column(name = "EMP_PHONE")
	public String EmpPhnNum;
	@Column(name = "EMP_EMAIL")
	public String EmpEmail;
	@Column(name = "EMP_ADDRESS")
	public String EmpAdd;

	public Employee() {
		super();
	}

	public Employee(long empId, String empFName, String empLName, String empPhnNum, String empEmail, String empAdd) {
		super();
		EmpId = empId;
		EmpFName = empFName;
		EmpLName = empLName;
		EmpPhnNum = empPhnNum;
		EmpEmail = empEmail;
		EmpAdd = empAdd;
	}

	public long getEmpId() {
		return EmpId;
	}

	public void setEmpId(long empId) {
		EmpId = empId;
	}

	public String getEmpFName() {
		return EmpFName;
	}

	public void setEmpFName(String empFName) {
		EmpFName = empFName;
	}

	public String getEmpLName() {
		return EmpLName;
	}

	public void setEmpLName(String empLName) {
		EmpLName = empLName;
	}

	public String getEmpPhnNum() {
		return EmpPhnNum;
	}

	public void setEmpPhnNum(String empPhnNum) {
		EmpPhnNum = empPhnNum;
	}

	public String getEmpEmail() {
		return EmpEmail;
	}

	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public String getEmpAdd() {
		return EmpAdd;
	}

	public void setEmpAdd(String empAdd) {
		EmpAdd = empAdd;
	}

}
