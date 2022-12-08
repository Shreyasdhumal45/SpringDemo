package com.demo;

public class Employee {

	private int id;
private String acType;
private String no;

private Account ac;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Account getAc() {
		return ac;
	}

	public void setAc(Account ac) {
		this.ac = ac;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", acType=" + acType + ", no=" + no + ", ac=" + ac + "]";
	}
	
	
}
