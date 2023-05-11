import java.util.Scanner;


public class SwitchExample {

	public static void main(String[] args) {
		
		/* 조건분기문 switch */
		
		// 예제1-1) 1이면 월, 2는 화, 3는 수, 4는 목, 5는 금, 6는 토, 7는 일
		
		System.out.println("예제1-1-1)switch문");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		Scanner scan = new Scanner(System.in);		
		int dayCode = scan.nextInt();
		
		switch(dayCode) {
			case 1  :
				System.out.println("월요일");
				break;
			case 2  :
				System.out.println("화요일");
				break;
			case 3  :
				System.out.println("수요일");
				break;
			case 4  :
				System.out.println("목요일");
				break;
			case 5  :
				System.out.println("금요일");
				break;
			case 6  :
				System.out.println("토요일");
				break;
			case 7  :
				System.out.println("일요일");
				break;
			default :
				System.out.println("1~7만 입력 가능 합니다.");
		}
		
		System.out.println("종료합니다.");
		
		
		
		System.out.println("==============================================================");
		System.out.println("");
		
		System.out.println("예제1-1-2)switch문. default가 최하단이 아닌 위치에 있으면서 break가 없는 경우");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		dayCode = scan.nextInt();
		
		switch(dayCode) {
			default :
				System.out.println("1~7만 입력 가능 합니다.");
			case 1  :
				System.out.println("월요일");
				break;
			case 2  :
				System.out.println("화요일");
				break;
			case 3  :
				System.out.println("수요일");
				break;
			case 4  :
				System.out.println("목요일");
				break;
			case 5  :
				System.out.println("금요일");
				break;
			case 6  :
				System.out.println("토요일");
				break;
			case 7  :
				System.out.println("일요일");
				break;
		}
		
		System.out.println("종료합니다.");
		
		
		
		System.out.println("==============================================================");
		System.out.println("");
		
		// 예제1-2) if문으로 바꿔보기
		System.out.println("예제1-2) if문으로 바꿔보기");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		dayCode = scan.nextInt();
		
		if( dayCode == 1 ) {
			System.out.println("월요일");
		} else if( dayCode == 2 ) {
			System.out.println("화요일");
		} else if( dayCode == 3 ) {
			System.out.println("수요일");
		} else if( dayCode == 4 ) {
			System.out.println("목요일");
		} else if( dayCode == 5 ) {
			System.out.println("금요일");
		} else if( dayCode == 6 ) {
			System.out.println("토요일");
		} else if( dayCode == 7 ) {
			System.out.println("일요일");
		} else {
			System.out.println("1~7만 입력 가능 합니다.");
		}
		// 이 경우 else에 해당하는 조건에서 연산의 양이 많아 효율이 낮아진다. 때문에 if를 2번 사용하는 방법으로 변경해보자.
		System.out.println("종료합니다.");

		
		System.out.println("==============================================================");
		System.out.println("");
		
		// 예제1-3) switch문 예제를 중첩 if문으로 바꿔보기
		System.out.println("예제1-3) switch문 예제를 중첩 if문으로 바꿔보기");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		dayCode = scan.nextInt();
		
		if(dayCode >= 1 && dayCode <= 7) {
			if( dayCode == 1 ) {
				System.out.println("월요일");
			} else if( dayCode == 2 ) {
				System.out.println("화요일");
			} else if( dayCode == 3 ) {
				System.out.println("수요일");
			} else if( dayCode == 4 ) {
				System.out.println("목요일");
			} else if( dayCode == 5 ) {
				System.out.println("금요일");
			} else if( dayCode == 6 ) {
				System.out.println("토요일");
			} else if( dayCode == 7 ) {
				System.out.println("일요일");
			}
		} else {
			System.out.println("1~7만 입력 가능 합니다.");
		}
		System.out.println("종료합니다.");
		
		
		System.out.println("==============================================================");
		System.out.println("");
		
		// 예제1-4) if ~ else if를 사용하여 작업
		System.out.println("예제1-4) if ~ else if를 사용하여 작업");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		dayCode = scan.nextInt();
		
		if( !(dayCode >= 1 && dayCode <= 7) ) {
			System.out.println("1~7만 입력 가능 합니다.");
		} else if ( dayCode == 1 ) {
			System.out.println("월요일");
		} else if ( dayCode == 2 ) {
			System.out.println("화요일");
		} else if ( dayCode == 3 ) {
			System.out.println("수요일");
		} else if ( dayCode == 4 ) {
			System.out.println("목요일");
		} else if ( dayCode == 5 ) {
			System.out.println("금요일");
		} else if ( dayCode == 6 ) {
			System.out.println("토요일");
		} else if ( dayCode == 7 ) {
			System.out.println("일요일");
		}
		System.out.println("종료합니다.");
		
		System.out.println("==============================================================");
		System.out.println("");
		
		// 예제1-5) if문과 switch문을 같이 사용하기
		System.out.println("예제1-5) if문과 switch문을 같이 사용하기");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		dayCode = scan.nextInt();
		
		if(dayCode >= 1 && dayCode <= 7) {
			switch(dayCode) {
			default :
				System.out.println("1~7만 입력 가능 합니다.");
			case 1  :
				System.out.println("월요일");
				break;
			case 2  :
				System.out.println("화요일");
				break;
			case 3  :
				System.out.println("수요일");
				break;
			case 4  :
				System.out.println("목요일");
				break;
			case 5  :
				System.out.println("금요일");
				break;
			case 6  :
				System.out.println("토요일");
				break;
			case 7  :
				System.out.println("일요일");
				break;
		}
		} else {
			System.out.println("1~7만 입력 가능 합니다.");
		}
		System.out.println("종료합니다.");
		

		
	}
}
