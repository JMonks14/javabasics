package helloworldfin;
import java.util.Scanner;

public class Calculator {
	
	public static void addNumbers(int num1, int num2) {
		int ret = num1 + num2;
		System.out.println(ret);
	}
	public static void subNumbers(int num1, int num2) {
		int ret = num1 - num2;
		System.out.println(ret);
	}
	
	public static void mulNumbers(int num1, int num2) {
		int ret = num1 * num2;
		System.out.println(ret);
	}
	public static void divNumbers(int num1, int num2) {
		int ret = num1 / num2;
		System.out.println(ret);
	}
	public static void opNumbers(int num1, int num2, String op) {
		
		switch(op) {
		case "+":
			addNumbers(num1,num2);
			break;
		case "-":
			subNumbers(num1,num2);
			break;
		case "*":
			mulNumbers(num1,num2);
			break;
		case "/":
			divNumbers(num1,num2);
			break;
		default:
			System.out.println("Invalid operator");
	}
	}
	public static void main(String[] args) {
		opNumbers(7, 5, "*");
		
	}

}
