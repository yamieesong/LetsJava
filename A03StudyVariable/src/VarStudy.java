
public class VarStudy {

	public static void main(String[] args) {
		
		/* ���� */
		
		// 1.���� �ʱ�ȭ
		int a;		//���� ����
		a = 10; 	//���� �ʱ�ȭ
		
		int z = 10; //���� ����� �ʱ�ȭ ���ÿ�
		
		
		// 2.�ڷ��� - �⺻�ڷ���
		// 2-1.���� int(����), long(���� 21���� �Ѵ� ��� �� �� �ڷ���), char(�ϳ��� ����. �ش� ���ڿ� �ش��ϴ� �ڵ带 ������ �����ϴ� ����)
		byte b = 1;
		short s = 10;
		int i = 1000;
		long l = 1000;
		long l2 = 1000L;
		
		
		char aa = 'A';
		System.out.println("aa = " + aa);
		System.out.println("aa = " + (int)aa);
		
		int bb = aa;
		System.out.println("bb = " + bb);
		
		char cc = 66;
		System.out.println("cc = " + cc);
		
		// 2-2.�Ǽ� double(�Ҽ����� �ִٸ�)
		float ff = 3.141592f;
		double dd = 3.141592d;
		
		System.out.println("float = " + ff);
		System.out.println("double = " + dd);
		
		double dd2 = 3.141592;
		
		System.out.println("dd2 = " + dd2);
		
		
		// 3.�ڷ��� - �����ڷ���
		// 3-1.�ڷ��� - ���ڿ�
		String name ;			//���� ����
		name = "��浿";			//���� �ʱ�ȭ
		
		String name2 = "�Ѹ�";	//����� ���ÿ� �ʱ�ȭ
		String name3 = null;	//null������ ����
		String name4 = " ";		//" "������ ���� (�� ���ڿ��� ����)
		
		System.out.println("name = " + name);
		System.out.println("name3 = " + name3);
		System.out.println("name4 = " + name4);
		
		
		// 4.����� ���ͷ�
		// 4-1. ���(�� �� �����ϸ� ������ �� ���� ��. �׻� ���� �� ��� ����. ��� ���� �� ���� �տ� final �̶�� Ű����(������)�� ���.)
		final double PI = 3.14 ;
		//PI = 2.32;						//final�� ����� ������ ���Ŀ� ���� �����Ϸ��� �ϸ� ������ �߻�. ������ �ʿ��ϴٸ� final Ű���带 �����ϴ��� ����� ���� �����ϴ� ����� ���.
		final String aaa = "¯��";
		
		
		
		
		
		// 2-3.�� boolean(true, false)
		boolean run = true;
		
		
		
		// 3. �ڷ��� - �����ڷ��� String�� �ٸ� ���ڸ� �Ἥ ���� ���� Ŭ���� �������� ��������!
	}
}
