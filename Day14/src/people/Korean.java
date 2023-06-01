package people;

/**
 * 단일상속만 가능하기에.. 기능추가를 위해 extends Daddy가 아닌 
 * interface를 추가
 * 
 * implements를 통해 인터페이스 추가!
 * The type Korean must implement the inherited abstract method DaddyInterface.play() 라는 경고로 인해
 * 강제로 @Override 추가
 * 
 * 
 *  implements DaddyInterface, WorkerInterface 이렇게 여러개 추가 가능!
 *  추가 시마다 각자의 인터페이스의 추상 메서드를 강제로 오버라이딩 해서 구현해줘야함
 *  add unimplemented methods
 *  
 *  상속과 인터페이스 관계 잘 생각하고 공부하기
 *  
 *  People a = new People();
 *  DaddyInterface a = new DaddyInterface();
 *  WorkerInterface a = new WorkerInterface();가능!
 *  
 */
public class Korean extends People implements DaddyInterface, WorkerInterface {

	String name = "";
	
	Korean(String name){
		this.name = name;
	}
	
	@Override
	void fillItUp() {
		System.out.println("Korean eat rice");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Korean : playing Jegichagi");
		
	}

	/*인터페이스는 기능만 정의되어있고 구현은 알아서@@*/
	@Override
	public void goingToWork() {
		// TODO Auto-generated method stub
		System.out.println("going to work at 8 o'clock");
	}

	@Override
	public void goingHome() {
		// TODO Auto-generated method stub
		System.out.println("Leaving work at 5 o'clock");
	}
}
