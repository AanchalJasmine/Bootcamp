package Expert;
class Employee{
	void salary() {
		int x= 25000;
		System.out.println("Salary is :"+x);
	};	
}
class Manager extends Employee{
	void bonus() {
		int y = 10000;
		System.out.println("Bonus is :"+y);
	}
}
public class SingleInheritance {
	public static void main(String args[]) {
		Manager obj= new Manager();
		obj.salary();//calls method of super class
		obj.bonus();//calls method of sub class
	}
}
