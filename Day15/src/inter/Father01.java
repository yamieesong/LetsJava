package inter;

/**
 * interface끼리 상속 받을 때도 extends 사용
 */
public interface Father01 extends GrandFather{

	/*
	 * 구현부가 있는게 default 메서드
	 */
	default void eat() {
		System.out.println("Father01 밥먹는다");
	}
}
