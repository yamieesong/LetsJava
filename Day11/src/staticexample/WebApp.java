package staticexample;

public class WebApp {

	public static void main(String[] args) {
		
		//-----------------------------------------------------------------------------------------------------------------
		
		/*인스턴스 변수에는 어떻게 접근해야 할까?*/
		//객체변수니까 구체화 시켜야지! new 를 통해서
		
		Counter counter = new Counter();
		// └>이걸 만나는 순간 JVM의 execute engine이 이 부분을 해석하고 heap 영역에 데이터 할당!
		System.out.println(counter.dynamicCounter);
		
		for(int i = 1; i <=3 ; i++) {
			counter.dynamicCounter ++;
		}
		System.out.println(counter.dynamicCounter);
		
		
		Counter counter2 = new Counter();
		// └>이 객체는(인스턴스변수) heap 영역에 counter와 다른 영역에 할당 (동적할당)
		System.out.println(counter2.dynamicCounter);
		
		/*static카운터는 어떻게 공유될까?*/
		//static은 Method Area에 할당. new를 안 쓰고 사용. static은 프로그램 실행 시 딱 한 번 메서드 영역에 할당 됨. 그래서 접근 시 new를 사용하지 않고 class명.변수명 으로 사용함
		for(int i = 1; i<=2; i++) {
			Counter.staticCounter ++;
		}
		
		//-----------------------------------------------------------------------------------------------------------------
		
		
	}
}
