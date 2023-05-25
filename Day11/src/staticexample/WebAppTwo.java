package staticexample;

public class WebAppTwo {

	public static void main(String[] args) {
		
		CounterTwo counter = new CounterTwo();
		
		for(int i = 1; i <=3 ; i++) {
			counter.plusDynamicCounter();
			System.out.println(counter.dynamicCounter);
		}
		
		
		CounterTwo counter2 = new CounterTwo();
		System.out.println(counter2.dynamicCounter);
		
		
		/*Static은 어디에 할당?*/
		for(int i = 1; i<=3 ; i++) {
			CounterTwo.plusStaticCounter();
		}
		System.out.println(CounterTwo.staticCounter);
		
		
	}
}
