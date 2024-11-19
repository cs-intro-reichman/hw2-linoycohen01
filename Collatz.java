// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int count = 0; 
		if (mode.charAt(0) == 'v'){
		for (int i = 1; i <= N; i ++)
		{
		int seed = i;
		while (seed != 0){
				System.out.print(seed + " ");
				if (seed % 2 == 0){
					seed = (seed /2);
				} else {
					seed = (seed * 3 + 1);
				}
				if (seed == 1)
					seed = 0;

				count++;
				}
				System.out.print(1 + " ");
			System.out.print("(" + (count+1) + ")");
			count = 0;
			System.out.println();
			}
			System.out.println("Every one of the first " + N + " hailstone sequences reached 1." );
		}
		if (mode.charAt(0) == 'c'){
			for (int i = 1; i <= N; i ++)
			{
			int seed = i;
			while (seed != 0){
					if (seed % 2 == 0){
						seed = (seed /2);
					} else {
						seed = (seed * 3 + 1);
					}
					if (seed == 1)
						seed = 0;
	
					count++;
					}
				count = 0;
				}
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1." );

		}}}

		
	

