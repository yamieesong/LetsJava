
public class ExtendsExample {

	public static void main(String[] args) {
		
		Parents parents = new Parents();
		parents.eatMeal();
		
		Child child = new Child();
		child.eatMeal();
		
		Human human = new Child();				//다형성.. 공부하자..!
		Object object = new Child();			//최상위 클래스인 Object
		
		human.eatMeal();
		object.eatMeal();						//안 되는 이유 ! Human 클래스(자식)는 이미 eatMeal()이 정의되어 있지만 Object 클래스(부모)에는 eatMeal()이라는 메서드가 없다.
		((Child)object).eatMeal();				//이렇게 타입 캐스팅을 해주면 오류가 해결됨! 상속을 통한 소스(코드)의 재활용
		
		Human human2 = new Parents();
		human2.eatMeal();
		((Parents)human).eatBear();				//casting해서 쓸 수 있다..
		
	}
	
}


class Human {
	int mouseCnt = 1;
	int eyeCnt = 2;
	
	void eatMeal() {
		System.out.println("Human eat Meal");
	}
}


class Parents extends Human {
	void eatBear() {
		System.out.println("Parents eat Beal");
	}
}


class Child extends Parents {
}