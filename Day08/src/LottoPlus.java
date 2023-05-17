
public class LottoPlus {
	
	public static void main(String[] args) {
		/* 사용법 validation check */
		if(args.length != 2) {
			System.out.println("사용법 : java LottoPlus <뽑을 숫자 개수> <최대 숫자 크기>\nex) java LottoPlus 10 30");
			return;
		}
		
		/* 인자값 validation check */
		if(Integer.parseInt(args[0]) <= 0 || Integer.parseInt(args[1]) <= 0 ) {
			System.out.println("뽑을 숫자 개수와 최대 숫자 크기는 1 이상의 정수로 입력해주세요");
			System.out.println("사용법 : java LottoPlus <뽑을 숫자 개수> <최대 숫자 크기>\nex) java LottoPlus 10 30");
			return;
		}
		
		/* 사용자에게 받은 인자값으로 변수 뽑을 숫자 개수(numCnt)와 최대 숫자(maxNum) 초기화 */
		int numCnt = Integer.parseInt(args[0]);
		int maxNum = Integer.parseInt(args[1]);
		
		/* 배열 인덱스 */
		int[] lotto = new int[numCnt];
		
		/* 배열 초기화 및 출력 */
		System.out.println("LottoPlus 출력(1~"+ maxNum + "사이의 숫자를 " + numCnt + "개 뽑기)");
		System.out.print("[");
		for(int i = 0; i < numCnt; i++) {
			lotto[i] = (int)(Math.random()*maxNum)+1;
			if(i != lotto.length-1) {
				System.out.print(lotto[i] + " \t");
			}else {
				System.out.print(lotto[i]);
			}
			
		}
		System.out.println("]");
	}

}
