package arrayReviewBoersma;

public class arrayReviewBoersma {

	public static void main(String[] args) {
		//sets a constant of 10 for the size
		final int arraySize = 10;
		
		//creates an array named numbers and is the size of arraySize
		double[] numbers = new double[arraySize];
		
		//For loop that generates 10 random numbers between 1 and 25
		for(int i=0; i<numbers.length; i++){
			numbers[i] = (double)(Math.random()*25+1);

			System.out.printf("ArrayName element at index[" + i + "] = " + "%.1f",numbers[i]);
			System.out.println();
		}//end for loop

	}

}
