package org.cts;

import java.util.stream.IntStream;

public class Sample {
	public static void main(String[] args) {
		String s1 = "Greens Technology";
		String s2 =  "SeleniumAutomationtool";
		String s3 = "velmurugan";
		String s4 = "j a v a p r o g r a m";
		String s5 = "9095484678";
		int len = s1.length();
		System.out.println(len);
		
		String up = s1.toUpperCase();
		System.out.println(up);
		
		String low = s1.toLowerCase();
		System.out.println(low);
		
		int ind = s1.indexOf('n');
		System.out.println(ind);
		
		int las =s1.lastIndexOf('r');
		System.out.println(las);
		
		char cha = s3.charAt(6);
		System.out.println(cha);
		
		boolean equ = s3.equals(s4);
		System.out.println(equ);
		
        boolean eg = s3.equalsIgnoreCase(s4);
        System.out.println(eg);
        
        boolean egi = s4.equalsIgnoreCase(s5);
        System.out.println(egi);
	
        boolean con = s3.contains(s4);
		System.out.println(con);
			
		String rep = s2.replace('e', 'd');
		System.out.println(rep);

	}

}
