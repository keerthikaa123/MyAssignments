package week1.day1;
public class Mobile {
public void  SendMessge() 
{
	System.out.println( "Send  Message" );
}
public void ShareDocument() 
{
System.out.println("Share Document");	
}
public void  calling() 
{
	System.out.println("Make Calling");
}
public static void main (String[] args)
{
	Mobile MyMobile=new Mobile();
	MyMobile.SendMessge();
	MyMobile.ShareDocument();
	MyMobile.calling();  

      }
}
