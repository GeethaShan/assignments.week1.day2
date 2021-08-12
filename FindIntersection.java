package assignments.week1day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Declare An array for {3,2,11,4,6,7};
		int[] arrayOne = {3,2,11,4,6,7};
		//Declare another array for {1,2,8,4,9,7};
		int[] arrayTwo = {1,2,8,4,9,7};
		
		//Declare for loop iterator from 0 to array length
		//Declare a nested for another array from 0 to array length
		for (int i=0; i<arrayOne.length; i++) {
			for (int j=0; j<arrayTwo.length; j++) {
				//Compare Both the arrays using a condition statement
				if (arrayOne[i] == arrayTwo[j]) {
					//Print the first array (should match item in both arrays)
					System.out.println("Element "+arrayOne[i]+" is present in both the arrays");
				}
			}
		}
		

	}

}
