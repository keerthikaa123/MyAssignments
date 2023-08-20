package week5.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionset 
{

	public static void main(String[] args) {
		int[] number= {10,40,70,10,50};
		Set<Integer>val=new TreeSet<Integer>();
		for(int i=0; i<number.length;i++)
		{
		val.add(number[i]);
		}
		List<Integer>values=new ArrayList<Integer>(val);
		System.out.println(values);
		int size1=values.size();
		
		int secondlargest=values.get(size-2);
		System.out.println(secondlargest);
	}
		
		

	

}
