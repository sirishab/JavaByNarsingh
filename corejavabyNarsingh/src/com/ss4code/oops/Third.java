package com.ss4code.oops;

public class Third extends First implements Xyz
{

	/*public int function(int a) {
		System.out.println("third class");
		return 0;
	}*/

	public int function(int a, int b) {
		System.out.println("third class");
		return 0;
	}
	public static void main(String[] args) {
		Abc a1=new Third();
		a1.function(3);
	}
	

}
