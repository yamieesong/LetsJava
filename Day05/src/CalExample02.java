
public class CalExample02 {

	public static void main(String[] args) {
		
		byte x = 3;	//1byte = 8bit (0000 0011)
		
		System.out.println("3은 2진수로 " + Integer.toBinaryString(x));
		System.out.println("음수변환(모든 수에 !부정하고 +1) ::: " + Integer.toBinaryString(-1));
		System.out.println("1은 0000 0001 -> !0!0!0!0 !0!0!0!1 + 1 -> 1111 1110 + 1 -> 1111 1111");
		
		
		// 10진수 15를 2진수로 변환
		System.out.println("퀴즈 ::: " + Integer.toBinaryString(15));
		
		// 2진수로 변환 시 1+1은 0으로 표기하고 그 상위 자리수로 1을 올림 처리한다
		System.out.println("퀴즈 ::: " + Integer.toBinaryString(-4));
		System.out.println("4는 0000 0100 -> !0!0!0!0 !0!1!0!0 + 1 -> 1111 1011 + 1 -> 1111 1100");
		
		
		/*
		 * byte 1byte( = 8bit = 2^8 = 0000 0000 8자리)
		 * (-2^8-1) ~ (2^8-1 - 1) = -128 ~ 127
		 * 
		 * 
		 * short 2byte
		 * (-2^16-1) ~ (2^16-1 - 1) = -32,768 ~ 32,767
		 */
		
	}
}
