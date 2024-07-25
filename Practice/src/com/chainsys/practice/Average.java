package com.chainsys.practice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		int small = arr[0];
		int large = arr[0];
		int sum =  arr[0];
		
		for(int i=1;i<num;i++)
		{
			sum += arr[i];
			if(arr[i]<small)
			{
				small = arr[i];
			}
			else if(arr[i]>large)
			{
				large = arr[i];
			}
				
		}
		
		float avg = ((sum-large-small)/(num-2));
		System.out.println(avg);
		scan.close();
		// TODO Auto-generated method stub

	}

}
