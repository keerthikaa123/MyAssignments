package week5.day5;

import java.util.Set;
import java.util.TreeSet;

public class StringtoChar {
		public static void main(String[] args) {
			String name="Keerthika";
			char[] alpa=name.toCharArray();
			Set<Character> name1=new TreeSet<Character>();
			for(Character name2: alpa) {
				name1.add(name2);
			}
			System.out.println(name1);
		}
		}

