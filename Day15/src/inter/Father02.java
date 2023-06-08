package inter;

public interface Father02 extends GrandFather{

	default void eat() {
		System.out.println("Father02 밥먹는다");
	}
}
