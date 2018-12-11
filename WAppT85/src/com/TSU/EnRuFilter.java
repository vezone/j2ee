package com.TSU;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class EnRuFilter implements Filter 
{
		
    public EnRuFilter() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException 
	{
		//request.setAttribute("", "");
		//request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) 
			throws ServletException 
	{
	}

}
