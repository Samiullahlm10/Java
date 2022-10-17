package com.ipt.org;

public class Reverse_Array {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		for (int i = 0; i < a.length; i++) {//0<5//1<5...
			System.out.println(a[i]);//a[0]=10
		}
	
		for (int j = a.length-1; j >= 0; j--) {
			System.out.println(a[j]);
			
		}
	
	}

}
