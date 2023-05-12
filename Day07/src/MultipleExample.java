/*
 * 구구단 출력하기
 */
public class MultipleExample {

	public static void main (String[] args) {
		
		// 2단
		System.out.println("구구단 출력하기\n\n\t[2단]");
		for(int y = 1; y <= 9 ; y++) {
			System.out.println("\t· 2 x " + y + " = " + (2*y));
		}
		
		// 예제)구구단 2단~9단까지 출력시키기
		for(int x = 2; x <= 9; x++) {
			System.out.println("\n\t[" + x + "단]");
			for(int y = 1; y <= 9; y++)  {
				System.out.println("\t· " + x + " x " + y + " = " + (x*y));
			}
		}
	}
}
