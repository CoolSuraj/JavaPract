package com.suraj.mains.codedurgesh.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = List.of(3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> l2 = new ArrayList<>();

		for (int i : li) {
			if (i % 2 == 0)
				l2.add(i);
		}
		System.out.println(l2);

		l2.clear();
		/*
		 * Stream is lazy pipeline method given to coder to do the job neccassary which
		 * saves space and Time filter uses Predicate to get the results
		 */
		Stream<Integer> stream = li.stream();
		l2 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(l2); // exact same as above that too in one line !!!

		/*
		 * Ways to create Stream object As Stream<T> is an interface we have to find
		 * ways to get Stream<T> as object
		 */

		// way1 Creating Empty Stream-- below example will create stream of type object
		Stream<Object> emptyStream = Stream.empty();//forEach needs Consumer
		emptyStream.forEach(e -> {
			System.out.println("object is blank ??" + e);// this will not print anything at all as Stream do not have
															// any value to begin with
		});
		
		//Way2
		String[] names = {"Suraj","Sanjay","Gurav","Dada","Kata","Bhai"};
		Stream<String> streamOfStrings = Stream.of(names);
		//streamOfStrings.forEach(e->{e.})
		
	}

}
