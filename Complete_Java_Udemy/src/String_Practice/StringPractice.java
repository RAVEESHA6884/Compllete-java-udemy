package String_Practice;

public class StringPractice {

	public static void main(String[] args) {
		String a="Hello";
		String b="There";
		if(a=="hello") {
			//This is a Trap,Dont do this
		}
		if(a.equals("Hello")) {
			//Use this
			System.out.println("It is Equal...");
		}
		if(b.equalsIgnoreCase("ThRe")) {
			System.out.println("Printed there");
		}
	}

}
