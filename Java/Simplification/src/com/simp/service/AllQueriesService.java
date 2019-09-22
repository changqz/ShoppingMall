package com.simp.service;

import java.util.List;

import com.simp.entity.Sp_Allclass;
import com.simp.entity.Sp_Banner;
import com.simp.entity.Sp_My;
import com.simp.entity.Sp_Product;
import com.simp.entity.Sp_User;

public interface AllQueriesService {

	List<Sp_Allclass> getAllClass();

	List<Sp_Banner> getBanner();

	List<Sp_Product> getMainp();

	List<Sp_Product> getSelected();

	List<Sp_Product> getNewprod(int pNewprod);

	List<Sp_Product> getPtype(int pType);

	List<Sp_Product> getQueryFuzzy(String pTitle);

	String getLogin(String account, String password);
	//添加账号
	int addLogin(String account, String password);
	//添加个人信息
	int addMy(int uid, String name, String phone);
}
