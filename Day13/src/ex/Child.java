package ex;

/*Parent의 상속을 받는 클래스로 정의*/
public class Child extends Parent{

	/*기본 생성자 정의하면 에러가 난다
	 * public Child() {
	 * }
	 * 
	 * */
	
	public Child() {
		
		/*
		super				--부모
		this				--자기자신
		*/
		
		super("뽀야미");		//부모의 인자를 넣어줄 수 있다. 그러면 오류 안 남 (부모객체를 먼저 생성해줘야함)
		
		System.out.println("Child 객체 생성");
	}
	
	void eatMeal() {
		/*
		parentEatMeal();		// this.parentEatMeal();와 같다
		this.parentEatMeal();
		*/
		System.out.println("Child eat meal");
	}
	
	
	/*부모 클래스(객체) Parent의 eatMeal() 메서드를 호출해야 함 */
	void parentEatMeal() {
		
		super.eatMeal();
	}
}
