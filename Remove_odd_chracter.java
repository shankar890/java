package javaprogarme;

public class Remove_odd_chracter {

	public static void main(String[] args)
	
	{
		
	String s1="shankar";
	
	StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<s1.length();i++)
	{
		
		if(i%2==1)
		{
			
			sb.append(s1.charAt(i));
			
		}
		
		
		
	}
	
	String results = sb.toString();
	System.out.println(results);
	

	}

}
