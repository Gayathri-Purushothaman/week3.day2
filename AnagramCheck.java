package Week3.day2;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		AnagramCheck ac=new AnagramCheck();
		String str1="mam";
		String str2="pan";
		
		char[] charstr1=str1.toCharArray();
		char[] charstr2=str2.toCharArray();
		if(ac.checkAnagram(charstr1,charstr2))
			System.out.println("anagram");
		else
			System.out.println("Not an anagram");
}
	
	static boolean checkAnagram(char[]str1,char[] str2)
	{
		
		if(str1.length!=str2.length)
		{
			return false;
		}
		else
		{
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<str1.length;i++)
			{	
				if(str1[i]!=str2[i])
				{
					
					return false;
				}
			}
			
			return true;	
			
				
				
	

		}
	
	}
	
	
}
