
public class WraapperEx {

	/**
	 * 클래스 비교 시 equals 사용 권장 
	 */
	public static void main(String[] args) {
		
		/* p.329 */
		Integer i1 = new Integer(10);						//명시적 박싱(자동형변환) (deprecated됨. 앞으로 없어짐)
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(10);					//명시적 박싱
		Integer i3 = Integer.valueOf("100");				//명시적 박싱
		
		Integer i4 = new Integer(10);
		System.out.println("i1 == i2 = " + (i1 == i2));		//값은 같지만 new 라서 다른고임. 비교하려면 equals()를 사용해야 함
		
		Integer i5 = 10;
		
		Integer i6 = 10;									//오토박싱 (= 객체로 변환됨)
		System.out.println(i6.equals(10));
		
		System.out.println("i5 == i6 = " + (i5 == i6));		//상수풀에 있어서 같은값
		
		
		
		/* Wrapper클래스의 상수들 */
		System.out.println("Short의 범위 : ");
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		
		System.out.println("Integer의 범위 : ");
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		// 모든 문자열은 기본형으로 변경 가능 ==> 기본형.valueOf("문자열"); boolean은 불가!
		Double db = Double.valueOf("1.999");
		System.out.println(db);
		

		System.out.println("i6 + 10 = " + (i6 + 10)); 		//오토언박싱 (Integer.parseInt()이런거 안해도 됨) p.331참조
		
		
		/* Math(p.325), StringBuffer, StringBuilder 클래스 읽어보기 */
	}
}
