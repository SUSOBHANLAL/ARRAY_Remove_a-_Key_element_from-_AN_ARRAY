package com.remove;
import java.util.*;
public class susobhan {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5,4,7};
		int arr1[]= new int[50];
		int n = arr.length;
		int key = 4;
		int j = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=key) {
				
				arr1[j]=arr[i];
				
				j++;
			}
			
			
			
			
		}
		for (int ai=0; ai<j; ai++)
		{
			System.out.print(arr1[ai]+" ");
		}
		

	}

}
