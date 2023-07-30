package pratice1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. initialize the firstnum ,secnum  and sum assign 0,1,0
		int firstNum=0;
		int secnum=1;
		int sum=0;
		//2.print the condition
				System.out.println(firstNum);

       //3.iterate the value from zero till 10
	    for ( int i=0; i<=10; i++);
	    {
		//4. add firstnum and secnum and as assign sum
		//5. assign firstnum to secnum
		//6. assign secnum to sum
		sum=firstNum+secnum;
		firstNum=secnum;
		secnum=sum;
		//7. print the sum
		System.out.println(sum);
		
	    }
}
}