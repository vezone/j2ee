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

public class Win1251Filter implements Filter 
{
		
    public Win1251Filter() 
    {
    	
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException 
	{
		response.setContentType("text/html;charset=Cp1251");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) 
			throws ServletException 
	{
	}

}
