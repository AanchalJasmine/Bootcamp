package Practice;


	 class calculation{
		int sum(int x, int y) {
			int z=x+y;
			return z;
		}
		int sum(int x, int y, int z) {
			int a=x+y+z;
			return a;
		}
		double sum(double x, double y) {
			double z=x+y;
			return z;
		}
		double sum(double x, double y, double z) {
			double a=x+y+z;
			return a;
		
	    }
	public class Practise{
	public static void main(String args[]) {
		calculation cal= new calculation();
		System.out.println(cal.sum(1,7,8));
	}}}
