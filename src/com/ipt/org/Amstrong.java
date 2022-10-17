package com.ipt.org;

import java.util.Scanner;

public class Amstrong {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = s.nextInt();
		
		int num,rem,res=0;
		
		num=n;
		while (num!=0) {//15!=0--->1!=0--->0!=0
			rem = num%10;//153%10=5--->15%10=1--->1%10=1
			res=res+(rem*rem*rem);//res=27--->27+125=152--->res=152+1=153
			num=num/10;//153/10=15--->15/10=1--->1/10=0
		}
		if (n==res) {
			System.out.println(n+" is an Amstrong number");
			
		}
		else {
			System.out.println(n+" is not an Amstrong number");
		}
	}

}
