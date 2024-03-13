package method;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Factorial Number : ");
		int n = sc.nextInt();
		int result = factorial(n);
		System.err.println(n + "! = " + result);

	}

//	public static int factorial(int n) 
//	{
//	int fact=1;
//	for (int i=1;i<=n;i++) 
//	{
//		fact = fact*i;
//	}
//	return fact;
//	}
	// Factorial Method
//	public static int factorial(int n) {
//		int fact = 5;
//		for (int i = n; i >= 1; i--) {
//			fact = fact * i;
//		}
	//	return fact;
//	}
	//stop method
	public static int factorial(int n) {
		if(n==1) return 1;
		else 
		return n*factorial(n-1);
	}
}
