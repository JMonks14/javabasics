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
	
	private static int isInt() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;
		
		while (!(sc.hasNextInt())) {
			System.out.println("Please enter a valid integer");
			sc.next();
		}
		value=sc.nextInt();
		return value;
	}
	
	private static String isOp() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String value=sc.next();
		
		while (!(value.contentEquals("+") || value.contentEquals("-") || value.contentEquals("*") || value.contentEquals("/"))) {
			System.out.println("Please enter a valid operator: +, -, *, or /");
			value=sc.next();
		}
		return value;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter number 1: ");
		int num1 = isInt();
		System.out.println("Please enter number 2: ");
		int num2 = isInt();
		System.out.println("Please enter operator from: +, -, *, or /");
		String op = isOp();
		opNumbers(num1, num2, op);
	}

}
