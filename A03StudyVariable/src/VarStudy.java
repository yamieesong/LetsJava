
public class VarStudy {

	public static void main(String[] args) {
		
		/* 변수 */
		
		// 1.변수 초기화
		int a;		//변수 선언
		a = 10; 	//변수 초기화
		
		int z = 10; //변수 선언과 초기화 동시에
		
		
		// 2.자료형 - 기본자료형
		// 2-1.정수 int(정수), long(값이 21억을 넘는 경우 더 긴 자료형), char(하나의 문자. 해당 문자에 해당하는 코드를 정수로 저장하는 형태)
		byte b = 1;
		short s = 10;
		int i = 1000;
		long l = 1000;
		long l2 = 1000L;
		
		
		char aa = 'A';
		System.out.println("aa = " + aa);
		System.out.println("aa = " + (int)aa);
		
		int bb = aa;
		System.out.println("bb = " + bb);
		
		char cc = 66;
		System.out.println("cc = " + cc);
		
		// 2-2.실수 double(소수점이 있다면)
		float ff = 3.141592f;
		double dd = 3.141592d;
		
		System.out.println("float = " + ff);
		System.out.println("double = " + dd);
		
		double dd2 = 3.141592;
		
		System.out.println("dd2 = " + dd2);
		
		
		// 3.자료형 - 참조자료형
		// 3-1.자료형 - 문자열
		String name ;			//변수 선언
		name = "고길동";			//변수 초기화
		
		String name2 = "둘리";	//선언과 동시에 초기화
		String name3 = null;	//null값으로 선언
		String name4 = " ";		//" "값으로 선언 (빈 문자열이 저장)
		
		System.out.println("name = " + name);
		System.out.println("name3 = " + name3);
		System.out.println("name4 = " + name4);
		
		
		// 4.상수와 리터럴
		// 4-1. 상수(한 번 저장하면 변경할 수 없는 수. 항상 같은 수 ←→ 변수. 상수 선언 시 변수 앞에 final 이라는 키워드(제어자)를 사용.)
		final double PI = 3.14 ;
		//PI = 2.32;						//final로 상수를 선언한 이후에 값을 변경하려고 하면 에러가 발생. 변경이 필요하다면 final 키워드를 제거하던가 선언된 값을 수정하는 방법을 사용.
		final String aaa = "짱구";
		
		
		
		
		
		// 2-3.논리 boolean(true, false)
		boolean run = true;
		
		
		
		// 3. 자료형 - 참조자료형 String은 다른 문자를 써서 만든 조합 클래스 개념으로 생각하자!
	}
}
