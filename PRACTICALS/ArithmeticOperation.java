package HelloWorld;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		
		//input 2 nos. from user
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		//perform arithmetic operations
		int sum = num1+num2;
		int diff = num1-num2;
		int prod = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		
		//print result to console
		System.out.println("Addition is: " + sum);
		System.out.println("Subtraction is: " + diff);
		System.out.println("Multiplication is: " + prod);
		System.out.println("Division is: " + div);
		System.out.println("Modulus is: " + mod);
	}

}
