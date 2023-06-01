package poly;

public class People {
	
	String name;
	
	/*생성자*/
	People(){
		this.name = "Jinny";
	}
	
	People(String name){
		this.name = name;
	}

	//메서드(멤버메서드) = 행위
	void work() {
		System.out.println(name + "일하다");
	}
	
	
}
