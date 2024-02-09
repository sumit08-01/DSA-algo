package com.dsa.pointer;

import java.util.HashMap;
import java.util.Map;

public class Pointer {

	public static void main(String[] args) {
		
	//Case : 1 --> Interger and int
		int num1 = 11;
		int num2 = num1;
		
		num1 = 22; // after
		
//		System.out.println("num1 : " + num1);
//		System.out.println("num2 : " + num2);
		
//Case : 2 --> Map
		
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1.put("Value", 11);
		map2 = map1;
		
//		map1.put("value", 22); // after
		
		System.out.println("map1 : " + map1);
		System.out.println("map2 : " + map2);
	}
}
