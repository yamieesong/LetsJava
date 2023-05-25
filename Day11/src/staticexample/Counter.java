package staticexample;

/*웹 어플리케이션의 카운터. 이 클래스 전체는 메서드영역에 들어감*/
public class Counter {

	/*
	 * static 키워드는
	 * 멤버변수, 메서드에 붙을 수 있다.
	 * 초기화에도 붙을 수 있으나 사용빈도 매우낮음.
	 */
	
	int dynamicCounter = 0;				//인스턴스(멤버)변수 (= 객체변수). 객체가 생성될 때마다 초기화. new를 통해 생성하고 객체가 떠오르는 시점에 0으로 초기화. heap 영역에 들어감
	static int staticCounter = 0;		//정적변수. 메서드 영역에 들어감
	
	
	
	
	
	
	
}
