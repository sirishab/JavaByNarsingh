package com.ss4code.oops;

public class First implements Abc
{
	int a,b;
	int i=8;
	static float f1,f2;
	First()
	{
		a=5; b=a+1;
	}
	
	public int function(int a)
	{
		System.out.println("first class");
		this.a=a+a;
		b=this.a;
		return a+this.b;
		
	}
	/*public int function(int a,int b)
	{
		
		this.a=a;
		this.b=b;
		return this.a+this.b;
	}*/
	
	public static void main(String[] args) {
		First first=new First();
		int a=first.function(6);
		/*int b=first.function(a, 5);
		System.out.println(a+ " " +b);*/
		
		
	}

}
