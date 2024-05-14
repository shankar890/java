package javaprogarme;

import java.util.Map;
import java.util.TreeMap;

public class count_letter_accounce {

	public static void main(String[] args) 
	{

		String s1="shankarkumar";
		char[] ch =s1.toCharArray();

		int count=0;
		Map<Character,Integer>map=new TreeMap<>();

		for(int i=0;i<ch.length;i++) {
			count=0;
			for(int j=0;j<ch.length;j++)
			{
				//character1.equals(character2)
				if(ch[i]==(ch[j]))
				{
					count++;

				}
			}

			map.put(ch[i], count);
		}


		System.out.println(map);


	}

}
