package Assn12;

public class lexicographically2 {
	public static void main(String[] args) {
		String string1 = "HELLO";
		String string2 = "world";
		int result = string1.compareToIgnoreCase(string2);
		if (result < 0) {
		System.out.println(string1 + " is lexicographically before " + string2 + " ignoring case");
		} else if (result == 0) {
		System.out.println(string1 + " is lexicographically equal to " + string2 + " ignoring case");
		} else {
		System.out.println(string1 + " is lexicographically after " + string2 + " ignoring case");
		}
		}
		}


