package Assn12;

public class lexicographically1 {
	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = "world";
		int result = string1.compareTo(string2);
		if (result < 0) {
		System.out.println(string1 + " is lexicographically before " + string2);
		} else if (result == 0) {
		System.out.println(string1 + " is lexicographically equal to " + string2);
		} else {
		System.out.println(string1 + " is lexicographically after " + string2);
		}
		}
		}

