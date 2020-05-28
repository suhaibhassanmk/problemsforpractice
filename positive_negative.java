package myproject;

import java.util.Scanner;

public class positive_negative 
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
		else if(a > 0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}
