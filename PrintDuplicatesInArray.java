package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int[] arr1 = {1,2,4,3,4,5,6,5,4,9,5};
		
		for (int i=0; i < arr1.length; i++) {
			for (int j= i+1; j < arr1.length; j++)
			{
				if (arr1[i]==arr1[j])
					System.out.println("The Duplicte number: " +  arr1[i]);
					
					
			}
			
		}

	}

}
