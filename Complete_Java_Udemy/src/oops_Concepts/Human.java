package oops_Concepts;

public class Human {
String name;
int age;
int heightInInches;
String eyeColor;
public Human() {
	
}
	public void speak() {
		System.out.println("Hello my name is  "+    name);
		System.out.println("I am "+heightInInches+"  Inches Tall");
		System.out.println("I am "+age+"  years old");
		System.out.println("MY eye color is  "+eyeColor);
	}
	public void eat () {
		System.out.println("eating......");
	}
	public void walk() {
		System.out.println("Walkinng....");
	}
	public void work() {
		System.out.println("Working.....");
	}
}
