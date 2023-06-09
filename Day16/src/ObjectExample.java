import java.lang.*;  	/*이게 없어도 자바는 기본적으로 java.lang 패키지 import*/


public class ObjectExample /*extends Object 모든 클래스는 상속받지 않으면 기본적으로 Object의 상속을 받음*/ {

	
	public static void main(String[] args) {
		
		/* 대입연산자(=)와 equals() */
		String s1 = "뽀야미";
		String s2 = "뽀야미";
		
		System.out.println("s1 == s1 = " + ( s1 == s2 ));
		// identityHashCode 참조변수 기준
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		String s3 = new String("뽀야미");
		String s4 = new String("뽀야미");
		
		System.out.println("s3 == s4 = " + ( s3 == s4 ));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		/* p.313 참고 */
		
		System.out.println("s3.equals(s4) = " + s3.equals(s4));
		
		
		
		/* p.298 hashCode() */
		// 값에 대한 해시코드 생성. 객체기준
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		/* toString() */
		System.out.println("뽀야미".toString());
		
		Student std = new Student("뽀야미", 1);
		System.out.println(std);					// System.out.println(std); 둘은 같다 System.out.println(std.toString());  Object클래스에서 정의된 return Student@5e91993f 클래스명 + @ + Hexcode
		
		/* Wrapper클래스 */
		

	}
	
}


class Student {
	
	String name;
	int grade;
	
	/* 기본생성자 */
	Student(String name, int grade){
		this.name = name;
		this.grade = grade;
	}

	/* 오버라이딩 */
	@Override
	public String toString() {
		return "class Student { name = " + name + ", grade = " + grade + "}";
	}
}
