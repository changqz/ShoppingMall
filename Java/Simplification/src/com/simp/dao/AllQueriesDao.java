package com.simp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.simp.entity.Sp_Allclass;
import com.simp.entity.Sp_Banner;
import com.simp.entity.Sp_My;
import com.simp.entity.Sp_Product;
import com.simp.entity.Sp_User;
import com.simp.entity.GetLogin;

public interface AllQueriesDao {

	List<Sp_Allclass> getAllClass();

	List<Sp_Banner> getBanner();

	List<Sp_Product> getMainp();

	List<Sp_Product> getSelected();

	List<Sp_Product> getNewprod(int pNewprod);

	List<Sp_Product> getPtype(int pType);

	List<Sp_Product> getQueryFuzzy(String pTitle);

	GetLogin getLogin(@Param(value="account") String account,@Param(value="password") String password);
	//添加账号
	int addLogin(String account,String password);
	//添加个人信息
	int addMy(int uid,String name, String phone);

	
}
