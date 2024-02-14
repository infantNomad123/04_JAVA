package edu.kh.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Academy {

public static void main(String[] args) {
		List<Integer> numberList =  new ArrayList<Integer>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(2);
		numberList.add(5);
		
		System.out.println(numberList);
		
		Set<Integer> numberSet = new HashSet<>();
		numberSet.addAll(numberList);
		System.out.println(numberSet);
}
}
