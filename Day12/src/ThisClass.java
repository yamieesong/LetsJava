
public class ThisClass {
	void sayMyName() {
		System.out.println("나는 ThisClass야");
	}

	public static void main(String[] args) {
		
		AClass a = new AClass("이종석", 44);
		a.introduceMySelf();
		
		AClass b = new AClass("박은진", 40);
		b.introduceMySelf();
		
		/*
		 * 여기서는 method area이기에 this 사용 불가! this는 heap영역에 한 번 올라온 것만 사용가능
		 * this.sayMyName(); 불가
		 * sayMyName(); 불가 -- 메모리 영역이 달라서 안 됨, 쓰려면 가시화 시켜줘야함
		 * 
		 * 
		 * 생성자에서 객체생성 시 this 많이 사용.
		 * 
		 * 전역변수와 동일한 지역변수가 있을 때 this 사용.
		 */
		
		ThisClass tc = new ThisClass();
		tc.sayMyName();
	}
}



class AClass{
	
	String name;
	int age;
	
	/*생성자 만들기*/
	public AClass(String name, int age) {
		/*
		 * 아래와 같은 경우에 구분하기 쉽지 않다
		 * 이 경우 AClass(객체)의 name을 사용하는걸 지칭하기 위해 this를 사용한다
		 * name = name;
		 */
		this.name = name;
		this.age = age;
	}
	
	void introduceMySelf() {
		
		/*
		 * 여기에 String name = "김진수"; 가 최 상단에 멤버변수 name이 있지만 가장 가까운 name인 김진수를 사용한다
		 * 이 경우, 객체의 name은 this.name으로 사용하고 메서드의 name은 그냥 name을 사용하면 된다.
		 */
		
		String name = "김진수";
		
		
		String message = String.format("제 이름은 %s이고 제 나이는 %d입니다.", name, this.age);			//%d는 대시멀?(10진수), %s=문자열(string)
		String message2 = String.format("제 이름은 %s이고 제 나이는 %d입니다.", this.name, this.age);
		System.out.println(message);
		System.out.println(message2);
	}
}
