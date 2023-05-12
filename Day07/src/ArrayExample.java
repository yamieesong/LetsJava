
public class ArrayExample {

	
	public static void main(String[] args) {
		
		
		/* 배열 */
		// 1.선언과 공간할당(방)을 따로 선언하는 방법
		// 1-1.배열을 선언
		int odd[];
		
		// 1-2.배열의 초기화
		odd = new int[4];
		
		
		// 2.선언과 동시에 초기화. 아무런 값을 대입하지 않으면 int 타입의 기본값인 0으로 초기화됨.
		int odd2[] = new int[4];
		
		
		// 3.배열 객체에 인덱스 번호를 가지고 초기화
		odd2[0] = 1;
		odd2[1] = 3;
		odd2[2] = 5;
		odd2[3] = 7;
		
		
		// 4.배열 선언과 동시에 배열의 값을 초기화
		int odd3[] = {2,4,6,8};
		
		System.out.println("odd2[]\todd3[]");
		for(int i = 0; i <= 3; i++) {
			System.out.print(odd2[i] + "\t");
			System.out.println(odd3[i]);
		}
		
		System.out.println("\n\n");
		for(int i = 0; i < odd3.length; i++) {
			System.out.println(odd2[i]);			
		}
		
		System.out.println("\n\n");
		
		// 예제) 10개짜리 방을 만들고, 3의 배수로 채우자
		int[] odd4 = new int[10];		//여기는 0부터 시작하는게 아니고 내가 만들 배열의 크기를 쓰면 됨! 
		int idx = 0;
		for(int x = 1; x <= 100; x++) {
			if(x % 3 == 0) {
				System.out.println("배열의 index(호실) : " + idx + " 들어간 값 : " + x );
				if(idx >= 9) {
					break;
				}
				odd4[idx++] = x ;		//idx++, ++idx 차이 공부하기..
			}
			
		}
		
		
		System.out.println("\n\n");
		odd4 = new int[10];
		idx = 0;
		for(int x = 1; x <= 100; x++) {
			//홀수만 넣기..
			if(idx > 9) {
				break;
			}
			if(x % 2 == 0) {
				continue;
			}
			System.out.println("odd[" + idx + "] = " + x );
			odd4[idx++] = x;
			
		}
		
		
		
	}
}
