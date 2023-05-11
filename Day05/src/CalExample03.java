
public class CalExample03 {

	public static void main(String args[]) {
		
		/*
		 *bit 연산(=bitwise 연산)
		 *1. bit연산자 = 논리연산자 (AND , OR, XOR, NOT(보수, 반대의 값)) 
		 */
		
		byte x = 5;		//0000 0101
		byte y = 10;	//0000 1010
		
		//참(true)1, 거짓(false)0
		System.out.println("x=0" + Integer.toBinaryString(x));
		System.out.println("y=" + Integer.toBinaryString(y));
		
		//AND 양쪽 항 모두 true 인 경우만 결과값 true (TT=T, TF=F, FT=F, FF=F)
		System.out.println("x & y =" + (x & y));
		System.out.println("0000 0101 & 0000 1010 = 00→0(false) 10→0(false) 01→0(false) = FFFF FFFF = 0000 0000 = 0");
		
		//OR 두 항 중 하나 이상의 항이 true 인 경우 결과값 true (TT=T, TF=T, FT=T, FF=F)
		System.out.println("x | y =" + (x | y));
		System.out.println("0000 0101 | 0000 1010 = 00→0(false) 10→1(true) 01→1(true) = FFFF TTTT = 0000 1111 = 15");
		
		//XOR 두 항 중 하나의 항만 true인 경우 결과값 true (TT=F, TF=T, FT=T, FF=F)
		System.out.println("x^y=" + (x ^ y));
		System.out.println("0000 0101 ^ 0000 1010 = FFFF TTTT = 0000 1111");
		
		System.out.println("~x="+ ~x);
		System.out.println("x(5)는 0000 0101 ~x(5)는 1111 1010 = -6");
		
		
		System.out.println("------------------------------------------------");
		/*
		 * 2.비트 쉬프트 연산
		 * 이런 경우에 사용 2*2*2*2*2*2(모바일CPU) = 2^6 == 1<<6(컴퓨터) 
		 * 
		 * Left Shift 연산	5<<3  : 0000 0101 좌측으로 3칸 이동-> 0010 1??? -> 빈자리 0으로 채움 -> "0010 1000" (빈 자리는 0으로 채움)
		 * 
		 * Right Shift 연산1	5>>2  : 0000 0101 우측으로 2칸 이동-> ??00 0001..01(사라짐) -> ??00 0001 -> 양수였기에 부호비트는 1 -> "1100 0001" (빈 자리는 부호비트로 채움. 양수의 부호비트는 0, 음수의 부호비트는 1)
		 * Right Shift 연산2	5>>>2 : 0000 0101 우측으로 2칸 이동 -> ??00 0001..01(사라짐) -> ??00 0001 -> 빈자리 0으로 채움 -> "0000 0001" (남은 부분은 무조건 0으로 채움. 양수)
		 */
		x = 5;		//0000 0101, ~(보수, 반대값)x=!0!0!0!0 !0!1!0!1 = 1111 1010
		y = 10;		//0000 1010
		
		
		System.out.println("x << 2=" + (x << 2));		//0001 0100 20
		System.out.println("x >> 2=" + (x >> 2));		//0000 0001 1
		System.out.println("~x >> 2=" + (~x >> 2));		//1111 1110 풀이 ::: 1111 1010 >> 2 = ??11 1110(10) = ??11 1110 = 1111 1110 => 10진수 계산 1111 1110 - 1 = 1111 1101 = ~1111 1101 = 0000 0010 = 2 => -2
		System.out.println("~x >>> 2=" + (~x >>> 2));	//0011 1110 풀이 ::: 1111 1010 >>> 2 = ??11 1110(10) = ??11 1110 = 0011 1110
		
		
		
		System.out.println("------------------------------------------------");
		/*
		 * 대입연산
		 */
		byte a = 10;
		a += 10;			 // 설명 ::: a = a + 10;
		
		byte z = 10;
		z = (byte)(z << 2);
		z <<= 2;			// 설명 ::: z = z<<2;
		
		
		System.out.println("------------------------------------------------");
		//p.77
		int v = 20;
		int k = 5;
		
		System.out.println("안녕하세요 저는 " + 20 + 5 + "살 입니다.");
		System.out.println("안녕하세요 저는 " + v + k + "살 입니다.");
		System.out.println("안녕하세요 저는 " + (20 + 5) + "살 입니다.");
		System.out.println("안녕하세요 저는 " + (v + k) + "살 입니다.");
		
	}
}
