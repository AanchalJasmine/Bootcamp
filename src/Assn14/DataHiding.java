package Assn14;
class Circle {
 private double radius = 1;

/** Find area of the circle */

 public double getArea() {
 return radius * radius * Math.PI;
}
public static void main(String[] args) {
 Circle myCircle = new Circle();

 System.out.println("Radius is " + myCircle.radius);
 System.out.println("Area of cirle: " +myCircle.getArea());
 }
}