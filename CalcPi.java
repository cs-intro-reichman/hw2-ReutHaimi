// Computes an approximation of PI.
public class CalcPi {
	public static void main(String args[]) {
	int index = Integer.parseInt(args[0]);
	int nextNumber = 3;
	double sum = 1;
	boolean isPositive = false;

	// Because the first number is already defined (sum = 1), the loop will run from the second time.
	while (index > 1){
		if (isPositive == false){
			sum = sum - (1.0 / nextNumber);
		} else { 
			sum = sum + (1.0 / nextNumber);
		} 

		isPositive = !isPositive;
		nextNumber += 2;
		index --;
	}
	System.out.println("pi according to Java: " + Math.PI);
	System.out.println("pi, approximated:     " + sum * 4);

	}
}
