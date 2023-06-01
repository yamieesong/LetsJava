package people;

public class App {

	public static void main(String[] args) {
		
		// Korean 클래스
		Korean korean = new Korean("Kim su-bang");
		
		Job job = new Job(korean);
		Home home = new Home(korean);
		
		job.life();
		home.life();
		
		
		// Q.Korean을 WorkerInterface로 Casting(형변환) 하면?
		WorkerInterface worker1 = new Korean("Go gill-dong");
		worker1.goingToWork();
		worker1.goingHome();
		
		//Korean 객체라면 밑에도 사용 할 수 있어야 하지만! WorkerInterface로 캐스팅해서 사용 불가. Korean 클래스(객체)의 메서드 사용 불가.인터페이스 활용으로 public, private 필요 없이 데이터 숨길 수 있음 (제한). 인터페이스는 행위만 제한(밀키트 비조리). 추상클래스는 행위제한, 핵심기능은 내가 구현(반조리)
		// 인터페이스 구현 implements
		// 그냥 클래스 상속, 추상클래스 상속 모두 extends
		worker1.filItUp();
		worker1.play();
		
		//사용하려면? 캐스팅~!. 
		((Korean)worker1).fillItUp();
		((DaddyInterface)worker1).play();
		
		
		
		
		IncheonPeople ip = new IncheonPeople("지상렬");
		// Korean 클래스에서 상속/재정의한 메서드인 fillItUp()
		// Q1. People 클래스의 메서드인 fillItUp() 메서드에 접근 가능?
		ip.fillItUp();							//가능
		
		// Q2. DaddyInterface의 play(); 가 상속 되는가?
		ip.play();								//가능
		
		// Q3. WorkerInterface의 goingToWork(), goingHome()가 상속 되는가?
		ip.goingHome();
		ip.goingToWork();						//가능
		
		
		
		/*
		 * 익명 구현 객체. 추상클래스와 좀 다름. 인터페이스만 가능
		 * WorkerInterface worker = new WorkerInterface();
		 * Cannot instantiate the type WorkerInterface
		 */
		
		
		//The type new WorkerInterface(){} must implement the inherited abstract method WorkerInterface.goingHome()  ==> 임시 구현 객체 구현부 뒤에 ; 세미콜론! {   };
		WorkerInterface worker = new WorkerInterface() {

			@Override
			public void goingToWork() {
				// TODO Auto-generated method stub
				System.out.println("임시구현객체 goingToWork();");
				
			}

			@Override
			public void goingHome() {
				// TODO Auto-generated method stub
				System.out.println("임시구현객체 goingHome();");
			}
			
		};
		
		worker.goingToWork();
		
		
		
	}
}


/**
 * WorkerInterface 인터페이스를 받아서 동작 life() 시키기
 */
class Job{
	WorkerInterface worker;
	Job(WorkerInterface worker){
		this.worker = worker;
	}
	
	public void life() {
		worker.goingToWork();
		worker.goingHome();
	}
}


/**
 *  DaddyInterface 인터페이스를 받아서 동작 life() 시키기
 */
class Home{
	DaddyInterface daddy;
	Home(DaddyInterface daddy){
		this.daddy = daddy;
	}
	
	public void life() {
		daddy.play();
	}
}