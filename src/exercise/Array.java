package exercise;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number : ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
