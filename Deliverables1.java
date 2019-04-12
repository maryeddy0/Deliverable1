package learningJava;

import java.util.Iterator;
import java.util.Scanner;

public class Deliverables1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String result = "Since you’re hosting a ";
		String way;
		String food;

		System.out.print("How many guests are you having for dinner? ");
		int partySize = input.nextInt();
		System.out.println();

		if (partySize < 2) {
			way = "in the microwave";
		} else if (partySize < 13) {
			way = "in your kitchen";
		} else {
			way = "by a caterer";
		}

		// Input and store in the array
		System.out.print("what type of event are you having? Casual? Informal? Formal? ");
		String eventType = input.nextLine();
		eventType = input.nextLine();
		System.out.println();

		if (eventType .equals("casual")) {
			food = "sandwiches";
		} else if (eventType .equals ("informal")) {
			food = "fried chicken";
		} else {
			food = "parmesan chicken";
		}

		System.out.println(result + eventType + " event for " + partySize + " participants, you should serve " + food + " "
				+ "prepared " + way + ".");
	}

}