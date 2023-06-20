package manager;
import manager.repository.*;
import manager.repository.impl.*;

/**
 * 인터페이스는 멀티어댑터같은거라고 생각하면 됨, 어떤 DB를 붙건 인터페이스에서 사용할 클래스(사용할 콘센트)를 재정의해서 구현해주면 쓸 수 있으니까
 */
public class MyApp {
	
	/*
	구현부가 자동으로 들어와짐 (Spring)
	@Autowired
	@Qualifier("collection")
	private Repository repository;
	*/
	
	public static void main(String[] args) throws Exception {
	
		//CollectionRepository, DBRepository의 rowCnt()메서드에 리턴값을 각 100, 1을 넣어주고 시작
		
		//수동으로 import써줬음  import manager.repository.*; import manager.repository.impl.*;
		/*DBRepository를 사용한다면(마리아DB)*/
		Repository rep = new DBRepository();						//선언부
		
		/*CollectionRepository를 사용한다면(기본 리스트같은거)*/
		Repository repCollection = new CollectionRepository();		//선언부
		
		rep.rowCnt();
		repCollection.rowCnt();
	}
}
