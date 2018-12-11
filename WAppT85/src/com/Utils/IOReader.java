package com.Utils;

public class IOReader 
{
	public static String ReadFile(String fileName)
	{
		int asc;
		StringBuilder sb = new StringBuilder();
		try (java.io.BufferedReader reader = 
				new java.io.BufferedReader(new java.io.FileReader(fileName)))
		{
			if ((asc = reader.read()) != -1)
			{
				sb.append((char)asc);
			}
		}
		catch (java.io.IOException ex)
		{
			ex.printStackTrace();
		}
		
		return sb.toString();
	}
}
