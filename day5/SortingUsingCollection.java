package week5.day5;

import java.util.Arrays;

public class SortingUsingCollection {
	
		public static void main(String[] args) {
			String[] name=new String[]{"HCL","Wipro","Aspire Systems","CTS"};
			int name1=name.length;
			Arrays.sort(name);
			for(int i=0;i<name1;i++) {
				System.out.println(name[i]);
			}
			for(int i=name1-1;i>=0;i--) {
				System.out.print(name[i]+" ");
			}
			}
		}

