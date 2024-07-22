package com.chainsys.practice;

import java.util.Scanner;

public class CompareTwoArray {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		
		int arr1[] = new int[num];
		int arr2[] = new int[num];
		
		System.out.println("Enter arra1: ");
		for(int i=0;i<num;i++)
		{
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter 2nd array: ");
		for(int i=0;i<num;i++)
		{
			arr2[i]=scan.nextInt();
		}
		
		boolean flag=true;
		
		
		for(int i=0;i<num;i++)
		{
			if(arr1[i]!=arr2[i])
				{
					flag=false;
				}
		}
		
		if(flag==true)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		scan.close();

	}

}
