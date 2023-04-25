package com.n;

public class Bug {
	
	private void add(int a,int b) {
		
		
		a=100;
		
		int c=a+b;
		System.out.println(c);
		
		
	

	}
	
	
	public static void main(String[] args) {
		Bug n=new Bug();
		n.add(10, 20);
		System.out.println(n);
		
	}

}
