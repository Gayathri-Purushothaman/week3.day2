package Week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="mam";
String rev="";
char[] ch=new char[str.length()];
//int l=0;
for(int i=str.length()-1;i>=0;i--)
{
	ch[i]=str.charAt(i);
	rev=rev+ch[i];
	
	}
if(rev.equalsIgnoreCase(str))
{
	System.out.println("The given string"+str +"is a palindrome");
}
else
{
	System.out.println("The given string is not a palindrome");
}
	
}
	}


