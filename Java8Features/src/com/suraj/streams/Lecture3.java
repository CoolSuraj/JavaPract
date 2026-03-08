package com.dcb.streams;



import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;


public class Lecture3 {


  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer i = numbers.stream().min((n1, n2) -> n1-n2 )
        .orElse(0);
    System.out.println(i);
  }


  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer i = numbers.stream().max((n1,n2)-> n1-n2).orElse(0);
    System.out.println(i);
  }
}