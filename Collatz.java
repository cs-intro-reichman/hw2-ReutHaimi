// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	int Iterations = Integer.parseInt(args[0]);
	int i = 1;
	int nextNumber = 0;
	int seed = 1;
	boolean isGood = false;

	if (args[1].equals("v")){
	while (i <= Iterations){
		seed = i;
		nextNumber = seed;
		int counter = 1;
		System.out.print(seed + " ");
		if (seed == 1){
			isGood = true;
		}
		while (nextNumber != 1 || isGood == true) {
		if (nextNumber % 2 == 0){
			nextNumber = nextNumber /2; 
		}
		else {
			nextNumber = (nextNumber * 3) + 1;
		}
		System.out.print(nextNumber + " ");
		isGood = false;
		counter ++;
	}
		System.out.println("(" + counter + ")");
		System.out.println("");
		i++;
	}
}
	System.out.println("Every one of the first " + Iterations + " hailstone sequences reached 1.");
}
}
