package com.simp.entity;

public class Sp_Cart {
	int cid;
	String cName;
	String cPrice;
	int cNumber;
	String cSmalplan;
	String cTotalprice;
	String cDiscount;
	Sp_User uid;
	Sp_Product pid;
	int cStatus;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcPrice() {
		return cPrice;
	}
	public void setcPrice(String cPrice) {
		this.cPrice = cPrice;
	}
	public int getcNumber() {
		return cNumber;
	}
	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}
	public String getcSmalplan() {
		return cSmalplan;
	}
	public void setcSmalplan(String cSmalplan) {
		this.cSmalplan = cSmalplan;
	}
	public String getcTotalprice() {
		return cTotalprice;
	}
	public void setcTotalprice(String cTotalprice) {
		this.cTotalprice = cTotalprice;
	}
	public String getcDiscount() {
		return cDiscount;
	}
	public void setcDiscount(String cDiscount) {
		this.cDiscount = cDiscount;
	}
	public Sp_User getUid() {
		return uid;
	}
	public void setUid(Sp_User uid) {
		this.uid = uid;
	}
	public Sp_Product getPid() {
		return pid;
	}
	public void setPid(Sp_Product pid) {
		this.pid = pid;
	}
	public int getcStatus() {
		return cStatus;
	}
	public void setcStatus(int cStatus) {
		this.cStatus = cStatus;
	}
	
	
	
}
