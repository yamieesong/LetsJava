
public class OpTest05 {

	public static void main(String[] args) {
		
		int year = 2020;
		
		boolean leapYear = (year % 4 == 0) || !(year % 100 == 0) || (year % 400 == 0);
		System.out.println(leapYear);
		
		
		int price = 187000;
		int oman = price / 50000;
		int ilma = (price % 50000) / 10000;
		int ochun = ((price % 50000) % 10000) / 5000;
		int ilchun = (((price % 50000) % 10000) % 5000) / 1000;
		
		System.out.println("5������ : " + oman + "��");
		System.out.println("1������ : " + ilma + "��");
		System.out.println("5õ���� : " + ochun + "��");
		System.out.println("1õ���� : " + ilchun + "��");
		
		
		
		int number = 1234;
		int result = (number/100)*100 ;
		System.out.println(result);
	}
}
