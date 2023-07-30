package pratice1;

public class Duplicate
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     // 1.declare the variable as num  and the assign   the values
		int[] num = {1,2,4,5,2,5,1,8,9};
	// 2.loop through the array from 0 till the length of array
		for( int i=0; i<num.length;i++)
		{
		//3.loop through the array from i+1 till  the length of array
		     for( int j=i+1;j<num.length;j++)
		       {
		    //4.check the condition
                 if(num[i]==num[j])
			{
		//5. print num i if the condition is true
				System.out.println(num[i]);
			}
		}
			
		}
	}
}

	


