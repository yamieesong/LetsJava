
public class OpStudy {

	public static void main (String[] args) {
		
		/* 연산 */
		// 1.대입연산 += : 오른쪽 항의 값을 더해서 왼쪽 항에 대입, -= : 오른쪽 항의 값을 빼서 왼쪽 항에 대입, = : 오른쪽 항의 값을 왼쪽에 대입
 		int number1 = 10;
 		System.out.println(number1);
 		
 		number1 += 10;						//더하고 대입
 		System.out.println(number1);
 		
 		number1 -= 10;						//빼고 대입
 		System.out.println(number1);
 		
 		number1 *= 10;						//곱하고 대입
 		System.out.println(number1);
 		
 		number1 /= 2;						//나누고 대입
 		System.out.println(number1);
 		
 		number1 %= 4;						//나머지 대입
 		System.out.println(number1);
 		
		
		// 2.산술연산. 정수(int)와 정수(int)의 연산 결과는 항상 정수(int)
 		int a = 10;
 		int b = 4;
 		System.out.println(a/b);
 		
 		System.out.println((double)a/b);	//강제로 형변환(casting)하여 연산	
 		
 		// 2-1.부호연산 부호연산은 값을 바꾸는게 아니라 부호만 결정하는 연산으로 int a = 5; 에서 system.out.println(-a); 로 출력 시 -5로 출력된다 해도 a가 -5가 된 것은 아니다.
 		int k = 10;
 		System.out.println(-k);
 		System.out.println(k);				//위에 부호연산을 사용하였지만 a값에 대입되는게 아니다. 음수로 바꾸고 싶다면 k = -k;로 대입연산자를 사용해야 한다.
 		
 		 		
		
		// 3.증감연산 ++ : 1증가, -- : 1감소 
		// 3-1.전위연산 ++변수명 : 먼저 변수에 1을 증가 시킨 후 다른 연산을 실행
 		// 3-2.후위연산 변수명++ : 다른 연산 실행 후 변수에 1 증가
 		System.out.println("\n\n3.증감연산");
 		int x = 10;
 		int y = 10;
 		
 		++x;
 		y++;
 		
 		System.out.println(x);
 		System.out.println(y+"\n");				//단독으로 사용하는 경우에는 차이가 없음
 		
 		int z = 10;
 		int u = ++z;
 		
 		int r = 10;
 		int e = r++;
 		int kk = r;
 		
 		System.out.println(u);
 		System.out.println(e);
 		System.out.println(r);
 		System.out.println(kk);
 		System.out.println(e+"\n");
 		
 		e = r++;
 		System.out.println("*"+e);
 		System.out.println("*"+r);
 		
		// 4.비교연산 값을 비교한다(boolean 결과 true, false) == : 같은 값, != : 같지 않음, >, >=, <, <=
		// e = 11, r = 10
 		System.out.println("\n"+(e < r));
 		System.out.println(e == r);
 		System.out.println(e != r);
 		
 		boolean kkk = e==r;					//boolean 변수에 결과값(true or false)를 대입
 		System.out.println(kkk+"\n");
 		
		
		// 5.논리연산 &&(and), ||(or), !, &, |
		// 5-1.XOR(^) 두 항 중 하나의 항만 true일 떄 true반환!
 		// e = 11, r = 12
 		System.out.println(e == r);			//false
 		System.out.println(!(e == r));		//true
 		System.out.println(e == r ^ e < r);		//false ^ true => true 반환
 		
 		
		
		// 6.비트연산 &, | , ~, ^
		
		
		// 7.삼항연산 조건식?참:거짓
		
		
		// 8.문자열연산 + : 문자열 연결
	}
}
