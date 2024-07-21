package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateString {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		String arr[] = new String[num];
		System.out.println("Enter "+num+" string:");
		for(int i=0;i<num;i++)
		{
			arr[i]=scan.next();
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<num-1;i++)
		{
			for(int next=i+1;next<num;next++)
			{
				if(arr[i].equals(arr[next]) && i!=next)
				{
					System.out.println("Duplicate: "+arr[next]);
				}
			}
		}
		
		
		scan.close();

	}

}
