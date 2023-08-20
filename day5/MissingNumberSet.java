package week5.day5;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberSet {
		public static void main(String[] args) {
			int[] num= {3,2,4,1,3,5,7,6,9,6};
			Arrays.sort(num);
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}
			Set<Integer> a=new TreeSet<Integer>();
			for(Integer b : num) {
				a.add(b);
			}
			System.out.println();
			System.out.println(a);
			Integer[] array=new Integer[a.size()];
			int j=0;
			for(Integer i: a) {
				array[j++]=i;
			}
			for(int k=0;k<array.length;k++) {
				if(array[k]!=k+1) {
					System.out.println(k+1);
				}
			}
			
		}
		}

