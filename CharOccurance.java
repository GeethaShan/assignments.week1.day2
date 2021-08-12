package assignments.week1day2;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		int count=0;
		for (int i=0; i<charArray.length; i++) {
			if (charArray[i] == 'e') {
					count = count+1;
			}
	}
		System.out.println("Number of occureneces of character e is "+count);

}
}
