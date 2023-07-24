package com.collection_and_Generics;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericColllection {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("helllo");
		words.add("there");
		words.add("10");
		String item1=words.get(2);
		System.out.println(item1);
		LinkedList<Integer> number =new LinkedList<Integer>();
		number.add(100);
		number.add(200);
		number.add(45);
		number.add(1000);
		number.removeFirst();
		for(int num :number) {
			System.out.println(num);
		}
		

	}

}
