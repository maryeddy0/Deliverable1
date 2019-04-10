package learningJava;

import java.util.Iterator;
import java.util.Scanner;

public class Deliverables1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String result = "Since you’re hosting a ";
		String size;
		String event;

		System.out.print("How many guests are you having for dinner? ");
		int guests = input.nextInt(); 
		System.out.println();

		if (guests < 2) {
			size = "in the microwave";
		} else if (guests < 13) {
			size = "in your kitchen";
		} else {
			size = "by a caterer";
		}

		// Input and store in the array
		System.out.println("what type of event are you having? Casual? Informal? Formal? ");
		String type = input.nextLine(); 
		String line = input.nextLine(); 
		
		if (line == "casual") {
			event = "sandwiches";
		}  
		else if (line == "informal") {
			event = "fried chicken";
		} 
		else {
			event = "parmesan chicken";
		} 
		
		System.out.println(result + line + " event for " + guests + " participants, you should serve " + event + " " + "prepared " + size );
	}

}