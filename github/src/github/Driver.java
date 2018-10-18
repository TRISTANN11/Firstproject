package github;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		boolean makephone = true;
		while (makephone == true) {
		makephone = makephone(makephone);
		System.out.println("Want to make another phone? (1 for yes 2 for no)");
		Scanner myscan2 = new Scanner(System.in);
		int anotherphone = myscan2.nextInt();
		if (anotherphone == 1) {
			makephone = true;
			makephone= makephone(makephone);
		}else {
			makephone= false;
		}}
	}
	public static boolean makephone(boolean makephone) {

		while (makephone == true){
			Scanner myscan = new Scanner(System.in);
			System.out.println("What is your phone's manufacturer?");
			String Manufacturer = myscan.nextLine();
		//	String mynothing = myscan.next();
			System.out.println("What is your phone's Model?");
			String Model = myscan.nextLine();
			//mynothing = myscan.next();
			System.out.println("What is your phone's price");
			String Price = myscan.nextLine();
		//	mynothing = myscan.next();
			System.out.println("What is your phone's carrier");
			String Carrier = myscan.nextLine();
		//	mynothing = myscan.next();
			
			MobilePhone mobile1 = new MobilePhone(Manufacturer, Model, Price, Carrier);
			
			System.out.println("Who should we call?");
			String phonenumber = myscan.nextLine();
			//mynothing = myscan.next();
			System.out.println(mobile1.call(phonenumber));
			
			
			System.out.println("What should we text?");
			String textmessage = myscan.nextLine();
			//mynothing = myscan.next();
			System.out.println(mobile1.text(textmessage));
			
			System.out.println(mobile1.toString());	
			makephone = false;
			}
		return false;
		
	}
	}

