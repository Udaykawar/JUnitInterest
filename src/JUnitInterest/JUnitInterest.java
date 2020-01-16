package JUnitInterest;
import java.io.*;
import java.util.Scanner;
import java.*;
public class JUnitInterest {
    
	
	  static Scanner sc=new Scanner(System.in);
	
     static float principleAmount=0;
     static float interestRate=0;
     static float numYears=0;
     static float SimpleInterest;
     static int x=5;
     static int y=5;
     static int z;
     
     public static float simpleInterest() throws ArithmeticException
     {
    	 System.out.println("Enter Principle Amount:");
    	 principleAmount=sc.nextFloat();
    	 System.out.println("Enter Interest Rate:");
    	 interestRate=sc.nextFloat();
    	 System.out.println("Enter Number Of Years:");
    	 numYears=sc.nextFloat();
    	
    	 SimpleInterest=(principleAmount*interestRate*numYears)/100;
    	 System.out.println("SimpleInterest:"+SimpleInterest);
    	 
		return SimpleInterest;
    	 
     }
    
     public static String helloWorld() {
 		String helloWorld = "Hello" + " World";
 		System.out.println("String matches");
 		return helloWorld;
 	}
     
    
	
}
