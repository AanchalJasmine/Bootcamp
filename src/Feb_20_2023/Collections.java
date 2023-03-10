package Feb_20_2023;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String args[]) {
		ArrayList<Integer> al1= new ArrayList<>();
		ArrayList<Integer> al2= new ArrayList<>(List.of(10,20,30,40,50));
		al1.add(10);
		System.out.println(al1.get(0));
		al1.add(0,5);
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		al1.addAll(al2);
		al1.retainAll(al2);
		al1.add(0,35);
		System.out.println(al2);
		al1.removeAll(al2);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		System.out.println(al1.isEmpty());
		System.out.println(al2.equals(al1));
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
	}

}
