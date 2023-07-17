package week1.day1;

public class Car {
   public  void ApplyBreak() {
   
       System.out.println("Apply Break");
}
public void ApplyGear() {

	 System.out.println("ApplyGear");
}
public void SwitchOnAc() {

	System.out.println( "SwitchOnAc");
}
public void ApplyAccelerate() {

	System.out.println("Apply Accelerate");
}
public static void main(String[] args) 
{
	Car myCar=new Car();
	myCar.ApplyBreak();
	myCar.ApplyGear();
    myCar.SwitchOnAc();
	myCar.ApplyAccelerate();
	

     }
}