package javaprogarme;

public class Remove_Duplicate {

	public static void main(String[] args) 
	{

		String s1="aaaaabbbbbbbbggggrrrrriii";
		char[] ch = s1.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{

			boolean repated=false;
			for(int j=0;j<i;j++)
			{
				if(ch[i]==ch[j])
				{
					repated=true;
					break;
				}
			}
			if(!repated) {
				sb3.append(ch[i]);
			}
		}
		System.out.println(sb3);
	}

}
