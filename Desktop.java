package Week3.day2;

public class Desktop implements Hardware,Software {

	public void desktopModels()
	{
		System.out.println("Desktop models method of class desktop");
	}
	public void hardwareResources()
	{
		System.out.println("Harware Resources model of Hardware Resources Interface");
	}
	public void softwareResources()
	{
		System.out.println("Software Resources model of software Resources Interface");
	}
	public static void main(String[] args) {
		
Desktop d=new Desktop();
d.desktopModels();
d.hardwareResources();
d.softwareResources();
	}

}
