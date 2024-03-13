package searching_sorting;

import java.util.Scanner;

public class LinearSearch_Intenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int yamaete[] = {45,35,20,78,90,60,65,15,14,25};
		System.out.print("Enter search data : ");
		int data =sc.nextInt();
		search(yamaete,data);
		
	}

	public static void search(int[] yamaete, int data) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<yamaete.length;i++) 
		{
			if(yamaete[i]==data) 
			{
				System.out.println(data+" is found at "+i+".");
				break;
			}
		}
		if(i==yamaete.length) 
		{
			System.out.println(data+" is not found in a given array.");
		}
		
	}

}
