package Feb_20_2023;

import java.util.HashMap;
import java.util.Map;

public class Hello {
	public static void main(String args[]) {
		HashMap<Integer,String> tm= new HashMap<>(Map.of(0,"a",1,"b"));
		tm.put(2,"c");
		tm.put(3,"d");
		System.out.println(tm);
	}

}
