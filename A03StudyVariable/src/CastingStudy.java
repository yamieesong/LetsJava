
public class CastingStudy {
	
	public static void main(String[] args) {
		/*
		 * ����ȯ(casting)
		 * ���� ũ���� �ڷ����� ū ũ�⸦ ���� �ڷ����� ����� �� �ڵ� ����ȯ�� �Ͼ��. 
		 * ����ȯ�� ������ 2 ���� �̴�
		 * 	1.�ڵ�(������)����ȯ
		 * 	2.����(�����)����ȯ
		 */
		
		// �⺻ �ڷ����� ũ�� �� ���� : (���� �ڷ���)������ byte < short < int < long < float < double ������(ū �ڷ���)
		
		
		// 1.�ڵ�(������)����ȯ
		int number = 10; 		//int �ڷ������� �ڵ�����ȯ
		
		long number2 = number;	//�ڷ�����ȯ int < long
		
		// 2.����(�����)����ȯ casting
		// 2-1.���� ����ȯ���� �ս��� �Ͼ�� ���
		double pi = 3.14;		//double �ڷ���
		int pi2 = (int)pi;		//��������ȯ
		
		System.out.println("��������ȯ(���� �ս� �߻� double 3.14 �� int 3) = " + pi2);
		
		// 2-2.�� ū �ڷ����� ���� �ڷ����� casting�ص� �ս��� �߻����� �ʴ� ���� ���� �ڷ����� �������� ���ԵǴ� �� 
		// ��) 100�� 100.0�� ��� ���¸� �޶����� �� �ս��� �߻����� �ʵ��� ����ȯ ����
		double score = 100;
		int score2 = (int)score;
		
		System.out.println("��������ȯ(���� �ս��� �߻����� �ʴ� ��� double 100.0 �� int 100 = " + score2);
		
	}

}
