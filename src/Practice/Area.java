package Practice;
abstract class shape{
	abstract public double perimeter();
	abstract public double area();
}
class circle extends shape{
	double r;
	public double perimeter() {
		return 2*Math.PI*r;}
	
		public double area() {
			return 2*Math.PI*r*r;}
	
}
public class Area {
	public static void main(String args[]) {
		circle c= new circle();
		}

}
