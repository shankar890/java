package javaprogarme;

import java.util.Arrays;

public class bubble_shot {

	public static void main(String[] args)
	{

		int[] arr= {676,65,21,23,0,-87,-90};
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
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

	}

}
