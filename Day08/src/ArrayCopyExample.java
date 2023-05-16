
public class ArrayCopyExample {

	public static void main(String[] args) {
		
		/* 배열 복사가 없을 때 */
		// 참조형변수라 주소값을 공유하게 되어 b를 변경해도 a까지 영향을 받는다.
		int[] a = {1,2};
		int[] b = a;
		
		b[1] = 100;
		System.out.println(a[1]);
		
		
		/* 1. for문을 활용한 복사 */
		int[] a1 = {1,2};
		int[] b1 = new int[a1.length];
		
		for(int i = 0; i < a1.length; i++) {
			b1[i] = a1[i];
		}
		
		b1[1] = -1000;
		System.out.println(a1[1]);
		System.err.println(b1[1]);
		
		
		/* 자바 API를 사용한 복사 */
		// 1.System.arrayCopy[]
		int a2[] = {1,2,3};
		int b2[] = new int[a2.length]; 
		System.arraycopy(a2, 0, b2, 0, a2.length);
		
		System.out.println("Java API arrayCopy를 사용한 복사");
		for(int x = 0; x < b2.length; x++) {
			System.out.println(b2[x]);			
		}
		
		/* 향상된for문(=for each문) : 성능은 for문(full)이 더 낫다 */
		System.out.println("향상된 For문을 사용하여 배열 꺼내기");
		for(int val : b2) {
			System.out.println(val);
		}
		
		
	}
}
