package helloworldfin;
import java.util.Scanner;

public class CheckString {
	
	public static void compString(String inp) {
		String hc = "Hello World";
		if (inp.equals(hc)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = inp.nextLine();
		
		compString(str);
	}

}
