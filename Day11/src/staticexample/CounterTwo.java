package staticexample;

public class CounterTwo {
	
	int dynamicCounter = 0;
	static int staticCounter = 0;
	
	/*인스턴스 메서드(객체메서드) = 동적*/
	public void plusDynamicCounter() {
		dynamicCounter++;
	}

	/*정적 메서드 = 정적(MethodArea에 한 번만 할당)*/
	public static void plusStaticCounter() {
		staticCounter++;
	}
}
