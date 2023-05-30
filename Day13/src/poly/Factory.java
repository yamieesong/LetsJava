package poly;

public class Factory {
	
	
	/*하나의 변수로 여러개를 처리하는 것 = 배열*/
	People[] workers = new People[10];
	int workerCnt = 0;
	
	
	/*모듈화*/
	void recruit(People person) {		//People person 다형성의개념. 같은 일을 하더라도 다르게!
	System.out.println("채용을 진행합니다");
	this.workers[workerCnt++] = person;
	}
	
	
	
	void produce() {
		System.out.println("\n제품을 생산합니다");
		for(int i = 0; i < workerCnt ; i++) {
			workers[i].work();
		}
	}
	
	
}
