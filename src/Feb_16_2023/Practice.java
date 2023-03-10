package Feb_16_2023;
class employee9{
	int s;
	int n;
	void getInfo(int salary,int NoOfHrs){
		s=salary;
		n=NoOfHrs;
	}
	int addBonus() {
		if(s<600) {
			s=s+15;}
			return s;
		}
	int aWork() {
		if(n>8) {
			s=s+10;
			
		}
		return s;
	}
	void display() {
		System.out.println("The total salary :"+s);
	}
	}

public class Practice {
	public static void main(String args[]) {
		employee9 e= new employee9();
		e.getInfo(700,9);
		e.addBonus();
		e.aWork();
		e.display();
	}
	

}
