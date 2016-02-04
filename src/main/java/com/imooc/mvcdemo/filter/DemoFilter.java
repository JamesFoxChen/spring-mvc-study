package com.imooc.mvcdemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(filterName="Servlet3Filter",urlPatterns="/*")
public class DemoFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		System.err.println("（开始）filter");
		chain.doFilter(request, response);
		System.err.println("（结束）filter");
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
