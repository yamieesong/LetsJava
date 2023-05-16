
public class Star {

	public static void main(String[] args) {
		/*
		 * 				x	y
		 * 1234*6789	4	1
		 * 123***789	3	3
		 * 12*****89	2	5
		 * 1*******9	1	7
		 * *********	0	9
		*/
		
		for(int x=0; x <= 4 ; x++) {
			for(int y = 0 ; (4-x) <= 0 ; y++) {
				System.out.print(" ");
			}
			
			for( int y = 0 ; (2*x)+1 <=9 ; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
