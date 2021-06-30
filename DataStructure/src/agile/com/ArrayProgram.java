package agile.com;

import java.util.Scanner;

class ArrayProgram{
	static int sum(int a[])
	{
		int s=0;
		for(int i=0;i<a.length;i++)
			s=s+a[i];
		return s;
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void main(String args[])
	{
	int a[]={10,20,304,5,6,78};
	int b[]={2,3,4,5,6};
	System.out.println("List of a array ");
	display(a);
	System.out.println("List of b array ");
	display(b);
	System.out.println("sum  of b array "+sum(b));
	
	}
}