package com.suraj.mains.durga.sir.lectures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> listOf100 = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            listOf100.add(i);
        }
        Stream<Integer> stream = listOf100.stream();

        long count = stream.filter(integer -> integer % 2 != 0).count();

        System.out.println("Number of odd digits in 1-100 is " + count);

//        for descending order
//        (i1,i2)->{(i1<i2)?1:(i2<i1)? -1:0};
        Stream<Integer> stream1 = listOf100.stream();
        Stream<Integer> stream2 = listOf100.stream();
        Stream<Integer> stream3 = listOf100.stream();
        //print descending list of numbers which are divisible by 3
        stream1.filter(i->i%3==0).sorted((i1, i2) -> (i1 < i2) ? 1 : (i2 < i1) ? -1 : 0).forEach(e->System.out.print(e+" "));
//        stream2.filter(i->i%3==0).sorted((i1, i2) -> -(i1.compareTo(i2)) ).forEach(e->System.out.print(e+" "));
//       instead of '-(i1.compareTo(i2))'  we can use 'i2.compareTo(i1)'
        Integer[] array = stream3.toArray(Integer[]::new);//this will basically convert List to Array


    }
}
