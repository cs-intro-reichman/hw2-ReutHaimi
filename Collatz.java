/*
Feedback:
Great work!
Yam
*/




// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int Iterations = Integer.parseInt(args[0]);
	int i = 1;
	int nextNumber = 0;
	int seed = 1;


	if (args[1].equals("v")){

	//Calculating all operations per row
	while (i <= Iterations){
		seed = i;
		nextNumber = seed;
		int counter = 1;
		System.out.print(seed + " ");

		// The first iteration is on 1 and the rest are where the term is different from 1.
		do { 
		if (nextNumber % 2 == 0){
			nextNumber = nextNumber /2; 
		}
		else {
			nextNumber = (nextNumber * 3) + 1;
		}
		System.out.print(nextNumber + " ");

		counter ++;
	} while (nextNumber != 1);


	// printing the amount of numbers
		System.out.println("(" + counter + ")");
		if (nextNumber != 1){
			System.out.println("");
		}
		i++;
	}
}

	System.out.println("Every one of the first " + Iterations + " hailstone sequences reached 1. ");


}

}


