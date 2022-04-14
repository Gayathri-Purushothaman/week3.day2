package Week3.day2;

public class Automation extends MultipleLangauge {

	public void java()
	{
		System.out.println("I am implemented method of Java of Language interface");
	}
	public void selenium(){
		System.out.println("I am implemented method of Selenium of TestTool interface");
	}
	public void ruby()
	{
		System.out.println("I am implemented method of Ruby  of Automation abstract class");
	}
	
	public static void main(String[] args) {
		
Automation auto=new Automation();
auto.java();
auto.selenium();
auto.ruby();
auto.python();
	}

}
