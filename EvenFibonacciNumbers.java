package ProjectEuler;

public class EvenFibonacciNumbers {
	

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int bound = 4_000_000;
		int ciftSum = 0;
		
		while(true) {
			int newFib = first + second;
			first = second;
			second = newFib;
			
			if(newFib > bound)
				break;
			
			if(newFib % 2 == 0)
				ciftSum += newFib;
		}
		
		System.out.println(ciftSum);
		
	}

}
