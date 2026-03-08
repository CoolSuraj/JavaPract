package com.dcb.streams;

import com.dcb.entity.Person;
import java.util.List;
import java.util.stream.IntStream;
import com.dcb.mockData.MockData;


public class Lecture2 {

  //  @Test
  public void range() throws Exception {

  }

  //  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();
    IntStream.range(0, 10)
        .mapToObj(people::get)
        .forEach(System.out::println);
    ;
//          .forEach(i-> System.out.println(people.get(i)));
  }


  public void intStreamIterate() throws Exception {
    IntStream.iterate(0, operand -> operand + 1)
        .filter(number -> number % 2 == 0)
        .limit(20)
        .forEach(System.out::println);
  }

  public static void main(String[] args) throws Exception {
    Lecture2 l2 = new Lecture2();
    l2.rangeIteratingLists();
  }
}