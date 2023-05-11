import java.util.Scanner;


public class WhileExample {

	public static void main (String[] args) {
		
		System.out.print("숫자를 1에서부터 몇 까지 출력할까요? : ");
		Scanner sc = new Scanner(System.in);						//입력 받을 때까지 대기 상태
		
		int maxNum = sc.nextInt();
		int startNum = 1;
		
		
		/* 반복문 while문 */
		while( maxNum >= startNum ) {								//조건에 true를 쓰는 경우 멈추지 않고 무한루프에 빠지게 된다 주의하기. 가변적인 조건식이 들어가야 함
			System.out.print((startNum) + "\t");	
			System.out.print((startNum ++) + "\t");					//"\t"는 탭  여기서 startNum++이거랑 startNum ++ 이거랑 왜 같은지..
			System.out.println(startNum);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("do~while문==================");
		System.out.println("");
		
		/* 반복문 do~ while문 */
		startNum = 1;
		do {
			System.out.println("최소 한 번은 실행");
			System.out.print((startNum ++) + "\t");	
		} while( maxNum >= startNum ) ;
		
		
		
	}
}
