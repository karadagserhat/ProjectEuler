package ProjectEuler;

public class SmallestMultiple {

	public static void main(String[] args) {

		
		 long maxNumber = Long.MAX_VALUE;
	        for (int n = 21; n < maxNumber; n++) {
	            if (n % 20 == 0 && n % 19 == 0 && n % 17 == 0 && n % 16 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0
	                    && n % 9 == 0 && n % 7 == 0 && n % 5 == 0 && n % 3 == 0 && n % 2 == 0) {
	                System.out.println(n);
	                break;
	            }
	            
	        }
		/*long c = 21;
		while(true) {
			boolean cevap = true;
			for(int i = 1; i < 21; i++) {
				cevap = true;
				if(c % i != 0) {
					cevap = false;
					break;
				}
			}
			
			if(cevap)
				System.out.println(c);
				
			c++;
		}*/
	}

}
