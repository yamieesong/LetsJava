
public class CastingStudy {
	
	public static void main(String[] args) {
		/*
		 * 형변환(casting)
		 * 작은 크기의 자료형은 큰 크기를 가진 자료형에 저장될 때 자동 형변환이 일어난다. 
		 * 형변환의 종류는 2 가지 이다
		 * 	1.자동(묵시적)형변환
		 * 	2.강제(명시적)형변환
		 */
		
		// 기본 자료형의 크기 순 나열 : (작은 자료형)··· byte < short < int < long < float < double ···(큰 자료형)
		
		
		// 1.자동(묵시적)형변환
		int number = 10; 		//int 자료형으로 자동형변환
		
		long number2 = number;	//자료형변환 int < long
		
		// 2.강제(명시적)형변환 casting
		// 2-1.강제 형변환에서 손실이 일어나는 경우
		double pi = 3.14;		//double 자료형
		int pi2 = (int)pi;		//강제형변환
		
		System.out.println("강제형변환(값의 손실 발생 double 3.14 → int 3) = " + pi2);
		
		// 2-2.더 큰 자료형을 작은 자료형에 casting해도 손실이 발생하지 않는 경우는 작은 자료형의 범위에도 포함되는 값 
		// 예) 100과 100.0은 출력 형태만 달라졌을 뿐 손실이 발생하지 않도록 형변환 가능
		double score = 100;
		int score2 = (int)score;
		
		System.out.println("강제형변환(값의 손실이 발생하지 않는 경우 double 100.0 → int 100 = " + score2);
		
	}

}
