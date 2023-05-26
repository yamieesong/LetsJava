
public class SingletonExample {

	void get출근시간() {
		/*
		 * class 관리자를 쓰려면 new 생성자로 쓰고 사용
		 */
		
		//관리자 a = new 관리자();
		관리자 a = 관리자.getInstance();
		a.출근시간알림();
		
		/* 
		 * identityHashCode는 토렌트에 있는 해쉬코드가 파일을 구분할 수 있는 값처럼 그 객체가 가지고 있는 고유값을 알고 싶을 때 사용한다.
		 * 관리자라는 객체의 해쉬코드는 new를 통해 생성자를 통해 객체를 생성시킬 때마다 새로운 값으로 생성된다(여러개띄워짐)
		 */
		System.out.println(System.identityHashCode(a));
	}
	
	void get퇴근시간() {
		
		//관리자 b = new 관리자();
		관리자 b = 관리자.getInstance();
		for(int i = 1; i<= 10; i++) {
			b = 관리자.getInstance();
		}
		
		b.퇴근시간알림();
		System.out.println(System.identityHashCode(b));
	}
	
	
	public static void main(String[] args) {
		SingletonExample ex = new SingletonExample();
		
		ex.get출근시간();
		ex.get퇴근시간();
		
	}
}



class 관리자{
	
	String name ="관리자";
	
	private static 관리자 obj;		//method area에 obj생겨짐 ★★클래스는 데이터타입!★★  변수타입 변수; 이렇게 선언하는 것처럼 ==> ClassName 변수명; ===> 관리자(변수타입 int같은거, 클래스를 넣을 수 있음) 변수이름;
	
	public static 관리자 getInstance() {
		if(obj == null) {
			obj = new 관리자();
		}
		
		return obj;
	}
	
	
	void 출근시간알림() {
		System.out.println("출근시간은 9시 입니다");
	}
	
	void 퇴근시간알림() {
		System.out.println("퇴근시간은 6시 입니다");
	}
}