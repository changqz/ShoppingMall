package com.simp.entity;

public class GetLogin {
	
	public Sp_User getId() {
		return id;
	}
	public void setId(Sp_User id) {
		this.id = id;
	}
	public Sp_My getMid() {
		return mid;
	}
	public void setMid(Sp_My mid) {
		this.mid = mid;
	}
	public Sp_User getUid() {
		return uid;
	}
	public void setUid(Sp_User uid) {
		this.uid = uid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	Sp_User id;

	Sp_My mid;
	Sp_User uid;
	String account;
	String psd;
	//这个和查询出的数据对应的上吗，是哪个as的那个名字吗？那些的没as的id是写原来的还是不写啊？
	String pic;
	String name;
	String eamil;
	String phone;
	String price;
	
	

	
	

}
