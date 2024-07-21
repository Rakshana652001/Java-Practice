package com.chainsys.practice;

import java.util.Scanner;

public class AddtionPairPrint {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number for array: ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int count = 0;
		System.out.println("Enter a number: ");
		int sum = scan.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int next=0;next<num;next++)
			{
				if(arr[i]+arr[next] == sum)
				{
					count++;
					System.out.println(arr[i]+" + "+arr[next]+" = "+sum);
				}
			}
		}
		
		if(count>0)
		{
			System.out.println("");
		}
		else
		{
			System.out.println("No such pairs");
		}
		
		scan.close();
		// TODO Auto-generated method stub

	}

}
