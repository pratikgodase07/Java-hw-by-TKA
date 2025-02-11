package org.tka;
import java.util.Scanner;


public class Rounddown {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in); //scanner class bcoz we take input from user
		
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		
		int result=rounddown(number);
		
		System.out.println("output: "+result);
		sc.close();
	}
	public static int rounddown(int num)
	{
		if(num%5==0)
		{
			return num;
			
		}
		else {
			return num-(num%5);
		}
	}

}
