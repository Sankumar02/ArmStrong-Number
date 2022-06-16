package com.Task_14_04_22;

import java.util.Scanner;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int orgNumber, number, sum = 0;
		Scanner arm = new Scanner(System.in);
		System.out.println("Enter the limit");
		int origin = arm.nextInt();
		int boundary = arm.nextInt();
		
		System.out.print("Armstrong numbers from 1 to 500:");
		
		for (int index = origin; index <= boundary; index++) 
		{
			orgNumber = index;
			
			while (orgNumber > 0)
			{
				number = orgNumber % 10;
				
				sum = sum + (number * number * number);
				
				orgNumber = orgNumber / 10;
			}
			
			if (sum == index) 
			{
				System.out.print(index + " ");
			}
			
			sum = 0;
		}
	}
}
