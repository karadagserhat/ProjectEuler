package ProjectEuler;

public class SumSquareDifference {

	public static void main(String[] args) {
		long a = 0;
		long b = 0;
	
		for(int i = 1; i < 101; i++) {
			a += Math.pow(i, 2);
		}
		
		for(int i = 1; i < 101; i++) {
			b += i;
			
		}
		
		System.out.println(Math.pow(b, 2) - a);		

	}

}
