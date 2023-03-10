package Practise_21_2023;

import java.util.HashMap;
import java.util.Map;

public class P3 {
	public static void main(String args[]) {
		HashMap<Integer,String> hm= new HashMap(Map.of(1,"Aanchal",2,"Jasmine"));
		hm.put(3,"Abhishek");
		hm.put(4,"Isha");
		if(hm.containsValue("Aanchal")) {
			System.out.println("The searched value is present");
		}
		
	}
}
