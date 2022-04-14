package Week3.day2;

public class ReverseEvenWords {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEvenWords rev=new ReverseEvenWords();
		rev.reverse("I am a software tester");
		
		}
	public void  reverse(String str)
	{
		String[]words=str.split(" ");
		String result="";
		String k="";
		for(int i=0;i<words.length;i++)
		{
			 
			if(i%2==0)
			{
				System.out.print(" "+words[i]+" ");
				
				
			}	
			
				else
				{
				
			result=words[i];	
				}
			for(int j=result.length()-1;j>=0;j--)
			{
			k=""+result.charAt(j);
			System.out.print(k);
			}
			//System.out.print(result);
			result="";
				
		
		}
	
}}

	
	


