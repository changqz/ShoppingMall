package com.simp.entity;

public class Sp_Order {
	int oid;
	String oName;
	String oImage;
	String oPrice;
	String oNumber;
	String oTotalprice;
	Sp_Product pid;
	Sp_User uid;
	int oStatus;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	public String getoImage() {
		return oImage;
	}
	public void setoImage(String oImage) {
		this.oImage = oImage;
	}
	public String getoPrice() {
		return oPrice;
	}
	public void setoPrice(String oPrice) {
		this.oPrice = oPrice;
	}
	public String getoNumber() {
		return oNumber;
	}
	public void setoNumber(String oNumber) {
		this.oNumber = oNumber;
	}
	public String getoTotalprice() {
		return oTotalprice;
	}
	public void setoTotalprice(String oTotalprice) {
		this.oTotalprice = oTotalprice;
	}
	
	public Sp_Product getPid() {
		return pid;
	}
	public void setPid(Sp_Product pid) {
		this.pid = pid;
	}
	public Sp_User getUid() {
		return uid;
	}
	public void setUid(Sp_User uid) {
		this.uid = uid;
	}
	public int getoStatus() {
		return oStatus;
	}
	public void setoStatus(int oStatus) {
		this.oStatus = oStatus;
	}
	
	
	
}
