package week1.day2;

public class CharOccrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		System.out.println(str);
	 
		int count = str.length() - str.replace("e", "").length();
		System.out.println("occurrence of e: "+ count);
	}

}
