package week2.day3;

public class Desktop extends Computer{

	public static void desktopSize()
	{
		System.out.println("DESKTOP SIZE");
	}
	public static void main(String[] args)
	{
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
