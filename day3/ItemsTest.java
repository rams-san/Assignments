package com.capgemini.assesments.day3;

public class ItemsTest {
	
		static void printItemsDetails(Items[] itm){
			for (int i = 0; i < itm.length; i++) {
				System.out.println("Price = "+itm[i].price);
				System.out.println("Item = "+itm[i].item1);
			
				System.out.println("*********************");
			}
		}
			static Items[] getItemsDetails(){
			Items[] item = new Items[4];
			Items s1 = new Items(10, "Soap");
			Items s2 = new Items(12, "Sugar");
			Items s3 = new Items(13, "Dish");
			Items s4 = new Items(14, "Brush");

			item[0] = s1;
			item[1] = s2;
			item[2] = s3;
			item[3] = s4;
			return item;

		}
		public static void main(String[] args) {
			Items[] item = new Items[4];
			Items s1 = new Items(21, "Pen");
			Items s2 = new Items(22, "Marker");
			Items s3 = new Items(23, "Book");
			Items s4 = new Items(24, "Bag");

			item[0] = s1;
			item[1] = s2;
			item[2] = s3;
			item[3] = s4;


			printItemsDetails(item);
			Items[] ite2= getItemsDetails();
			printItemsDetails(ite2);		

		}
}
