package overriding;

public class App {

	
	public static void main(String[] args) {
		
		AirForce airForce = new AirForce();

		airForce.durationOutput();		//오버라이딩
		airForce.work();				//오버라이딩
		airForce.work("격납고");			//오버로딩
		
		
		
	
		Army army = new Army();
		army.durationOutput();			//상속만 받고 오버라이딩이 없어 부모객체의 메서드(복무기간) 출력
		
	}
}
