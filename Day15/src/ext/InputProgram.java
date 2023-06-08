package ext;
import java.util.InputMismatchException;
import java.util.Scanner;	//util 이런거는 import해야함
import java.io.IOException;
import java.lang.*;			//System같은 기본적인 클래스들이 있는 package. 기본적인거라서 import 안해도 됨

public class InputProgram {
	
	/*
	 * try ~ catch 구문 없이 throw new를 통한 exception 발생
	 */
	void notCatch()  {
		throw new NotvalidNumberException("try catch 없어");				//throws NotvalidNumberException 선택해서 엑박없애기. 내가 만든 Exception클래스를 throw를 할거라면 throws를 통한 위임이나 try ~ catch를 통해 자체적으로 예외처리를 해서 처리해야 한다.
		
		/*
		 * throw를 통해 Exception을 실제로 발생시키는 코드가 있는 경우에는 이미 발생이 되었기 때문에
		 * 1. try ~ catch를 통한 예외처리를 하거나
		 * 2. throws를 통한 위임을 하여 처리
		 * 둘 중 하나는 반드시 해야 함
		 */
	}
	
	

	/*
	 * 사용자의 입력 받기
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);								//System.in 에서 in은 변수
		
		String name = "";
		int age = 0;
		
		System.out.print("이름을 입력해주세요 : ");							//System.out.println()에서 out은 static 변수 (new라는 키워드를 쓰지 않았으니 static! ), println()은 메서드
		name = input.next();
		try {
			System.out.print("나이를 입력해주세요 : ");						//여기서 exception을 던짐
			age = input.nextInt();
			
			if(age >= 100) {
				throw new NotvalidNumberException("나이는 100살까지 가능합니다");			//NotvalidNumberException는 Exception을 상속받아 catch(Exception e)으로 넘어감, catch(Exception e)이 없으면 잡아줄 부분이 없어서 에러가 남. 이 경우 catch(NotvalidNumberException e)로 잡던가 catch(Exception e)을 정의해줘야 함
			}
			
		} catch(InputMismatchException e1) {								//exception을 받아 올 변수값이 있어야 함 InputMismatchException라는 객체를 catch 잡아서 처리 (import java.util.InputMismatchException; 필요)
			System.out.println("InputMismatchException ::: age");
		} catch(NullPointerException e2) {
			System.out.println("NullPointerException");
		} catch(Exception e) {												//cathc를 여러개 쓰면 가장 마지막에 이거를 쓴다! Exception클래스의 최상위 클래스 Exception! (cf.Object같은수준)
			System.out.println("모든 Exception, [예외메시지 ::: " + e.getMessage() + "]");
		} finally {															//무조건실행(예외 발생 유무에 상관없이, 예외처리에 정의되지 않아 잡히지 않는 에러라도, 예외처리에 정이된 예외로 잡히더라도 무조건 실행), 불필요한 자원 반납, 커넥션 끊을 때 finally 많이 사용
			System.out.println("finally 구문 실행");
		}
		
		
		System.out.printf("저는 %s이고, 나이는 %d입니다.", name, age);
	}
	
}
