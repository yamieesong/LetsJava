
public class OpStudy02 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		// &����
		System.out.println(a == b & test());
		
		
		// &&����
		System.out.println(a == b && test());
	}

	
	public static boolean test() {
		System.out.println("test() �޼��� �����. true��ȯ");
		return true;
	}
	
	public boolean test2() {
		return false;
	}
}
