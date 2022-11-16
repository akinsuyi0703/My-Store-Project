package javaPackage;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		int week=5;
		String day;
		
		switch(week) {
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		case 3:
			day="Wednesday";
			break;
		case 4:
			day="Thursday";
			break;
		case 5:
			day="Friday";
			break;
		case 6:
			day="Saturday";
			break;
		case 7:
			day="Sunday";
			break;
		default:
			day="Invalid day";
			
		}
		System.out.println("Days is "+day);
		

	}

}