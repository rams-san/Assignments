package com.capgemini.assesments.day3;

public class Long1 {
public static void main(String[] args) {
		
		long num[] = { 41l,52l,62,74l,87l };
		printNums(num);
		
		System.out.println("****************************");
		
		long values[] = getValues();
		printNums(values);
	}

	static void printNums(long[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	static long[] getValues() {
	     long values[] = { 21l,31l,41l,51,61l};
		return values;
	}
}
