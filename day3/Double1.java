package com.capgemini.assesments.day3;

public class Double1 {
public static void main(String[] args) {
		
		double num[] = { 20.5,31.4,24.1,41.2 };
		printNums(num);
		
		System.out.println("****************************");
		
		double values[] = getValues();
		printNums(values);
	}

	static void printNums(double[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

	static double[] getValues() {
	     double values[] = { 20.13,31.5,61.2,74.1 };
		return values;
	}

}
