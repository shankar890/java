package javaprogarme;

import java.util.Arrays;

public class sort {

	public static void main(String[] args)
	{


		int arr[]= {45,27,28,74,63,43,03,13};

		int n = arr.length;

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{

				if(arr[j]>arr[j+1]) 
				{
					int temp=arr[j];
                	arr[j]=arr[j+1];
					arr[j+1]=temp;

				}
			}
		}

		System.out.println(Arrays.toString(arr));


	}

}
