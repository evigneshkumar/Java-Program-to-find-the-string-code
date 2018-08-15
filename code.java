import java.io.*;
import  java.util.*;
import java.lang.Math;

// Read only region start
class UserMainCode
{

	public int findStringCode(String input1){
		// Read only region end
		// Write code here...
	   input1=input1.toLowerCase();
	int i=0,j=0,sum=0;
		String concat="";
		String s[]=input1.split(" ");
	for(i=0;i<s.length;i++)
	{
		sum=0;
		int n=s[i].length();
		for(j=0;j<n/2;j++)
		{
			System.out.println(s[i].charAt(j)+""+s[i].charAt(n-j-1));
		     sum+=Math.abs((s[i].charAt(j)-'a'+1)-(s[i].charAt(n-j-1)-'a'+1));
			System.out.println(sum);
		}
		if(n%2!=0)
		{  System.out.println("hi");
			sum+=(s[i].charAt(n/2)-'a'+1);
		 System.out.println(sum);
		}
		concat=concat+sum;	
		}
		
	
	return Integer.parseInt(concat);
	}
	}
	
		