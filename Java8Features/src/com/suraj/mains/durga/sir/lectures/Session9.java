package com.suraj.mains.durga.sir.lectures;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Session9 {
	public static void main(String[] args) {

		IntPredicate p = i -> i % 2 == 0;
		Predicate<Integer> q = i -> i % 2 == 0;

		// both p & q are exact same IntPredicate is Shortcut for this
		System.out.println(p.test(4) + " " + q.test(4));

		// Similarly we have DoublePredicate,LongPredicate

		IntFunction<Integer> r = i -> i * 3;
		Function<Integer, Integer> s = i -> i * 3;
		System.out.println(r.apply(10)); // both r and s are exactly same

//		Similarly we have DoubleFunction, LongFunction

		DoubleToIntFunction t = i -> (int) i * 43; // Same as Function<Double,Integer> u= i->(int)i * 43;
		System.out.println(t.applyAsInt(3.333));// the method slightly changes

//     Similarly DoubleToLongFunction (ApplyAsLong),IntToDoubleFunction(ApplyAsDouble),IntToLongFunction (ApplyAsLong) is available 
		IntToDoubleFunction v = i -> i * 0.3;
		System.out.println(v.applyAsDouble(30));

		// Also we have this kind of function as well
		ToIntFunction<String> w = i -> i.length();

		System.out.println(w.applyAsInt("fffff"));

//		Similarly we have ToDoubleFunction, ToLongFunction,ToDoubleBiFunction,ToLongBiFunction, ToIntBiFunction is there as well
		// Example For Bi is given below
		ToIntBiFunction<String, String> x = (a, b) -> {
			String c = a + b;
			return c.length();
		};
		System.out.println(x.applyAsInt("ooo", "point"));

		// Consumers now
		IntConsumer y = i -> System.out.println(i); // Same as Consumer<Integer>
		y.accept(99);

		// Similarly we have DoubleConsumer, LongConsumer

		ObjDoubleConsumer<Integer> z = (a, b) -> System.out.println(Math.sqrt(a + b));
		z.accept(3, 4);

		// Similarly we have ObjLongConsumer,ObjIntConsumer
		//Now
		
		IntSupplier f = ()->4;
		System.out.println(f.getAsInt());
		
		//we have BooleanSupplier (getAsBoolean) , DoubleSupplier,LongSupplier
		
		
		
	}

}