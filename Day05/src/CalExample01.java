
public class CalExample01 {
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 20;
		
		//&&	and
		System.out.println("----------------------------------");
		System.out.println(a>10 && a++ <20);
		System.out.println("a=" + a); //10
		
		//&	and
		System.out.println("----------------------------------");
		System.out.println(a>10 & a++ <20);
		System.out.println("a=" +a); //11
		
		//|| or
		System.out.println("----------------------------------");
		System.out.println(b <= 20 || b-- < 20 );
		System.out.println("b="+b); //20
		
		//|| or 
		System.out.println("----------------------------------");
		System.out.println(b <= 10 || b-- < 20 );
		System.out.println("b="+b); //19
		
		//| or
		System.out.println("----------------------------------");
		System.out.println(b <= 20 | b-- <20);
		System.out.println("b="+b); //18
		
		
		System.out.println("----------------------------------");
		System.out.println(b<10 || b-- <10);
		System.out.println("b="+b);
		
		System.out.println("----------------------------------");
		System.out.println(b<16 && b++ <16);
		System.out.println("b="+b);
		
		System.out.println("----------------------------------");
		System.out.println(b<16 & b++ <16);
		System.out.println("b="+b);
		
	}
	
}
