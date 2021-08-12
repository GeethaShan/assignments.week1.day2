package assignments.week1day2;

public class Calculator {
	
	//add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	public int add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
		
	}
	
	//sub(int num1, int num2), it should return subtraction of num1-num2
	public int sub(int num1, int num2) {
		int subValue = num1 - num2;
		return subValue;
	}
	
	//mul(double num1, double num2), it should return product of num1 * num2
	public double mul(double num1, double num2) {
		double product = num1 * num2;
		return product;
	}
	
	//divide(float num1, float num2), it should return division of num1 / num2
	public float divide(float num1, float num2) {
		float divValue = num1/num2;
		return divValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
