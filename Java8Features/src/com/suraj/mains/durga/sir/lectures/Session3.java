package com.suraj.mains.durga.sir.lectures;


public class Session3 {
//Lambda Expressions multithreading 
	
	public static void main(String[] args) {
//		MyRunnable mr = new MyRunnable();
//		instead of above implementation we can do something like this
		Runnable mr = ()->{
			for(int i=0;i<5 ;i++) {
				System.out.println("child Thread running");
			}
		};
		Thread r = new Thread(mr);
		r.start();
		for(int i=0;i<5;i++) {
		System.out.println("Thanks");
		}
	}
}

//class MyRunnable implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0;i<5 ;i++) {
//			System.out.println("child Thread running");
//		}
//		
//	}
//	
//}
