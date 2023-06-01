package poly;

/*생산직 클래스*/
public class ProductionPosition extends People{
	String part;		//일 하는 파트
	
	
	ProductionPosition(String name, String part){
		this.name = name;		//부모클래스에서 상속 받음
		this.part = part;		//부모클래스에서 상속 받음
	}
	
	@Override
	public void work() {
		System.out.println("\n" + name + "님은 " + part + " 실행");
	}

}
