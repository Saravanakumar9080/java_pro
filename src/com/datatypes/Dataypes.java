package com.datatypes;

public class Dataypes {
	
	private void emypolyee_details() {
		int empolyee_id = 01;
		String name = "ABC";
		long number = 1234567890l;
		float pakageee = 22222.555f;
		boolean working = true;
		char star = '*'; 
		double digital = 225.0956956;
		short a = -211;
		byte s =5;
		
		System.out.println("Empolyee_id:"+empolyee_id);
		System.out.println("Name:"+name);
		System.out.println(number);
		System.out.println(pakageee);
		System.out.println(working);
		System.out.println(star);
		System.out.println(digital);
		System.out.println(a);
		System.out.println(s);
		}
	public static void main(String[] args) {
		Dataypes emp = new Dataypes();
		emp.emypolyee_details();
		
	}

}
