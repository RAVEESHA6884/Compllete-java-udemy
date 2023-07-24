package com.Raveesh.Threads;

public class ThreadDemo {

	public static void main(String[] args) {
		Task taskRunner=new Task();
		taskRunner.start();
		System.out.println("Hellon There");
		Task taskRunner2=new Task();
		taskRunner2.start();

	}

}
class Task extends Thread{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("number :"+i);
		}
	}
}