package com.ss4code.programs.logics;

public class Fibnocci 
{
	
	public static void fibnocciSeries(int range)
	{
		int f1=0;
		int f2=1;
		int f3;
		System.out.print(f1 + "\t" + f2);
		for(int i=1;i<=range;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print("\t"+f3);
		}
	}

	public static void main(String[] args) 
	{
		fibnocciSeries(10);
		

	}

}
