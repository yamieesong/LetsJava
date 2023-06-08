package ext;

/**
 * implements로 인터페이스를 정의한 경우 인터페이스에서 정의한 throws도 가져옴
 */
public class SamsungCalculator implements Calculator{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int divided(int x, int y) throws ArithmeticException {
		// TODO Auto-generated method stub
		return x/y;
	}

	
}
