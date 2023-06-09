import java.util.*;

/**
 * List는 interface라서 List list = new List(); 안됨 
 */
public class ListEx {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		
		/*기본으로 들어갈까 Wrapper클래스로 들어갈까? 
		 * add(Object e) Object(클래스)로 받는다. 따라서 오토박싱된다. 기본형으로 받지 못하고 다 객체로 받아야 함
		 * 
		 * p.369 ArrayList 
		 */
		
		/*List (=가변배열)*/
		List list = new ArrayList();
		
		//값 넣기
		list.add(10);						//integer객체		
		list.add(20);						//integer객체
		list.add(new String("뽀야미"));		//integer는 하나의 데이터 타입만 받을 수 있는데 arraylist는 그렇지 않음 모든 객체를 받아들일 수 있다.
		list.add("광어");
		list.add(1);
		list.add(3);
		list.add(2);
		
		//List 크기 구하기
		System.out.println("list.size() = " + list.size());
		
		//List 값 꺼내기 (배열처럼 index로 꺼냄)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		
		System.out.println("=============================================배열!");
		//참고. 배열은?
		System.out.println(a[0]);
		
		
		System.out.println("=============================================list!");
		//List 배열처럼 값 전체 꺼내기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			System.out.printf("list[%d] = " +list.get(i) +"\n", i );
		}
		
		System.out.println(list);
		
		//향상된 For문 -- 이거는 좀 더 공부해!!
		for(Object o : list) {
			System.out.println(o);
		}
		
		
		
		System.out.println("=============================================set!");
		/*set (=가변배열), get이라는 메서드 아예 없옹!!*/
		Set hashSet = new HashSet();
		hashSet.add("광어");
		hashSet.add("우럭");
		hashSet.add("나비");
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(2);
		hashSet.add(20);
		hashSet.add(10);
		
		System.out.println(hashSet + " 중복제거, 오름차순정렬");		//System.out.println(set);는 System.out.println(set.toString());과 같음. 10이 왜 뒤에 오는지 쓰앵님이 확인해주신다고 함
		
		//향상된for문으로만 꺼내기 가능
		for(Object o : hashSet) {
			System.out.println(o);
		}
		
		//삭제하는거
		
		
	}
}


