package javaprogarme;

public class Reverce_of_string {

	public static void main(String[] args) {

		String s1="Ramesh";
		int size = s1.length();
		String s2="";
        for(int i=size-1;i>=0;i--)		
        {
        	char newString = s1.charAt(i);
        	
        	String S = s2+newString;
        	System.out.println(S);
        	
        	
        }
		
		
	}

}
