package home;

public class 아빠 {
	
	public int walletBalance = 30000;		//지갑에 들어있는 돈
	
	private int walletBalance2 = 30000;

	public void sayMyName() {
		System.out.println("난 종석이 아빠야.");
	}
	
	/*
	protected int 용돈주세요() {
		
		return 1000;
	}
	*/
	
	public int 용돈주세요() {
		
		if(walletBalance2 < 25000) {
			System.out.println("돈없어..");
			return 0;
		}

		int 용돈 = 1000;
		walletBalance2 -= 용돈;
		System.out.println(">>여기 있다 용돈 " + 용돈 + "원");
		
		return 용돈 ;
	}
	
	
	//가족(패키지)에서 호출 시 아빠의 지갑은 텅텅.. 
	protected int 용돈줘() {
		int 돈 = walletBalance2;
		walletBalance2 = 0;
		return 돈;
	}
	
	
	void 청소하기() {
		System.out.println("집안 청소 쓱쓱쓱");
	}
}
