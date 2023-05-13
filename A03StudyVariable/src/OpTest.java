import java.util.Scanner;

public class OpTest {
	
	public static void main(String[] args) {
		/*
		int student = 27;
		int pen = 5 * 12;
		
		int studentPen = pen / student;
		int penn = pen % student;
		
		System.out.println("각 학생에게 나누어 줄 수 있는 색연필 수 :: " + studentPen);
		System.out.println("남은 색연필 수 :: " + penn);
		*/
		
		//조건식만 (age >= 6 && height >= 120 && hearchDease == false) || (age < 6 && parent = true && height >= 120 && hearchDease == false)
		
		int age;
		int height;
		int parentInt;
		boolean parent;
		int hDInt;
		boolean hearchDease;
		String msg1 = "탑승가능";
		String msg2 = "탑승불가";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요(숫자만 입력해주세요)");
		age = sc.nextInt();
		
		if(age < 6) {
			System.out.println("키를 입력해 주세요(cm를 제외한 숫자만 입력해주세요)");
			height = sc.nextInt();
			if(height<120) {
				System.out.println(msg2);
				return;
			}
			System.out.println("보호자 동반 여부를 입력해주세요.(동반 시 1, 미동반 시 2를 입력해주세요)");
			parentInt = sc.nextInt();
			if(!(parentInt == 1 || parentInt == 2)) {
				System.out.println("잘못된 입력입니다.");
			}
			parent = check(parentInt);
			if(parent == false) {
				System.out.println(msg2);
				return;
			}
			
		}
		
		System.out.println("심장질환 여부를 입력해주세요.(없다면 1, 있다면 2를 입력해주세요)");
		hDInt = sc.nextInt();
		if(!(hDInt == 1 || hDInt == 2)) {
			System.out.println("잘못된 입력입니다.");
		}
		hearchDease = check(hDInt);	
		if(hearchDease == false) {
			System.out.println(msg2);
			return;
		}
		System.out.println(msg1);		
	}
	
	
	public static boolean check(int checkNum) {
		if(checkNum == 1) {
			return true;
		} else if(checkNum ==2) {
			return false;
		} else {
			return false;
		}
	}

}
/*class aaaaaa{
	//부모가 static이면 메서드에서도 static을 써야 하고 부모가 static인데 안쓰려면 이렇게 쓰기! 
	
	public boolean check(int checkNum) {
		if(checkNum == 1) {
			return true;
		} else if(checkNum ==2) {
			return false;
		} else {
			return false;
		}
	}

	
}
*/