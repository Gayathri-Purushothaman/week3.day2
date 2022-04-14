package Week3.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new  int[]{0,1,2,4,6};
//System.out.println(arr.length);
int order=0;
for(int i=0;i<arr.length; i++)
{
	if (arr[i] != order)
	{
		System.out.println("missing number in array :" + order);		
	}
	order++;
}
}
}

		