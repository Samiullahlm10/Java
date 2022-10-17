package com.ipt.org;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = s.nextLine();
		
		String rev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {//i=9;9>0//i=8;8>0...
			
			char ch = str.charAt(i);
			rev=rev+ch;//rev=n--->ni
			
		}
		System.out.println("Reverse String is:"+rev);
		
		
		String[] split = str.split("");
		
		for (String sp : split) {
			System.out.println(sp);
			
		}
		
		
	}
	

}
