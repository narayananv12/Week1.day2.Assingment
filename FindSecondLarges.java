package week1.day2;

import java.util.Arrays;



public class FindSecondLarges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		int length = data.length;
		Arrays.sort(data);
	
		System.out.println("Find second Largest Element: " + data [length-2]);
	}

}
