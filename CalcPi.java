// Computes an approximation of PI.
public class CalcPi {
	public static void main(String args[]) {
	int index = Integer.parseInt(args[0]);
	double nextNumber = 3;
	double sum = 1;
	boolean isPositive = false;
	while (index > 0){
		if (isPositive == false){
			sum = sum - (1 / nextNumber);
		} else { 
			sum = sum + (1 / nextNumber);
		} 
		System.out.println(sum);
		isPositive = !isPositive;
		nextNumber += 2;
		index --;
	}
	System.out.println("pi, according to Java: " + Math.PI);
	System.out.println("pi, approximated: " + sum * 4);
	}
}
