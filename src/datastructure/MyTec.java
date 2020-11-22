package datastructure;

import java.util.Scanner;

public class MyTec {
	
	Scanner scanner = new Scanner(System.in);
	
	public String mycommit(String mylang) {
		System.out.println("Enter the index: ");
		int i;
		i= scanner.nextInt();
		
		for (int j = 0; j < i; j++) {
			System.out.println(mylang);
		}
		return mylang;
		
	}

}
