package Week3.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {3,2,11,4,6,7};
int[]b= {1,2,8,4,9,7};
int[]c= new int[a.length+b.length];
int d=0;
for(int i=0;i<=a.length-1;i++)
{
	for(int j=0;j<=b.length-1;j++)
	{
		if(a[i]==b[j])
				{
			 c[d]= a[i];
			 d++;
				}
	}
	
}
System.out.println("The intersected elements of the array are");
for(int i=0;i<d;i++)
{
	System.out.println(c[i]+"");
}
	}

}
