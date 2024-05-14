package javaprogarme;

import java.util.Arrays;

public class bubble_ssort {

	public static void main(String[] args) 
	{
		
		int arr[]= {64,32,21,12,34,89,76,90,34};
		
		
		int length = arr.length;
		
		for(int i=0;i<length-1;i++) {
			
			for(int j=0;j<length-1;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
					
				}
				
				
			}
			
		
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[2]);
		

	}

}
