
public class ArrayUsage01 {
	
	public static void main(String[] args) {
		
		String[] arrString = {"a", "b", "c"};			//변하지 않는 수 = 상수
		
		for (int x = 0; x <arrString.length; x++) {
			System.out.println(x + " : " + arrString[x]);
		}
		
		
		//--- String[] args 가지고 놀기 : Run configuration의 arguments에 [매개변수1 매개변수2 매개변수3] 입력 후 Apply>Run
		System.out.println("프로그램 시작 변수의 수 : " + args.length);
		for(int x = 0 ;x < args.length ; x++){
			System.out.println(x + " : " + args[x]);
		}
		
		/*
		 * javac xx.java <--컴파일
		 * xx.class
		 * javac xx <--실행
		 * java xx 매개변수1 매개변수2 매개변수3 <--실행시키면서 3개를 args에 넣어준다
		 */
		
		
	}

}
