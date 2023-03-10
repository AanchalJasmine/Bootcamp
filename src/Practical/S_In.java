package Practical;
class Employee{
	int salary=40000;
}
class Programmer extends Employee{
	int bonus=10000;
}
public class S_In {
	
	public static void main(String args[]){
		Programmer s= new Programmer();
		System.out.println(s.salary);
		System.out.println(s.bonus);
	}
}