import java.util.*;


public class SimpleProgram {
	
	public static void main (String[] args) {
		
		int command = 0;
		
		do {
			System.out.print("명령어 코드 입력(종료 5) : ");
			Scanner sc = new Scanner(System.in);
			command = sc.nextInt();
			System.out.println("입력된 명령어는 " + command + "입니다");
		} while ( command != 5 ) ;
		
		System.out.println("프로그램 종료");
		
		
		
	}

}
