package Practise_21_2023;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P1 {
	public static void main(String args[]) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("Hello!");
		l.add("Hi");
		l.add("Bye");
		System.out.println("Original List : "+l);
		Collections.reverse(l);
		System.out.println("Modified List : "+l);
	}

}
