package org.practice;

public class ThirdVariableSwapping {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		a = a + b;   //300 = 100 +200
		
		b = a - b;  //100 = 300 - 200
		
		a = a - b;  //200 = 100 - 300;
		
		System.out.println("a = "+a + "  b = "+ b ) ;

	}

}
