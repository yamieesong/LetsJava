
public class MultipleArrayExample {
	
	public static void main(String args[]) {
		
		/* 1차원 배열 */
		// 1. 1차원 배열  선언
		int[] a;
		
		// 2. 선언과 인덱스 만들기 3열
		int[] a1 = new int[3];
		
		// 3. 선언과 동시에 초기화
		int[] a2 = {1,2,3};

		// 4. for문으로 전체 출력
		System.out.println("1차원배열 출력");
		for(int i=0;i < a2.length ; i++) {
			System.out.println("\ta2[" + i + "] : " + a2[i]);
		}
		
		System.out.println("");
		
		/* 2차원 배열 */
		// 1. 2차열 배열 선언
		int[][] b;
		
		// 2. 선언과 인덱스 만들기 2행3열
		int[][] b1 = new int[2][3];
		
		// 3. 선언과 동시에 초기화
		int[][] b2 = { {1,2,3}
					  ,{3,4,5}
					 };
		
		// 4. for문으로 전체 출력
		System.out.println("2차원배열 출력");
		for(int x = 0; x < b2.length ; x++) {					//행으로 접근
			for(int y = 0 ; y < b2[x].length ; y++) {			//열으로 접근
				System.out.println("\tb2[" + x + "][" + y + "] : " + b2[x][y]);
			}
		}
		
		
		
	}

}
