package ext;
/**
 * 예외를 던지는 방식(throws) 네가 해라!
 * 
 * try catch로 Exception을 잡지 않으면 JVM으로 전달하여 프로그램 자체를 다운시켜버린다(중지)
 * 때문에, 최소한 메인메서드에서라도 Exception 처리하여 예외를 잡아줘야 함
 * 
 * 기본적으로 throws를 정의하지 않아도 Exception 발생 시 본인을 호출한 곳에 Exception을 던진다
 * 
 * throws는 호출한 메서드에서 Exception처리. 개발자가 직접 Exception 처리하는건 호출한 곳에서 처리
 */
public class ThrowsTest {
	
	int divide(int x, int y) throws ArithmeticException, Exception {
		int result = x/y;
		return result;
	}
	
	void showDivide(int x, int y) {
		int result = 0;
		try {
			result = this.divide(x, y);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException예외발생 ::: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("예외발생 ::: " + e.getMessage());
		}
		System.out.printf("%d/%d = %d \n", x, y, result);
		
	}

	public static void main(String[] args) {
		ThrowsTest test = new ThrowsTest();
		test.showDivide(10, 2);
		test.showDivide(10, 0);
		
		SamsungCalculator cal = new SamsungCalculator();
		cal.divided(10, 2);
	}
	
	
}
