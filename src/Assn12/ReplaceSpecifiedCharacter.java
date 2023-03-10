package Assn12;

public class ReplaceSpecifiedCharacter {
	public static void main(String[] args) {
		String str = "Hello, World!";
		char oldCharacter = 'o';
		char newCharacter = 'x';
		str = str.replace(oldCharacter, newCharacter);
		System.out.println("After replacing '" + oldCharacter
		+ "' with '" + newCharacter + "', the string is: " +
		str);
		}
		}

