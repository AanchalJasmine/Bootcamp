package Practical;

class Emp{
	int salary=40000;
}
class Pgm extends Emp{
	int bonus=10000;
}
class TeamLead extends Pgm{
	int extraBonus=15000;
}
public class Multilevel {
	
	public static void main(String args[]){
		TeamLead s= new TeamLead();
		System.out.println(s.salary);
		System.out.println(s.bonus);
		System.out.println(s.extraBonus);
	}
}

