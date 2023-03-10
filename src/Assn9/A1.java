package Assn9;
import java.util.Scanner;
public class A1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        int c = (b/a);
        System.out.println("Division of b by a = " + c );
    }
}