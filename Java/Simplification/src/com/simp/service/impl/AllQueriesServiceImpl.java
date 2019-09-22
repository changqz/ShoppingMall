package com.simp.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.simp.dao.AllQueriesDao;
import com.simp.entity.Sp_Allclass;
import com.simp.entity.GetLogin;
import com.simp.entity.Sp_Banner;
import com.simp.entity.Sp_My;
import com.simp.entity.Sp_Product;
import com.simp.entity.Sp_User;
import com.simp.service.AllQueriesService;
import com.google.gson.Gson;

@Service
public class AllQueriesServiceImpl implements AllQueriesService{
	@Resource 
	AllQueriesDao aqd;
	@Override
	public List<Sp_Allclass> getAllClass() {
		List<Sp_Allclass> list = aqd.getAllClass();
		return list;
	}
	@Override
	public List<Sp_Banner> getBanner() {
		List<Sp_Banner> list = aqd.getBanner();
		return list;
	}
	@Override
	public List<Sp_Product> getMainp() {
		List<Sp_Product> list = aqd.getMainp();
		return list;
	}
	@Override
	public List<Sp_Product> getSelected() {
		List<Sp_Product> list = aqd.getSelected();
		return list;
	}
	@Override
	public List<Sp_Product> getNewprod(int pNewprod) {
		List<Sp_Product> list = aqd.getNewprod(pNewprod);
		return list;
	}
	@Override
	public List<Sp_Product> getPtype(int pType) {
		List<Sp_Product> list = aqd.getPtype(pType);
		return list;
	}
	@Override
	public List<Sp_Product> getQueryFuzzy(String pTitle) {
		List<Sp_Product> list = aqd.getQueryFuzzy(pTitle);
		return list;
	}
	@Override
	public String getLogin(String account, String password) {
		String msg = "";
		GetLogin l = aqd.getLogin(account,password);
		if(l != null){
			msg = new Gson().toJson(l);
		}else {
			msg = "errorcuowu";
		}
		return msg;
	}
	

	
	//添加账号
	@Override
	public int addLogin(String account, String password) {
		// TODO Auto-generated method stub
		
		Sp_User u = new Sp_User();
		u.setuAccount(account);
		u.setuPassword(password);
		
		return 0;
	}
	//添加个人信息
	@Override
	public int addMy(int uid, String name, String phone) {
		// TODO Auto-generated method stub
		return aqd.addMy(uid,name,phone);
	}
		

}
