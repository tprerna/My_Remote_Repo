package com.flp.ems.util;

public class Validate {
	public static boolean ValidateDate(String date)
	{
	boolean format;
	if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
	    format=true;
	else
	   format=false;
	
	return format;

}


}
