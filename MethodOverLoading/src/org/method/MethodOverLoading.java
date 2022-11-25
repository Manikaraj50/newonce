package org.method;

public class MethodOverLoading {
	static int test(int a,int b){
		return a>b?a:b;
	}
	
	
	
	
public static void main(String[] args) {
	int a=test(10,20);
	System.out.println(a);
	
}
}
