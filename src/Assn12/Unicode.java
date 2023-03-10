package Assn12;

public class Unicode {
	public static void main(String[] args) {
		String str = "Hello World";
		int index = 4;
		System.out.println("String: " + str);
		System.out.println("Character at index " + index + ":" + getCharAtIndex(str, index));
		}
		public static int getCharAtIndex(String str, int
		index) {
		return str.codePointAt(index);
		}
		}


