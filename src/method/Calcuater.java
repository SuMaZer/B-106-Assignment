package method;

import java.util.Scanner;

public class Calcuater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num1=sc.nextInt();
		char ch=sc.next().charAt(0);
		int num2=sc.nextInt();
		switch(ch) 
		{
		case '+':
			System.out.println("Ans : "+fadd(num1,num2));
		break;
		case '-':
			System.out.println("Ans : "+fsub(num1,num2));
		break;
		case '*':
			System.out.println("Ans : "+fmul(num1,num2));
		break;
		case '/':
			System.out.println("Ans : "+fdiv(num1,num2));
		break;
		}
		sc.close();
	}

	public static int fsub(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1-num2);
	}

	public static int fadd(int num1,int num2) {
		// TODO Auto-generated method stub
		return(num1+num2);
	}
	public static int fmul(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1*num2);
	}
	public static int fdiv(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1/num2);}
}
