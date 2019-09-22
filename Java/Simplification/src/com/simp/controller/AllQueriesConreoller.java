package com.simp.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.java.utils.ResAndReqPages;
import com.simp.entity.Sp_Allclass;
import com.simp.entity.Sp_Banner;
import com.simp.entity.Sp_My;
import com.simp.entity.Sp_Product;
import com.simp.entity.Sp_User;
import com.simp.service.AllQueriesService;

@Controller
public class AllQueriesConreoller {
	
	Gson gson = new Gson();
	
	PrintWriter pw;
	
	@Resource
	AllQueriesService aqs;
	//查询全部上商品
	@RequestMapping("allClass.success")
	public void getAllClass(HttpServletRequest req,HttpServletResponse res){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Allclass> list = aqs.getAllClass();
		String json = gson.toJson(list);
		pw.write(json);
	}
	//查询banner图
	@RequestMapping("banner.success")
	public void Banner(HttpServletRequest req,HttpServletResponse res){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Banner> list = aqs.getBanner();
		String json = gson.toJson(list);
		pw.write(json);
	}
	
	//查询全部商品
	@RequestMapping("mainp.success")
	public void Mainp(HttpServletRequest req,HttpServletResponse res){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Product> list = aqs.getMainp();
		String json = gson.toJson(list);
		pw.write(json);
	}
	
	//查询首页精选活动
	@RequestMapping("selected.success")
	public void getSelected(HttpServletRequest req,HttpServletResponse res){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Product> list = aqs.getSelected();
		String json = gson.toJson(list);
		pw.write(json);
	}
	//查询首页的新品上市、热销产品、商城推荐
	@RequestMapping("newprod.success")
	public void getNewProd(int pNewprod,HttpServletResponse res,HttpServletRequest req){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Product> list = aqs.getNewprod(pNewprod);
		String json = gson.toJson(list);
		pw.write(json);
	}
	//查询首页的1F:收纳工具、2F:创意用品、3F:厨卫清洁、4F:衣架挂钩
	@RequestMapping("ptype.success")
	public void getPtype(int pType,HttpServletResponse res,HttpServletRequest req){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Product> list = aqs.getPtype(pType);
		String json = gson.toJson(list);
		pw.write(json);
	}
	//模糊查询
	@RequestMapping("fuzzyQuery.success")
	public void getQueryFuzzy(String pTitle,HttpServletRequest req,HttpServletResponse res){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		List<Sp_Product> list = aqs.getQueryFuzzy(pTitle);
		String json = gson.toJson(list);
		pw.write(json);
	}
	
	//登录
	@RequestMapping("prodLogin.success")
	public void getLogin(String account,String password,HttpServletRequest req,HttpServletResponse res,HttpSession sessiong){
		pw = ResAndReqPages.reqAndResConfig(res, req);
		
		String json = aqs.getLogin(account,password);
		pw.write(json);
		
	}
	
	//注册
	@RequestMapping("addLogin.success")
	public void addLogin(String account,String password,int uid,String name,String phone,HttpServletRequest req,HttpServletResponse res,HttpSession sessiong){
		
		pw = ResAndReqPages.reqAndResConfig(res, req);
		
		
		if(aqs.addLogin(account,password) > 0 && aqs.addMy(uid,name,phone) > 0){
			pw.write("成功");
		}else{
			pw.write("失败");
		}
		
	}
	

}
