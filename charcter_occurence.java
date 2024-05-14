package javaprogarme;

import java.util.Map;
import java.util.TreeMap;

public class charcter_occurence {

	public static void main(String[] args)
	{

		String s1="shankarkymar";
		
		char[] s2 = s1.toCharArray();
		int length = s2.length;
		int count=0;
		
		Map<Character,Integer>map=new TreeMap<>();
		
		for(int i=0;i<length;i++)
		{
			
			count=0;
			for(int j=0;j<length;j++)
			{
				if(s2[i]==s2[j])
				{
					
					count++;
				}
				
				
				
			}
			map.put(s2[i], count);
		}
		
		
		
		System.out.println(map);
		
		
		
	}

}
