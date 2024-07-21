package com.chainsys.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateInteger {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for array: ");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Original array: "+Arrays.toString(arr));
		for(int i=0;i<num;i++)
		{
			for(int next=i+1;next<num;next++)
			{
				if(arr[i] == arr[next])
				{
					arr[next] = arr[num-1];
					num--;
					next--;
				}
			}
		}
		
		int arr1[] = Arrays.copyOf(arr, num);//last size array copy
		System.out.println("After removing: "+Arrays.toString(arr1));
		
		scan.close();
	}

}
