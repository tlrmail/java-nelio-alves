package com.udemy.java_completo_2023_poo.secao007;

public class Sistema58 {

	public static void main(String[] args) {

		String original = " abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(5);
		String s05 = original.substring(5, 12);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int s08 = original.indexOf("bc");
		int s09 = original.lastIndexOf("bc");
		String [] vetor = original.split(" ");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(5): -" + s04 + "-");
		System.out.println("substring(5,12): -" + s05 + "-");
		System.out.println("substring(5,12): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc','xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + s08 + "-");
		System.out.println("lastIndexOf('bc'): -" + s09 + "-");
		
		for(String s: vetor) {
			System.out.println(s);
		}

	}

}
