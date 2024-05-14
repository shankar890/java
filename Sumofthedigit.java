package javaprogarme;

public class Sumofthedigit {

	public static void main(String[] args) 
	{
		String s1="shankar87";
		int sum=0;
		int count=0;
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				
				
				sum=sum+i;
			}
			
			
		}
		
		
		System.out.println(sum);
		

		}
		
		
	
}
