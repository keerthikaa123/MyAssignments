package week5.day5;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
   
   String text= "we learn java basics as  part of java sesssions in week1 We learn";
   
   String[] text1=text.split("\\s+");
	Set<String> text2=new LinkedHashSet<String>();
	for(String uniquevalue : text1) {
		text2.add(uniquevalue);
		}
	System.out.println(text2);
	}
}
   
   
  
   
   
	


