package javaprogarme;

public class max_min {

	public static void main(String[] args) 
	{

		
		int arr[]= {32,21,12,32,45,665,43};
		
		
		int max=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
			{
				
			max=arr[i];
			}
			
			
		}
		
		
		System.out.println(max);
	}

}
