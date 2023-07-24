package Complete_Java_Udemy;

public class ControlFlow {

	public static void main(String[] args) {
		boolean hungry=true;
		if(hungry) {
			System.out.println("i am starving.....");
		}else {
			System.out.println("I'm not starving....");
		}
		int hungryRating=5;
		if(!(hungryRating<6)) {
			System.out.println("Not hungry");
		}else {
			System.out.println("I'm starving....");
		}
		int favouriteTemp=75;
		int currentTemp=100;
		String opinion;
		if(favouriteTemp==currentTemp) {
			if(currentTemp<=favouriteTemp-30) {
				opinion="its pretty Darn cold....";
			}else if (currentTemp<favouriteTemp-20)
			{
				opinion="its kinda cold out.....";
			}
			else if(currentTemp>=favouriteTemp+10)
			{
				opinion="Its hot out";
			}
			else 
			{
				opinion="Its a beautiful day....";
			}
		}
		else { opinion="unknown temp";
	}
	
System.out.println(opinion);
	
int month=2;
String monthString;
switch(month){
	case 1: monthString="january";
	break;
	case 2: monthString="February";
	break;
	case 3: monthString="march";
	break;
	case 4: monthString="april";
	break;
	default:monthString="unknownMonth";
	break;
}
	System.out.println(monthString);

}
}