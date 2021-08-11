package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test ="changelowertouppercase";
		char arr[]=test.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			
			char c =arr[i];
			if(i % 2 !=0)
			{
				c= Character.toUpperCase(c);
				
			}
			System.out.println( "OddIndexToUpperCase :" + c );
		}
	
	}

}