package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		String s="Paypal India";
		char[] charArr=s.toCharArray();
		Set<Character>set=new TreeSet<Character>();
		for(char ch:charArr)
		{
			set.add(ch);
			
		}
		for(char ch:set)
		{
			System.out.print(ch);
		}
		

	}

}
