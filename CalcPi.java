// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		double sum = 1.0;
		double m = 3; // the devisor
		for (int i = 0; i < times -1; i++)
		{
			if (i % 2 == 0){
				sum -= (1 / m);
			} else if (i % 2 != 0){
				sum += (1 / m);	
			}
			m += 2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (sum * 4));

	}
}
