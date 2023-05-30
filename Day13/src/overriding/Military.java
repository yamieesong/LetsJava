package overriding;

public class Military {

int duration = 24; 	//복무기간
	
	public Military() {
		this.duration = 24; 	//복무기간
	}
	
	void durationOutput() {
		System.out.println("복무기간은 "+ duration + "개월");
	}
	
	void work() {
		System.out.println("군대에서 일하다");
	}
}
