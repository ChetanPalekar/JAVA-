/*
This program checks the hightest number of a character that is occuring consecutively 
this program does not work if more then 1 element occur at same highest number of times*/

import java.util.*;

class occurance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char z,x;
		char s[];
		int count1=1,count2=1;
		System.out.println("enter Number of element in ARRAY: ");
		int v=sc.nextInt();
		if (v==0) {
			System.out.println("Error: Array can not be empty");
			System.exit(0);
		}
		
			s=new char[v];
		
		

	for(int i=0;i<s.length;i++)				//ACCEPT CHAR INPUT IN ARRAY s[]
	{
		System.out.println("enter alp: ");
		s[i]=sc.next().trim().charAt(0);
	}
	z=s[0];
	x=s[0];
	for(int i=0;i<s.length;i++)// Compare logic
	{										
		if (z==s[i] && i!=0)//check every consiqutive element if equal and i!=0 is because we dont want to check s[0]=s[0] as z=s[0]
		{
			count1++;
			if (count1>count2)//to store the highest occuring element and its count
			{
				x=z;
				count2=count1;
			}
		}
		else//if two conseqtive are not equal
		{
			
			count1=1;//initilize for next iternation
			z=s[i];
		}
	}
	if (count2==1) {//all elemets occure just 1'c
		System.out.println("NO Highest occurance");		
	}
	else{
		System.out.println("Highest "+x+" "+ count2+" Times");
	}
	}
}
