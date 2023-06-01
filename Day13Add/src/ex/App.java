package ex;

/*실행시킬 Application*/
public class App {

	public static void main(String[] args) {
		
		/*new 클래스생성자()*/
		//Parent parent = new Parent(); 기본생성자가 없어서 이렇게 하면 오류!
		Parent parent = new Parent("name인자");
		Child child = new Child();		//Child 객체 생성 시 먼저 부모 객체인 Parent 객체를 생성 하고, 그 뒤 Child 객체 생성
		
		parent.eatMeal();
		child.eatMeal();
		child.parentEatMeal();
	}
}
