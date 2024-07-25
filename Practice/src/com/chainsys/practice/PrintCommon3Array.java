package com.chainsys.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintCommon3Array {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for arr1: ");
		int num1 = scan.nextInt();
		int arr1[] = new int[num1];
		for(int i=0;i<num1;i++)
		{
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Enter number for arr2: ");
		int num2 = scan.nextInt();
		int arr2[] = new int[num2];
		for(int i=0;i<num2;i++)
		{
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("Enter number for arr3: ");
		int num3 = scan.nextInt();
		int arr3[] = new int[num3];
		for(int i=0;i<num3;i++)
		{
			arr3[i] = scan.nextInt();
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int one=0, two=0, three=0;
		while(one<num1 && two<num2 && three<num3)
		{
			if(arr1[one]==arr2[two] && arr2[two]==arr3[three])
			{
				list.add(arr1[one]);
				one++;
				two++;
				three++;
			}
			else if(arr1[one]<arr2[two])
			{
				one++;
			}
			else if(arr2[two]<arr3[three])
			{
				two++;
			}
			else
			{
				three++;
			}
			
		}
		System.out.println("Common numbers: "+list);
		scan.close();

	}

}
