package com.collection_and_Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TraversingList {

	public static void main(String[] args) {
		List<String>animals=new ArrayList<String>();
		animals.add("Lion");
		animals.add("cat");
		animals.add("Dog");
		animals.add("Bird");
//		for(int  i=0;i<animals.size();i++) {
//			System.out.println(animals.get(i));
//		}
//		for(String value:animals) {
//			System.out.println(value);
//		}
		List<Vehicle> vehicles=new LinkedList<Vehicle>();
		Vehicle vehicle2=new Vehicle("Toyota","camery",12000,false);
		vehicles.add(new Vehicle("Honda","accord",12000,false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep","wrangler",25000,true));
//		for(Vehicle car:Vehicles) {
//			System.out.println(car);
//		}
		printElements(vehicles);
		printElements(animals);
	}
public static void printElements(List someList) {
	for(int i=0;i<someList.size();i++) {
		System.out.println(someList.get(i));
	}
}
}
