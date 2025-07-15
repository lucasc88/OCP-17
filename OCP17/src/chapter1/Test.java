package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	private String name = "Lucas";

	// Decimal declaration and possible chars are [0-9]
	static int decimal = 495;

	// HexaDecimal declaration starts with 0X or 0x and possible chars are
	// [0-9A-Fa-f]
	static int hexa = 0X1EF;

	// Octal declaration starts with 0 and possible chars are [0-7]
	static int octal = 0757;

	// Binary representation starts with 0B or 0b and possible chars are [0-1]
	static int binary = 0b111101111;
	
	//does NOT compile: _1000 , 1000_ , 100_.00 , 100.00_
	static int uglyUnderscoreNumber = 4____9_5;
	
	// When start with """ , all the spaces and new lines will be preserved.
	// Requires a line break in the beginning
	static String pyramid = """
			  *
			 ***
			*****""";
	
	// \" just put a " symbol. \n is a new line
	static String eyeTest = "\"Java Study Guide\"\n   by Scott & Jeanne";
	
	//var name = "asd"; //DOES NOT compile. var can be used only as a local variable

	public static void main(String args[]) {
		var var = "just a local var"; // var is NOT a reserved word
		// validLocalVariableAsVar = 2; DOES NOT COMPILE. Initially was set as a String
		// var requires an value when it's declared.
		// var nullVariable = null; DOES NOT COMPILE
		// var canBeNullAfterInitializedWithWrapperClass = "String";
		// canBeNullAfterInitializedWithWrapperClass = null; DOES COMPILE
		
		System.out.println("All number will be 495");
		System.out.println("decimal: " + decimal);
		System.out.println("hexa: " + hexa);
		System.out.println("octal: " + octal);
		System.out.println("binary: " + binary);
		System.out.println("uglyUnderscoreNumber: " + binary);
		System.out.println("Pyramid: ");
		System.out.println(pyramid);
		System.out.println(eyeTest);
		
		Test t = new Test();
		t.changeName(t);
		System.out.println(t.name);		
		
	}
	
	// var is not allowed as a parameter
//	public int sum(var a, var b) {
//		return a + b;
//	}
	
	String changeName(Test t) {
		return t.name = " has other name now.";
	}
}
