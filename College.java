package Week3.day2;

public class College extends University {

	public void ug()
	{
		System.out.println("Abstract method UG implemented in college class");
	}
	public static void main(String[] args) {
	
	University coll=new College();
		coll.pg();
		coll.ug();
	}

}
