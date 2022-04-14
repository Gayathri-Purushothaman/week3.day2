package Week3.day2;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="&&Welcome to 2nd class of Automation";
int letter=0,space=0,number=0,spl=0;
char[]ch=new char[test.length()];
ch=test.toCharArray();
for(int i=0;i<=test.length()-1;i++) {
	if(Character.isLetter(ch[i]))
	{
		letter=letter+1;
	}
	else if(Character.isSpace(ch[i]))
	{
		space=space+1;
	}
	else if(Character.isDigit(ch[i]))
	{
		number=number+1;
	}
	else 
	{
		spl=spl+1;
	}
}
	System.out.println(letter);
	System.out.println(space);
	System.out.println(number);
	System.out.println(spl);
	


	}

}
