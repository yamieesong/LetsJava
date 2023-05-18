
public class Star {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1234*
		 * 123***
		 * 12*****
		 * 1*******
		 * *********
		 */
		
		for(int i = 1; i <= 5; i++) {
			
			for(int x = 5; x <= 0; x--) {
				if(x-i > 0) {
					System.out.print("-");
				}
			}
			
			for(int x = 0; x <= 4 ; x++) {
				if((2*x)+1 <= 9) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		
		
	}

}
