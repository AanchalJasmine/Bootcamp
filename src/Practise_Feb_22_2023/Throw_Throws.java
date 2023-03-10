package Practise_Feb_22_2023;
class User extends Exception{
	public String toString() {
		return "Dimensions cannot be zero";
	}
}
public class Throw_Throws {

	static void area(int a, int b) throws User{
		if(a<0 || b<0) 
			throw new User();
			System.out.println("The area is "+a*b);
	}
	
	public static void main(String args[]) {
		try {
			area(10,-30);
		}
		catch(User e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Done");
		}
	}}
