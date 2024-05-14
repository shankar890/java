package javaprogarme;

public class Missig_value {

	public static void main(String[] args)
	{

	int arr[]= {1,2,3,4,5,7,8,9,10};	
		
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[j])
			{
				System.out.println(i);
			}else {
				j++;
			}
		}
		
	}

}
