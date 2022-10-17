package com.ipt.org;

import java.util.Scanner;

public class Odd_or_Even {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = s.nextInt();
		
		if (num%2==0) {//15%2=1
			System.out.println("Even num");
		}
		else {
			System.out.println("Odd num");
		}
		
	}

}
