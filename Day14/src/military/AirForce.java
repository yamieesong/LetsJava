package military;

public class AirForce extends Military{

	/**
	 * 오버라이딩이 강제가 아니다
	 */
	@Override
	void memberOf() {
		System.out.println("a member of the 17th AirForce");
	}
	
	
	/**
	 * 추상화 클래스를 상속받는 경우 추상화메서드에 대한 강제성이 있다. 컴파일에러 발생
	 * 작성하지 않으면 강제로 생성하게 빨간줄이 뜬다.
	 * 자식클래스에서 해당 메서드에 대해 구현해야 함
	 */
	@Override
	void durationOutput() {	
		// TODO Auto-generated method stub
		System.out.println("AirForce is 30 months old");
	}

}
