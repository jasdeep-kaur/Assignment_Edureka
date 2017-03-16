package com.edureka.session_four;
import java.util.LinkedList;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by jasdeep kaur on 2/24/17.
 */

public class Link{
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		List<String> words=new LinkedList<>();
		words.add("#1111,Boston");
		words.add("london");
		words.add("london");
		for(String word:words){
			System.out.println(word);
		}
System.out.println("*************************************");

		for(Integer number:numbers){
			System.out.println(number);
		}

	}
}
