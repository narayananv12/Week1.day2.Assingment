package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator calobj = new Calculator();
		calobj.add();
		int resultadd = calobj.add();
		System.out.println("This is value of addition:  "  + resultadd);
		int resultsub = calobj.sub();
		System.out.println("This is value of Substraction : "  + resultsub);
		double resultmul = calobj.mul();
		System.out.println("This is value of multiplication : " + resultmul);
		float resultdivide = calobj.divide();
		System.out.println("This is value of dividie: " + resultdivide);
		
		
		
		
		
		
	}

}
