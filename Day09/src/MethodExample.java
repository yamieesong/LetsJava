import java.util.Scanner;

/*
 * 메서드(행위)만들기 - 함수
 * 
 * (접근제한자) 리턴타입 메서드명(매개변수){
 * 		↓			↓				↓
 * 	생략가능		리턴값			입력값
 * 				데이터타입	int x, int y
 * 
 * }
 */

public class MethodExample {	
	
	//return이 있는 메서드
	int add(int x, int y){
		return x + y;
	}
	
	//void return (리턴값 없는거)
	void bark(String name){
		System.out.println("내 이름은 " + name + ", 안녕!");
	}
	
	void sayMyName() {
		System.out.println("안녕? 나는 뽀야미야!");
	}
	
	public static void main(String[] args) {

		MethodExample ex = new MethodExample(); 		//객체생성(가시화). new가 없으면 객체를 생성할 수 없다
		ex.add(10, 10);									//가시화된 변수에 .(쩜연산자, 참조연산자)를 사용하여 메서드를 쓸 수 있다
		int result = ex.add(10, 11);					//변수에 return된 결과값을 받아올 수 있다
		
		System.out.println(result);
		System.out.println(ex.add(5, result));
			
		
		System.out.println("\n-------------");
		System.out.println("이름이 뭐야?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		ex.bark(name);
		
		ex.sayMyName();

		
	}
	
	

}
