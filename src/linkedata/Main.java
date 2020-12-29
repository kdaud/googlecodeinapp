package linkedata;

import datastructure.MyTec;

public class Main {
	
	private String name;
	
	private String id;
	public Main(String name, String id) {
		this.name = name;
		this.id = id;
		
	}
	
	static {
		System.out.println("My Programming Journey!");
	}
	public static void main(String[] args) {
		MyTec obj = new MyTec();
		obj.mycommit("Java Language");
	}
	
}
