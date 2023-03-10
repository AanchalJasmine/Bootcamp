package Assn13;

public class A13_1 {String name;
int rollno;
int m1,m2,m3;
int total_score;

void assign(String n, int rno, int a1,int a2,int a3) {
	name =n;
	rollno=rno;
	m1=a1;
	m2=a2;
	m3=a3;
	total_score = m1+m2+m3;
}
void display() {
	System.out.println("The name of student: "+name);
	System.out.println("Rollno: "+rollno);
	System.out.println("Marks: "+m1+" "+m2+" "+m3);
	System.out.println("Total Score: "+total_score);
	
}
public static void main(String[] args) {
	A13_1 obj =new A13_1();

	obj.assign("abc", 1,70,80,90 );
	obj.display();
	
}

}



