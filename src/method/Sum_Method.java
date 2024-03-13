package method;

import java.util.Scanner;

public class Sum_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2 : ");
		int num2=sc.nextInt();
		int result=sum(num1,num2);
		System.out.println("Sum of numbers : "+result);
		sc.close();
	}
	public static int sum(int n1, int n2)
	{
//		int sum=n1+n2;
		return (n1+n2);
	}
	
}
