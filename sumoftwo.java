package myproject;

import java.util.Scanner;

public class sumoftwo 
{

	public static void main(String[] args) 
	{
		int a;
		int b;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		int c = a + b;
		System.out.println("The sum of "+a+" and "+b+" is "+c);
	}

}
