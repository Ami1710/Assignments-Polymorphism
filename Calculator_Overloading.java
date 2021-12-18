package week2;

/*Method Overloading Assignment 15:
Create class calculator  with the below methods
- 2 methods for add, 1 method with 2 int args, 1 method with 3 int args
- 2 methods for multiply, 1 method with 2 int args, 1 method with 1 int and 1 double args
- 2 methods for subtract, 1 method with 2 int args, 1 method with 2 double args
- 2 methods to divide, 1 method with 2 int args, one to divide one double number with one int
create object for calculator class and execute all the methods*/

public class Calculator_Overloading {

	public int add(int adda, int addb)
	{
		int addtemp=adda+addb;
		return addtemp;
	}
	
	public int add(int addx, int addy, int addz)
	{
		int addtemp=addx+addy+addz;
		return addtemp;
	}
	
	public void multiply(int mula, int mulb)
	{
		int multemp=mula*mulb;
		System.out.println("Multiplication: " + mula +" * " + mulb + " = " + multemp);
	}
	
	public void multiply(int mulx, double muly)
	{
		double multemp=mulx*muly;
		System.out.println("Multiplication: " + mulx +" * " + muly +" = " + multemp);
	}
	
	public void divide(int diva, int divb)
	{
		int dtemp=diva/divb;
		System.out.println("Division: " + diva +" / " + divb + " = " + dtemp);
	}
	
	public void divide(int divx, double divy)
	{
		double divtemp= divx/divy;
		System.out.println("Division: " + divx +" / " + divy + " = " + Math.round(divtemp));
	}
	
	
	public void substract(int suba, int subb)
	{
		int subtemp = suba-subb;
		System.out.println("Substraction: " + suba+" - "+ subb+ " = "+subtemp);
	}
	
	public void substract(double suba, double subb)
	{
		double subtemp = suba-subb;
		System.out.println("Substraction: " + suba+" - "+ subb+ " = "+subtemp);
	}
	
	public static void main(String[] args) {
	
		Calculator_Overloading CO = new Calculator_Overloading();
		System.out.println("Int Addition: " + CO.add(5, 10));
		System.out.println("Int Addition: " + CO.add(5,0,100));
		CO.substract(15, 4);
		CO.substract(0.55, 15.55);
		CO.multiply(5, 1.30);
		CO.multiply(4, 0);
		CO.divide(4, 2.22);
		CO.divide(100, 2.25);		

	}

}
