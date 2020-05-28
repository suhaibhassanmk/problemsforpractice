package myproject;

import java.util.Scanner;

public class odd_even
{
	public static void main(String[] args) 
	{
		int a;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		if(a == 0)
		{
			System.out.println("Zero");
		}
		else if(a%2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
