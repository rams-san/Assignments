package com.capgemini.assesments.day3;

public class ObjectClass {

	public static void main(String[] args) {
		Object objs[]=new Object[5];
		objs[0]="sar";
		objs[1]=20l;
		objs[2]=30f;
		objs[3]=10;
		objs[4]=true;
		
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}

	}

}
