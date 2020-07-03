package helloworldfin;

import java.util.function.Consumer;

public class HelloWorldLambdas {

	public static void main(String[] args) {
		
		helloWorld input = words -> System.out.println(words);
		input.printString("Hello World");

	}

	interface helloWorld {
		void printString(String s);
	}

}
