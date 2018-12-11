package com.TSU;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.Utils.StaticVar;

public class DayNightFilter implements Filter 
{
	private java.time.LocalDateTime m_LocalTime;
    
	public DayNightFilter() 
    {	
		super();
    }

	public void destroy() { }

	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain) 
			throws IOException, ServletException 
	{
		m_LocalTime = java.time.LocalDateTime.now();
		
		int m_HoursGetted = m_LocalTime.getHour();
		int m_MinutesGetted = m_LocalTime.getMinute();
		int m_SecondsGetted = m_LocalTime.getSecond();
		
		request.setAttribute("Hours", String.format("%s", m_HoursGetted));
		request.setAttribute("Minutes", String.format("%s", m_MinutesGetted));
		request.setAttribute("Seconds", String.format("%s", m_SecondsGetted));
		
		request.setAttribute("AddedHours", String.format("%s", m_HoursGetted + 1));
		request.setAttribute("AddedMinutes", String.format("%s", m_MinutesGetted + 1));
		request.setAttribute("AddedSeconds", String.format("%s", m_SecondsGetted + 1));
		
		if (m_HoursGetted > 20 || 
		   (m_HoursGetted > 0 && m_HoursGetted < 4))
		{
			request.setAttribute("IsDay", "2");
		}
		else 
		{
			request.setAttribute("IsDay", "1");
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) 
			throws ServletException 
	{
		
	}

}
