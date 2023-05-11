
public class Control101 {
	
	public static void main(String[] args) throws InterruptedException {
		
		/* 1. 제어문 if(조건문) */
		
		
		// 청년저축가입 나이 제한
		// 1-1)참인 경우
		int age = 39;
		
		System.out.println("신청자 나이 : " + age);
		if(age < 40) {												//조건식
			System.out.println("청년저축 가입 가능합니다.");			//조건식이 참이면 실행
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		// 1-2)거짓인 경우
		age = 40;
		
		System.out.println("신청자 나이 : " + age);
		if(age < 40) {												//조건식
			System.out.println("청년저축 가입 가능합니다.");			//조건식이 거짓으로 if문 건너뜀
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		// 1-3)예제 청년저축 가입 나이는 19세 이상이고(AND), 39세 이하인 사람만 가입할 수 있다.
		age = 39;
		
		System.out.println("신청자 나이 : " + age);
		if(19 <= age && age <= 39) {								//컴퓨터는 무조건 2항. if(19 <= age <= 39)는 불가
			System.out.println("19세 이상, 39세 이하인 분이시군요");
			System.out.println("가입 대상입니다.");
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		// 1-4)예제 청년저축 가입 나이는 19세 이상이거나(OR), 39세 이하인 사람만 가입할 수 있다.
		age = 40;
		
		System.out.println("신청자 나이 : " + age);
		if( age >= 19 || age <= 39) {								//둘 중 하나가 참이므로 이 조건문은 참
			System.out.println("가입 대상입니다.");					//조건문이 참이므로 실행문 실행
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		
		// 1-5)		
		System.out.println("신청자 나이 : " + age);
		if ( age > 39 || age < 19) {
			System.out.println("가입 대상이 아닙니다.");
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		
		/* 2. 제어문 if ~ else(조건문) */
		System.out.println("신청자 나이 : " + age);
		System.out.println("심사 중 입니다...");
		
		Thread.sleep(2000);											//add throws declaration으로 throws추가
				
		if(age >= 19 && age <= 39) {								//조건문이 참인 경우 실행
			System.out.println("가입 대상입니다.");	
		} else {													//조건문이 거짓인 경우 실행
			System.out.println("가입 대상이 아닙니다.");
		}
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
		
		/* 3. 제어문 if ~ (else if) ~ (else)(조건문) else if와 else는 필수가 아님. if는 필수 */
		
		// 3-1)예제 19세 이상 39세 이하는 청년저축 대상자이고 40세 이상 60세 이하는 중장년 카운슬링 대상자
		if( age >= 19 && age <= 39) {
			System.out.println("청년저축 대상자 입니다.");
		} else if ( age >=40 && age <=60) {							//else if는 여러개 사용 가능 if(){} else if (){} else if(){} ... else {}이런식으로 가능
			System.out.println("중장년 카운슬링 대상자 입니다.");
		} else {
			System.out.println("대상자가 아닙니다. (19세 미만, 61세 초과)");
		}
		
		System.out.println("프로그램 종료.");
		System.out.println("===========================================================");
		
	}

}
