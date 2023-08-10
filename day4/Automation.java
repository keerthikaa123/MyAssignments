package week4.day4;

public  class Automation extends MultipleLanguage
{

	@Override
	public void java() 
	{
		System.out.println("java");
		
	}

	public void python()
	{
		System.out.println("python");
	}
	public void Selenium()
	{
		System.out.println("Selenium");
	}

	@Override
	public void ruby()
	{
		System.out.println("ruby");
		
	}
public static void main(String[] args)
{
	Automation auto=new Automation();
	auto.java();
	auto.python();
	auto.ruby();
	auto.Selenium();
}
}


	


