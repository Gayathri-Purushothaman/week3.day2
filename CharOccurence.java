package Week3.day2;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome";
int count=0;
char[]ch=new char[str.length()];
ch=str.toCharArray();
int len=ch.length;
for(int i=0;i<=str.length()-1;i++)
{
	
	if(ch[i]=='e')
	{
		count++;
	}
	
}
System.out.println(count);

	}

}
