package military;

public class App {

	public static void main(String[] args) {
		
		/**
		 * 추상 클래스 타입의 배열은 생성 가능.
		 * 배열 공간만 만듬
		 * Military a = new Military(); 이건 안 됨 ERROR! (new를 통한 객체 생성 불가!)
		 */
		Military[] military = new Military[2];
		
		military[0] = new AirForce();
		military[1] = new Army();

		for(int i = 0; i < military.length; i++) {
			military[i].memberOf();			//소속 출력
			military[i].durationOutput();	//복무기간 출력
		}
		
	}
}
