import java.util.Scanner;

public class OpTest {
	
	public static void main(String[] args) {
		/*
		int student = 27;
		int pen = 5 * 12;
		
		int studentPen = pen / student;
		int penn = pen % student;
		
		System.out.println("�� �л����� ������ �� �� �ִ� ������ �� :: " + studentPen);
		System.out.println("���� ������ �� :: " + penn);
		*/
		
		//���ǽĸ� (age >= 6 && height >= 120 && hearchDease == false) || (age < 6 && parent = true && height >= 120 && hearchDease == false)
		
		int age;
		int height;
		int parentInt;
		boolean parent;
		int hDInt;
		boolean hearchDease;
		String msg1 = "ž�°���";
		String msg2 = "ž�ºҰ�";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��� �ּ���(���ڸ� �Է����ּ���)");
		age = sc.nextInt();
		
		if(age < 6) {
			System.out.println("Ű�� �Է��� �ּ���(cm�� ������ ���ڸ� �Է����ּ���)");
			height = sc.nextInt();
			if(height<120) {
				System.out.println(msg2);
				return;
			}
			System.out.println("��ȣ�� ���� ���θ� �Է����ּ���.(���� �� 1, �̵��� �� 2�� �Է����ּ���)");
			parentInt = sc.nextInt();
			if(!(parentInt == 1 || parentInt == 2)) {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			parent = check(parentInt);
			if(parent == false) {
				System.out.println(msg2);
				return;
			}
			
		}
		
		System.out.println("������ȯ ���θ� �Է����ּ���.(���ٸ� 1, �ִٸ� 2�� �Է����ּ���)");
		hDInt = sc.nextInt();
		if(!(hDInt == 1 || hDInt == 2)) {
			System.out.println("�߸��� �Է��Դϴ�.");
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
	//�θ� static�̸� �޼��忡���� static�� ��� �ϰ� �θ� static�ε� �Ⱦ����� �̷��� ����! 
	
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