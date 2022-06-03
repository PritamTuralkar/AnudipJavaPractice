package Operators;
import java.util.*;  

public class Operators{
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your First value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter your second value: ");
		int num2 = sc.nextInt();

		System.out.println("Addition: ");
		System.out.println(num1+num2);
		
		System.out.println("Minus: ");
		System.out.println(num1-num2);
		
		System.out.println("Division: ");
		System.out.println(num1/num2);
		
		System.out.println("Multiplication: ");
		System.out.println(num1*num2);
		
		System.out.println("Modulo: ");
		System.out.println(num1%num2);
		
	}
}