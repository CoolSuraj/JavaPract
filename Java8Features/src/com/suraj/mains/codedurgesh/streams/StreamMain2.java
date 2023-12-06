package com.suraj.mains.codedurgesh.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamMain2 {
    public static void main(String[] args) {
       /* methods for using Stream
        Predicate<String> p = s->s.length() < 4;// predicate only take one param and returns boolean
        boolean less4 = p.test("Hello");

        Function<Integer,String> f  = (a)->{return Integer.toString(a);};
        f.apply(3); //Function takes one param that is integer and returns as String

        void Consumer<T>  takes T as parameter and returns nothing.
        method is public void accept(T t);

        supplier<R> is just returns R
        it have method public R get(){}
        Supplier<Date> s = ()->new Date();
        System.out.println(s.get());

        filter(Predicate) --this will filter out all the elements
        map(Function) -- this will perform required action on all elements in Stream */

        List<String> cities = new ArrayList<>();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.add("Ch Sambhajinagar");
        cities.add("Latur");
        cities.add("Dharashiv");

        Stream<String> stream = cities.stream();
        List<String> collect = stream.map(s -> s.concat(" City")).collect(Collectors.toList());
//        List<String> collect = stream.map(s -> s.concat(" City")).toList(); //this is an alternative method
        System.out.println(collect);

        //forEach -- method for traversing through each element
        cities.stream().forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------------");
        //sorted -- to sort the elements
        cities.stream().sorted().forEach(System.out::println);
        //min or max
        String s = cities.stream().min((x, y) -> {return x.compareTo(y);}).get();
        String st = cities.stream().max((x, y) -> {return x.compareTo(y);}).get();
        System.out.println(s+" "+st);



    }
}
