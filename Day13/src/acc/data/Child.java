package acc.data;

/*Parent와 같은 패키지 내에 존재*/
public class Child extends Parent {

	/*부모의 행위나 속성은 자식의 행위나 속성*/
	//생성자 내에서 부모 속성(멤버변수)에 접근해보자
	
	public Child(){
		this.publicName = "뽀야미";		//접근가능 (공공의 개념)
		this.defaultName = "뽀야미";		//접근가능 (패키지 기준)
		this.protectedName = "뽀야미";	//접근가능 (패키지 기준)
		/*
		 * 부모클래스의 private 변수, 메서드는 자식에 상속되지 않는다
		 * this.privateName = "뽀야미"; 	//접근불가능 error
		 */
		
		
		
		
	}
}
