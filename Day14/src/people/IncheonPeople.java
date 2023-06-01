package people;


/**
 * 인터페이스를 사용하는 클래스를 상속받으면?
 */
public class IncheonPeople extends Korean {

	/*
	 * 상위클래스에 기본 생성자 없이 생성해주면, 하위클래스에서는 super(부모클래스)의 인자받는 부분을 생성하여 호출 한 뒤 사용해야한다.
	 * Korean 클래스에 default 생성자인  korean()이 없기 때문에 super() 생성자를 사용해서 부모객체 부터 먼저 생성해야 함.
	 */
	IncheonPeople(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
