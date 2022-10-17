package com.ipt.org;

import java.util.Scanner;

public class Repeatitive {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = s.nextLine();
		str = str.toLowerCase();
		System.out.println(str);
		
		String[] split = str.split(" ");
		for (String sp : split) {
			System.out.println(sp);
		}
		int count;
		for (int i = 0; i <= split.length-1; i++) {//i=0;0<3//1<3
			count=1;
			for (int j = i+1; j <= split.length-1; j++) {//j=1<3//2<3
				if (split[i].equals(split[j])) {//black=white
					count++;//1
					
					split[j]="0";//split[3]
					
				}
				
			}
			
			if (count>1 && split[i]!="0") {
				System.out.println(split[i]+":"+count);
				
			}
		}
	}

}
