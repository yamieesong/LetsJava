import java.util.Scanner;


public class SwitchExample_study {
	public static void main (String[] args) {

		// 응용
		System.out.println("==============================================================");
		
		System.out.println("변수 사용해서 출력해보는 연습");
		System.out.print("1~7 범위 내의 숫자를 입력해주세요 : ");
		
		Scanner scan = new Scanner(System.in);
		int dayCode = scan.nextInt();
		
		String msg = "다시 실행시켜 주세요";
		String errMsg = "범위를 벗어난 숫자가 입력되었습니다.";
		
		if( dayCode >=1 && dayCode <= 7 ) {
			switch( dayCode ) {
			case 1: 
				msg="월";
				break;
			case 2: 
				msg="화";
				break;
			case 3: 
				msg="수";
				break;
			case 4: 
				msg="목";
				break;
			case 5: 
				msg="금";
				break;
			case 6: 
				msg="토";
				break;
			case 7: 
				msg="일";
				break;
			}
			System.out.println(msg + "요일");
		} else {
			System.out.println(errMsg);
		}
		
		System.out.println("==============================================================");
	}
}
