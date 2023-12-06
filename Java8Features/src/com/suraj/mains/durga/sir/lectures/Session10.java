package com.suraj.mains.durga.sir.lectures;

import com.suraj.mains.durga.sir.dto.Sample;
import com.suraj.mains.durga.sir.dto.Student;

import java.util.function.Consumer;
import java.util.function.Function;

interface  interf{
    public Sample get();
}

public class Session10 {
    public static void main(String[] args) {
	/*
	Method and Constructor Reference
	Function<String,Integer> f = s->s.length;

	 */
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("child Thread 1");
            }
        };

//		Now although above implementation is easy due to lambda expression still what to do if I need to create it multiple times
//		Basically I want to move internal loop of that {} in function and pass it as param to runnable
//		so we can do it like
        //Way 1
        Runnable r1 = () -> {
            m1();
        };

        //Or there is something called as Method reference Like below
        Runnable r2 =Session10::m1;  //this :: will get method from Class as a reference
        //for static method we use
        //className::methodName
        //for Instance method
//        objectName::methodName

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r2);
        t1.start();
        t2.start();
        t3.start();

        Consumer<Integer> fadd = (a)-> {
            System.out.println(a+10);
        };
        fadd.accept(11);

        Session10 obj = new Session10();
        Consumer<Integer> qadd = obj::sum; //method reference
        qadd.accept(11);


        interf in = Sample::new;
        Sample sample = in.get();

    }

    private static void m1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread");
        }
    }

    public void sum(int a){
        System.out.println("The sum is "+(a+10));
    }
}