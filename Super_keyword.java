package javaprogarme;


class News
{
	void abc()
	{

		System.out.println("we are in super");
	}
}
public class Super_keyword extends News
{


	void abc()
	{

		System.out.println("we are in sub");
		super.abc();
	}


	public static void main(String[] args) 
	{


		Super_keyword sub=new Super_keyword();
		sub.abc();


	}

}
