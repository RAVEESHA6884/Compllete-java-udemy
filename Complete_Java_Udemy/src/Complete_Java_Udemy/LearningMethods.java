package Complete_Java_Udemy;

import anotherPackage.Example;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println("HELLO");
		System.out.println(MyUtils.printSomeJunk("Hello There"));
		MyUtils.sum2Numbers(10,23);
		int myvar=MyUtils.add10(99)+1000-50;
		System.out.println(myvar);
		Example.doSomething();

	}

}
