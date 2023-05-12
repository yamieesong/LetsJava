
public class LoopKeyWordExample {
	
	/* Loop문(반복문)에서 사용되는 키워드
	 * 	1.break
	 * 	2.continue (p.106) 
	 */
	public static void main(String[] args) {
		
		System.out.println("반복문의 중지 break=================================");
		/* for문에서 break로 중지 */
		// 예제) 1부터 100까지의 합이 400을 넘으면 출력하지 않도록 하는 프로그램을 만들어라.
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 400) {
				break;
			}
		}
		System.out.println("총 합 : " + sum);
		
		
		// 문제) while문으로 바꿔보기
		sum = 0;
		int i = 1;
		while(sum < 400) {
			sum += i;
			i++;
		}
		System.out.println("총 합(while문) : " + sum);
		
		System.out.println("반복문의 중지 continue=================================");
		/* for문에서 continue로 중지 */
		// continue는 continue가 있는 현재 반복만 중지하고 다음 반복으로 계속 된다
		
		// 예제)짝수만 출력해라 (범위는 1~100)
		for(i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;	//if의 조건이 참이면 다시 for문을 반복하고 조건이 거짓일때 아래로 내려가서 아래 작업 수행. continue가 있으면 무시하고 다시 for문을 반복하러 올라감
			}
			System.out.println(i);			
		}
		
		// 문제) while문으로 바꿔보기
		System.out.println("짝수만 출력하기(while문)");
		i = 0;
		while(i <= 100) { //참인 경우에만 조건문 반복
			i++;
			if(i % 2 != 0) {
				continue;			//현재 반복을 중지하고 다시 다음 반복으로 계속. 풀이)1의 나머지는 1로 조건을 만족하여 이 조건은 중지하고 다시 위로 올라가 반복문을 진행한다. 
			}
			System.out.println(i);	//풀이) 2인 경우 continue가 있는 위 조건을 만족하지 않아 system.out.println을 수행하고 while문의 조건이 거짓이 될 때까지 반복을 진행한다.
		}
		
		
	}
}
