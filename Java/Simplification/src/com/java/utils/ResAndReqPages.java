package com.java.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResAndReqPages {
	public static PrintWriter reqAndResConfig(HttpServletResponse res,HttpServletRequest req){
		PrintWriter w=null;
		try {
			w=res.getWriter();
			res.setCharacterEncoding("utf-8");
			req.setCharacterEncoding("utf-8");
			res.setContentType("text/html;charset=utf-8");
			res.setHeader("Access-Control-Allow-Origin","*");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return w;
	}
}
