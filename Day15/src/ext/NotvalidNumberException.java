package ext;

/**
 * 넘어오는 숫자가 100이 넘으면 예외
 * p.291
 */
public class NotvalidNumberException extends Exception{
	
	NotvalidNumberException(String msg){
		super(msg);				//여기서 super는 Exception 클래스
	}

	
}
