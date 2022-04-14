package Week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text="We learn java basics as part of java sessions in java week1";
String result="";
String words[];
words=text.split(" ");
for(int i=0;i<words.length;i++)
{
	for(int j=i+1;j<words.length;j++)
	{
		if(words[i].equals(words[j]))
				{
			words[j]="remove";
				}
	}
}
for(String word: words)
{
	if(word!="remove")
	{
		result=result+word+" ";
		
	}
}
System.out.println("Sentence after removing duplicate words:"+result);

	}

	}


