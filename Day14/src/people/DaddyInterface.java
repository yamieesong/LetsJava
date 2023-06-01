package people;

/**
 * 인터페이스는 추상메서드. 기능의 집합!
 */
public interface DaddyInterface {
	
	/**
	 * 추상클래스(일반메서드와 추상메서드 공존)는 일반 메서드가 존재하기 때문에 abstract라는 키워드를 사용해줘야 했는데,
	 * 인터페이스는 생략가능
	 * public abstract void play();이 아니라 생략 가능 void play(); 이렇게!
	 * 인터페이스는 추상메서드의 집합!
	 * 접근제한이 걸리면 안 된다 이종간의 통신. 때문에 인터페이스는 public! 
	 */
	void play();

}
