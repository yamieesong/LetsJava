public class Dpli{
	/* 로또번호 만들기(2차원배열. 중복제거) */
	public static void main(String[] args){
		/* 인자 수 Validation check */
		if(args.length != 1){
			System.out.println("사용법 : Java Dpli [뽑을 개수]\n예)Java Dpli 30");
			return;
		}

		/* 인자값 Validation check */
		int length = Integer.parseInt(args[0]);
		if(length <= 0){
			System.out.println("1이상의 정수를 입력해주세요");
			return;
		}

		/* lotto 2차원 배열 선언 */
		int[][] lotto = new int[length][6];

		/* 배열 초기화 */
		for(int x = 0; x < length ; x++){
			int idx = 0;

			do{
				int num = (int)(Math.random()*45) +1;
				boolean check = true;
				//중복 확인
				for(int y = 0; y <= idx; y++){
					if(lotto[x][y] == num){
						check = false;
						break;
					}
				}	
				//중복 아니면 초기화
				if(check == true){
					lotto[x][idx] = num;
					idx++;
				}
				
				if(idx ==6) break;
			}while(true);

			System.out.print((x+1) + "회차 : ");
			for(int y = 0; y < 6 ; y++){
				System.out.print(lotto[x][y] + " \t");
			}
			System.out.println(" ");
		}

	}
}