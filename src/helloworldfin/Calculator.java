package helloworldfin;

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
	
	public static void main(String[] args) {
		addNumbers(4, 5);
		subNumbers(9,4);
		mulNumbers(3,4);
		divNumbers(15,3);
		
	}

}
