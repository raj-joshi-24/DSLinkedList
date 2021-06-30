package agile.com;

import java.util.Scanner;

public class MergeList {
	static void mergeList(int a[],int b[],int c[])
	{
	int i=0,j=0,k=0;
	while(i<a.length&&j<b.length){
	if(a[i]<b[j]){
	c[k]=a[i];
	k++;
	i++;
	}
	else{
	c[k]=b[j];
	k++;
	j++;
	}
	}
	//remaining element of a array
	while(i<a.length)
	{
	c[k]=a[i];
	k++;
	i++;
	}
	//remaining element of b array
	while(j<b.length)
	{
	c[k]=b[j];
	k++;
	j++;
	}
	}
	public static void main(String[] args) {
		int[] a=new int[5];
		int[] b=new int[3];
		int[] c=new int[8];
		System.out.println("Enter array of 5 numbers ");
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
			a[i]=in.nextInt();
		
		System.out.println("Enter array of 3 numbers ");
		for(int i=0;i<3;i++)
			b[i]=in.nextInt();
		mergeList(a,b,c);
		System.out.println("List of Merged List C ");
		for(int i:c) {
			System.out.print(i+"  ");
		}	
	}
}
