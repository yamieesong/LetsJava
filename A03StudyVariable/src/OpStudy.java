
public class OpStudy {

	public static void main (String[] args) {
		
		/* ���� */
		// 1.���Կ��� += : ������ ���� ���� ���ؼ� ���� �׿� ����, -= : ������ ���� ���� ���� ���� �׿� ����, = : ������ ���� ���� ���ʿ� ����
 		int number1 = 10;
 		System.out.println(number1);
 		
 		number1 += 10;						//���ϰ� ����
 		System.out.println(number1);
 		
 		number1 -= 10;						//���� ����
 		System.out.println(number1);
 		
 		number1 *= 10;						//���ϰ� ����
 		System.out.println(number1);
 		
 		number1 /= 2;						//������ ����
 		System.out.println(number1);
 		
 		number1 %= 4;						//������ ����
 		System.out.println(number1);
 		
		
		// 2.�������. ����(int)�� ����(int)�� ���� ����� �׻� ����(int)
 		int a = 10;
 		int b = 4;
 		System.out.println(a/b);
 		
 		System.out.println((double)a/b);	//������ ����ȯ(casting)�Ͽ� ����	
 		
 		// 2-1.��ȣ���� ��ȣ������ ���� �ٲٴ°� �ƴ϶� ��ȣ�� �����ϴ� �������� int a = 5; ���� system.out.println(-a); �� ��� �� -5�� ��µȴ� �ص� a�� -5�� �� ���� �ƴϴ�.
 		int k = 10;
 		System.out.println(-k);
 		System.out.println(k);				//���� ��ȣ������ ����Ͽ����� a���� ���ԵǴ°� �ƴϴ�. ������ �ٲٰ� �ʹٸ� k = -k;�� ���Կ����ڸ� ����ؾ� �Ѵ�.
 		
 		 		
		
		// 3.�������� ++ : 1����, -- : 1���� 
		// 3-1.�������� ++������ : ���� ������ 1�� ���� ��Ų �� �ٸ� ������ ����
 		// 3-2.�������� ������++ : �ٸ� ���� ���� �� ������ 1 ����
 		System.out.println("\n\n3.��������");
 		int x = 10;
 		int y = 10;
 		
 		++x;
 		y++;
 		
 		System.out.println(x);
 		System.out.println(y+"\n");				//�ܵ����� ����ϴ� ��쿡�� ���̰� ����
 		
 		int z = 10;
 		int u = ++z;
 		
 		int r = 10;
 		int e = r++;
 		int kk = r;
 		
 		System.out.println(u);
 		System.out.println(e);
 		System.out.println(r);
 		System.out.println(kk);
 		System.out.println(e+"\n");
 		
 		e = r++;
 		System.out.println("*"+e);
 		System.out.println("*"+r);
 		
		// 4.�񱳿��� ���� ���Ѵ�(boolean ��� true, false) == : ���� ��, != : ���� ����, >, >=, <, <=
		// e = 11, r = 10
 		System.out.println("\n"+(e < r));
 		System.out.println(e == r);
 		System.out.println(e != r);
 		
 		boolean kkk = e==r;					//boolean ������ �����(true or false)�� ����
 		System.out.println(kkk+"\n");
 		
		
		// 5.������ &&(and), ||(or), !, &, |
		// 5-1.XOR(^) �� �� �� �ϳ��� �׸� true�� �� true��ȯ!
 		// e = 11, r = 12
 		System.out.println(e == r);			//false
 		System.out.println(!(e == r));		//true
 		System.out.println(e == r ^ e < r);		//false ^ true => true ��ȯ
 		
 		
		
		// 6.��Ʈ���� &, | , ~, ^
		
		
		// 7.���׿��� ���ǽ�?��:����
		
		
		// 8.���ڿ����� + : ���ڿ� ����
	}
}
