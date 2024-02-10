package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String Browser = "Chrome";
		
		switch (Browser) {
		case "Firefox":
			System.out.println("Firefox is opened");
			break;
		case "Chrome":
			System.out.println("Chrome is open");
			break;
		
		default:
			System.out.println("not in the list");
			break;
		}
	}

}
