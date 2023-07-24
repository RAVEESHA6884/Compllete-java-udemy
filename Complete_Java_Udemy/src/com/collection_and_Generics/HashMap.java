package com.collection_and_Generics;

import java.util.Map;
import java.util.*;
public class HashMap {

	public static void main(String[] args) {
		TreeMap <String, String> dictionary=new TreeMap<String, String>();
		dictionary.put("Brave","ready to face endure and danger or pain;showing courage");
		dictionary.put("Brilliant","Expectionally clever or talented");
		dictionary.put("Joy","a feeling of great pleasure and happiness");
		dictionary.put("confidence","the state of feeling certain about the truth of something");
//		for(String word:dictionary.keySet()) {
//			System.out.println(dictionary.get(word));
//		}
		for(Map.Entry<String, String>entry:dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
