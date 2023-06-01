package military;

/**
 * @추상클래스 Military
 * 추상클래스도 상속이 가능
 * 
 * 구현부가 없는 메서드가 하나라도 있다면 클래스는 추상화클래스가 되어야 한다
 * abstract
 *
 */
public abstract class Military {

	int duration = 24; 			//복무기간
			
	void memberOf() {			//소속
		System.out.println("a member of the Military");
	}
	
	
	/**
	 * 추상화메서드. 구현부가 없이 선언만 한다. 
	 * 상속받은 자식클래스에서 구현해야 함 (중괄호로 구현부 정의) 
	 * 자식 클래스에 구현의 강제성 부여 (상속을 통한 행위에 강제를 주는 목적을 지님)
	 * 기능을 추가하거나 보강할 때
	 */
	abstract void durationOutput();	//자식에서 반드시 구현해줘야 함
}
