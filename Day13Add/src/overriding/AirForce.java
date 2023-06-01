package overriding;

public class AirForce extends Military {
	
	/*메서드 오버라이딩을 통해 부모클래스의 메서드를 재정의*/
	//cf.오버로딩은 매개변수, 인자값, 리턴값 다르다
	
	@Override
	void durationOutput() {
		System.out.println("공군 복무기간은 30개월");
	}
	
	@Override
	void work() {
		System.out.println("공군의 일하기는.. 새 쫓기!");
	}
	
	void work(String location) {			//오버로딩
		System.out.println(location + "에서 눈치우기");
	}
}
