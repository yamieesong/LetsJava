
public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "뽀야미";
		String str2 = "래미";
		
		System.out.println("str1 = " + System.identityHashCode(str1));
		
		str1 = str1 + str2 + "기여워" ;
		
		System.out.println("str1 = " + System.identityHashCode(str1));
		System.out.println(str1);
		
		
		StringBuffer str3 = new StringBuffer("뽀야미");
		System.out.println("str3 = " + System.identityHashCode(str3));
		
		str3.append(str2);						//p.321 .append(String str)를 사용하여 문자열값 뒤에 붙임, https://docs.oracle.com/javase/8/docs/api/index.html 여기 들어가서 꼭 확인해보기  (Constructors = 생성자)
		str3.append("기여워");
		
		str3.append("동숲").append("재밌냐"); 	//여러개 가능
		
		
		System.out.println("str3 = " + System.identityHashCode(str3));
		System.out.println(str3);
		
		System.out.println("str1 == str3 = " + (str1.equals(str3)));
		
		//12.4 java.util.regex 정규표현식은.. 따로 공부해도 양이 많음.. 3페이지로 보기에는 쥬륵.. 있다는 정도만.. 보기
	}
}
