package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest1 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{		
		System.out.println("Enter number for array: ");
		int num = getNum();
		
		System.out.println("Enter numbers for array: ");
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.println("Second Largest: "+getSecondLargest(arr, num));
	}

	private static int getNum()
	{
		int num = scan.nextInt();
		if(num <=1)
		{
			System.out.println( "Enter greater that 1");
			System.out.println("\nEnter number for array greater than 1: ");
			return getNum();
		}
		else
		{
			return num;
		}
	}

	@SuppressWarnings("null")
	private static String getSecondLargest(int[] arr, int num)
	{
		if(arr == null && arr.length <= 2)
		{
			return "No such element";
		}
		Arrays.sort(arr);
		int largest = arr[num-1];
		for(int i=arr[num-2];i>=0;i--)
		{
			if(largest!=arr[i])
			{
				return String.valueOf(arr[num-2]);
			}
		}
		return "No Such Element";
	}

}
