//import home.이종석;
import home.*;
import staticexample.CounterTwo;

public class Application /*extends 아빠*/ {	

	public static void main(String[] args) {
		
		int 지갑 = 0;
		
		이종석 a = new 이종석();		//이종석() -> 생성자
		a.SayMyName();
		
		/*
		a.SayMyAge();				//이종석은 public 객체, SayMyName은 퍼블릭메서드, SayMyAge는 default메서드, 같은 패키지에서만 가능
		*/
		
		
		/*
		엄마 b = new 엄마();			//엄마클래스는 가시화 불가
		*/
		
		a.SayMotherName();			//이건 가능..!
		
		
		아빠 b = new 아빠();
		b.sayMyName();
		/*
		b.용돈주세요();				//protected.상속관계가 아니라 불가				
		b.청소();					//default. 같은 패키지가 아니면 접근 불가
		*/
		
		/*
		new Application().용돈주세요();		//class옆에 extends로 상속 받게 하면 이건 가능 (상속받아서) 이렇게 가능
		*/
		
		System.out.println("아빠 지갑에는 " + b.walletBalance + "원이 있어요");
		b.walletBalance = 1000;				//public변수라서 누구든 접근해서 변경 가능
		System.out.println("아빠 지갑에는 " + b.walletBalance + "원이 있어요");
		
		/*
		b.walletBalance2 = 2000; 			//private변수라서 해당 class가 아니면 접근 불가
		*/
		
		
		for (int i = 1 ; i <= 10; i++) {
			지갑 += b.용돈주세요();
		}
		
		System.out.println("이종석 아빠한테 삥뜯음");
		System.out.println("내 지갑에는 이제 " + 지갑 + "원이 있어요!");
		//캡슐화를 통해 지켜야 할 데이터는 지켜 접근하지 못하게 하도록 ! = 접근제한자
		
		
		
		for(int i = 1; i<=2 ; i++) {
			CounterTwo.plusStaticCounter();
		}
		
	}
}
