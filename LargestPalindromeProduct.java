package ProjectEuler;

public class LargestPalindromeProduct {
	
	public static long reverse(long n) {
		long reverse = 0;
		long reduce;
		
		while(n > 0) {
			reduce = n % 10;
			reverse = (reverse * 10) + reduce;
			n /= 10;
		}
		return reverse;
	}
	
	public static boolean isPolindrome(long n) {
		return reverse(n) == n;
	}
	public static void main(String[] args) {
		long max = -1;
		for(int i = 999; i > 99; i--) {
			for(int j = 999; j > 99; j--) {
				int p = i*j;
				if(max < p && isPolindrome(p)) 
					max = p;
			}
		}
		
		System.out.println(max);
	}

}
