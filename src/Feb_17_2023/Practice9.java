package Feb_17_2023;
abstract class Bank{
	int A=100;
	int B=150;
	int C=200;
	abstract void  getBalance();
}
class BankA extends Bank{
	void getBalance(){
		System.out.println(A);
	}}
class BankB extends Bank{
	void getBalance() {
		System.out.println(B);
	}}
class BankC extends Bank{
	void getBalance() {
		System.out.println(C);
	}

}
public class Practice9 {
	public static void main(String args[]) {
		BankA objA= new BankA();
		BankB objB= new BankB();
		BankC objC= new BankC();
		objA.getBalance();
		objB.getBalance();
		objC.getBalance();
	}}


