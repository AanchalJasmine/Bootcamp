package Practise_21_2023;

import java.util.ArrayList;
import java.util.Iterator;

public class Practise_22_2023 {
public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Aanchal");
	list.add("Jasmine");
	Iterator itr= list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
