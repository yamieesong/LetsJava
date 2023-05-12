
public class ForExample {

	public static void main (String[] args) {
		
		// 가장 많이 쓰는 경우
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		// for문 내부의 부분들은 필수가 아님 비워져 있어도 실행은 됨
		// 두 번째로 많이 쓰는 거
		int i = 1;
		for(;i <= 100; i++) {
			System.out.println(i);
		}
		
		// 이렇게는 잘 안쓴다
		i = 1;
		for(;i <= 100;) {
			System.out.println(i++);
		}
		
		// 무한루프..!
		for(;;) {
			
		}
		
	}
}
