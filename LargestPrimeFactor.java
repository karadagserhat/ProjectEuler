package ProjectEuler;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		for(int i = 2; i < n; i++)
		{
			while(n % i == 0) {
				n /= i;
			}
		}
		System.out.println(n);
		sc.close();

	}

}
