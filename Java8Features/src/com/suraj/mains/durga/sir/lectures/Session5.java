package com.suraj.mains.durga.sir.lectures;

import com.suraj.mains.durga.interfaces.DefaultAndStatic;

public class Session5  implements DefaultAndStatic{
	
	public void m2() {
		System.out.println("m2 overriden version");
	}

	public static void main(String[] args) {
		Session5 s = new Session5();
		s.m1();//this us by interface
		s.m2();//overriden here
		
		//to call interface static method we only have one method
		
		DefaultAndStatic.m4();

	}

}
