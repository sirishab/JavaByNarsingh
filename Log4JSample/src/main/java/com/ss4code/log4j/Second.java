package com.ss4code.log4j;

import org.apache.log4j.Logger;

public class Second 
{
	Logger log=Logger.getLogger(getClass());
	public void function()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i +" " + (i+1));
			log.info(i +" " + (i+1));
			
		}
	}
	
	public static void main(String[] args) {
		new Second().function();
	}

}
