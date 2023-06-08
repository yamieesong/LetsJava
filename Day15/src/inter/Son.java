package inter;
/**
 * 인터페이스의 implements의 다중구현이 가능한 이유 : 
 * 최상위 인터페이스의 메서드를 사용하더라도,
 * 실제로 구현하는 부분은 클래스 부분이고 인터페이스에서는 구현부가 없기에 오류가 나지 않음
 */
public class Son implements Father01, Father02{

	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub
		System.out.println("이름이름");
	}
	
		
	/*
	 * 같은 이름이 있어도 재정의 후 구현한다면 상관 없음
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		// Father01.super.eat();
		System.out.println("Son이 먹는다");
	}
	
	public void father01Eat() {
		//인터페이스 Father01의 default 메서드인 eat()
		Father01.super.eat();
	}
	
	public static void main(String[] args) {
		Son son = new Son();		//자기 자신을 구체화
		son.eat();
		
		
	}

}
