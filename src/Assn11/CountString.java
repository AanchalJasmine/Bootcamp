package Assn11;

public class CountString {
	public static void main(String args[]){
		String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		count(test);
	}
	public static void count(String x) {
		char ch[]= x.toCharArray();
		int Letters=0;
		int Numbers=0;
		int Spaces=0;
		int Others=0;
		for(int i=0; i<x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				Letters++;
			}
			else if(Character.isDigit(ch[i])) {
				Numbers++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				Spaces++;
			}
			else {
				Others++;
			}
		System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
		System.out.println("There are "+Letters+" in the given string.");
		System.out.println("There are "+Numbers+" in the given string.");
		System.out.println("There are "+Spaces+" in the given string.");
		System.out.println("There are "+Others+" in the given string.");
		}
		
	}
}
