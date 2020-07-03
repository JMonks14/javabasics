package helloworldfin;

import java.util.Scanner;
import java.util.function.BiPredicate;

public class CheckStringLambdas {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = inp.nextLine();
//		String hc = "This is a String";
		System.out.println("Please enter another string");
		String hc = inp.nextLine();
		BiPredicate bp = (Object a, Object b) -> a.equals(b);
		boolean ret = 
				bp.test(hc, str);
		
		System.out.println(ret);
		

		
	}

	
	}

	
	
	


