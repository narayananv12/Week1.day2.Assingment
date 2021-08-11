package week1.day2;

public class Calculator {

	
	
	public int add() 
	{
		int num1= 50, num2 = 20, num3=30;
		int sum = num1+num2+num3;
		return sum;
	}
	
	public int sub() {
		int num1 = 50, num2 = 20;
		int substraction = num1-num2;
		return substraction;
	}
	
	public double mul() 
	{
		double num1 = 20, num2 = 10;
		double product = num1*num2;
		return product;
	}
	
	public float divide() 
	{
		float num1 = 50, num2 = 20;
		float division = num1/num2;
		return division;
	}
	
	
	public static void main(String[] args) {
		Calculator math = new Calculator();
		int sum = math.add();
		System.out.println("The result of addition :   " +  sum);
		int substraction =math.sub();
		System.out.println("The value of substraction:   " + substraction);
		double product = math.mul();
		System.out.println("The value of multiplication:  " + product);
		float division =  math.divide();
		System.out.println("The vlaue of division: " + division);
		
	}
		
		
	}


