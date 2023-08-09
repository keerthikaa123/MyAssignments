package week4.day1Assignmentorg.system;

public class Desktop  extends Computer
{
public void desktopSize()
{
	System.out.println(26.4);
}
public static void main(String[] args) 
{
	Desktop newDesk = new Desktop();
	
	newDesk.desktopSize();
	newDesk.computerModel();
}

}
