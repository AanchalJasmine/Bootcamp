package abc;
// method to render a shape
class Polygon{
public void render() {
System.out.println("Rendering Polygon...");
}}

class Squareee extends Polygon {
// renders Square
public void render() {
System.out.println("Rendering Square...");
}
}
class Circleee extends Polygon {
// renders circle
public void render() {
System.out.println("Rendering Circle...");
}
}



public class Main321 {
	public static void main(String[] args) {

		// create an object of Square
		Squareee s1 = new Squareee();
		s1.render();
		// create an object of Circle
		Circleee c1 = new Circleee();
		c1.render();
		}	
}
