/*
 * Lotto는 0~45개 중 6개 뽑음 6/45
 * Lotto를 6/x로 작업해보기
 * 
 * java ArrayLottoExample 1000 (1~1000까지의 숫자 중 6개를 뽑는 프로그램)
 * arguments에서 인자를 2개 받아 작업해보기 (뽑을 숫자, 최대숫자)
 */
public class ArrayLottoExample {

	
	public static void main (String[] args) {						//사용자의 입력값에 따라 달라지는 동적배열
		/* 사용법 validation check */
		if(args.length == 0 || args.length < 2) {					//이 조건이 참이되는 순간 문구를 출력하고 종료
			System.out.println("사용법 : java ArrayLottoExample <출력 수> <최대 수>");
			System.out.println("ex) java ArrayLottoExample 10 100");
			return;
		}

		
		/* 로또번호 생성 시작 */
		int lineNum = Integer.parseInt(args[0]);					//뽑을 숫자
		int maxNum = Integer.parseInt(args[1]);						//최대숫자 (ex : lotto 6/1000, 6/200). 사용자가 입력한 값을 넣는 변수
		
		
		int[] lotto = new int[lineNum];								//로또는 6개의 숫자를 골라야 해서 배열의 크기는 6
		
		/* 로또번호 배열에 넣기 */
		for(int x = 0; x < lotto.length ; x++ ) {
			int num = (int)(Math.random() * maxNum) +1;				//랜덤값 만들기
			lotto[x] = num;											//랜덤값 lotto 배열에 넣기 Math.random()*원하는 최대숫자 +1
		}
		
		/* 로또번호 출력하기 */
		System.out.println("생성된 로또번호");
		for(int x = 0; x < lotto.length ; x++) {
			System.out.print(lotto[x] + "\t");
		}
		
		System.out.println("\n프로그램을 종료합니다.");
		
	}
}
