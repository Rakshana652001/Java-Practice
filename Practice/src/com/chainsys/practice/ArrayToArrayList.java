package com.chainsys.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayToArrayList {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number for array: ");
		int num = scan.nextInt();
		
		String arr[] = new String[num];
		for(int i=0;i<num;i++)
		{
			arr[i] = scan.next();
		}
		
		ArrayList list = new ArrayList(Arrays.asList(arr));
		System.out.println(list);
		scan.close();
		// TODO Auto-generated method stub

	}

}
