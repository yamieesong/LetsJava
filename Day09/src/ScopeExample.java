
public class ScopeExample {
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();				//객체 생성자(가시화=생성자=행위 → ())
		cat.sayMyName();
		cat.sayMyAge();
	}

}

class Cat{
	
	/* 클래스멤버(필드/변수) = 클래스 [전역]변수 */
	//String name과 void sayMyName()이라는 메서드는 동일 레벨. 같은 레벨(범위, scope)이면 호출 가능. scope는 {}를 기준으로 한다.
	String name = "[전역변수]미애";
	
	
	/* 클래스멤버(필드/변수) = 클래스 전역 변수 */
	//SayMyName의 정의부에는 {}를 기준으로 변수의 범위가 지정됨.
	void sayMyName() {
		/* [지역]변수 */
		int age = 10; 
		String name = "[지역변수]호냥이";
		System.out.println(name);
	}
	
	
	/* 클래스멤버(필드/변수) = 클래스 전역 변수 */
	void sayMyAge() {
		//int age는 sayMyName() 정의부 내에 존재 하는 [지역]변수라 접근 불가
		//String name은 클래스 전역에서 접근하는 [전역]변수라 접근 가능
		/* System.out.println("난 " + name + ", 나이는 " + age + "야!" );				//age에러!! */
		
		
		System.out.println(name);
	}
	
}
