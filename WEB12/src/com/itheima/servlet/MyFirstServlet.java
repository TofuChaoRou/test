package com.itheima.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;


public class MyFirstServlet implements Servlet {

	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//专门向客户端提供响应的方法
		HttpServletResponse response = (HttpServletResponse) res;
		response.getWriter().write("this is my firstServlet!");
		response.getWriter().write("this is my firstServlet!");
	}	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
