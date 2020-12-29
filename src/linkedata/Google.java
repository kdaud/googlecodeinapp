package linkedata;

import java.util.ArrayList;

public class Google {
	
	public String codeme() {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("Bugema University");
		myList.add("Kyamnogo University");
		myList.add("Makerere University");
		myList.add("Mbarara University");
		myList.add("UCU University");
		
		for (String ss : myList) {
			System.out.println(ss);
		}
		try {
			System.out.println("The univ at index 3 is: " + myList.get(5));
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("********");
		System.out.println(myList);
		return null;
	}
	
}
