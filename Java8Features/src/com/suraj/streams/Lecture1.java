package com.dcb.streams;

import com.dcb.entity.Person;
import com.dcb.mockData.MockData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lecture1 {

  List<Person> peopleList = MockData.getPeople();

  public Lecture1() throws IOException {
  }

  public void imperativeApproach() throws IOException {
    // 1. find people aged less or equals 18
    //then change implementation to find first 10 people

    List<Person> adults = new ArrayList<>();
    for (Person p : peopleList) {
      if (p.getAge() < 18) {
        adults.add(p);
      }
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(adults.get(i));
    }

  }

  public void declarativeApproachUsingStreams() throws IOException {
    // 1. find people aged less or equals 18
    //then change implementation to find first 10 people
//    List<Person> childs = peopleList.stream()
//        .filter(i -> i.getAge() <= 18)
//        .limit(10)
//        .toList();
//
//    System.out.println(childs);

    peopleList.stream()
        .filter(i -> i.getAge() <= 18)
        .limit(10)
        .forEach(System.out::println);

  }

  public static void main(String[] args) throws IOException {
    Lecture1 l1 = new Lecture1();
    //l1.imperativeApproach();
    l1.declarativeApproachUsingStreams();
  }


}
