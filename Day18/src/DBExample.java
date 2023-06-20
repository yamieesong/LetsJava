import java.sql.Connection;
import java.sql.DriverManager; /* 기본 java.sql.DriverManager 선택! */
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC (java.sql.* - 기초단계, javax.sql.* - 라이브러리 필요..!)
 * ConnectorJ 혹은 JDBC Driver(업체가 만들어서 제공 - 예. 마리아DB같은 데이터베이스 벤더)
 * 
 * mariaDB (http://mariadb.com)
 * 
 * 1.사용할 DB 벤더의 Driver 로딩시킴 (java.sql.*에 있는 인터페이스를 객체화 시켜서 사용 가능)
 * 2.연결(DB) 진행
 * 		2-1.호스트(주소) 예.http://naver.com
 * 		2-2.연결 아이디/패스워드
 * 		2-3.테이블 선택
 * 		2-4.sql문 사용(질의)
 * 		2-5.모든 질의(SQL) 문의 끝나면, 자원반납(Connection을 닫는다) (예.로그아웃하고 브라우저 창 닫는거랑 같은거)
 */
public class DBExample {
	
	public static void main(String[] args) throws Exception {
		/* 1.mariadb Driver 로딩 */
		Class.forName("org.mariadb.jdbc.Driver");
		
		/* 2.DB연결 */
		//connection String은  https:// http://대신 jdbc:mariadb://로 사용한다 (마리아jdbc로 접속하겠다는 것.오라클은 오라클로 바꿔서)
		Connection conn = DriverManager.getConnection("jdbc:mariadb://javalec.cjimpzwx6dik.ap-northeast-2.rds.amazonaws.com:3306/javaProject", "admin", "Qhdial1!");	// 호스트:포트/데이터베이스명, id, pwd
		
		/* 3.질의문 
		 * 		3-1.조회 : executeQuery()
		 * 		3-2.수정 : executeUpdate() (return type은 int. update한 row count)
		 * */
		
		//3-1.조회
		String sql = "SELECT * FROM STUDENT";
		Statement stmt = conn.createStatement();					//쿼리 구문을 실행하는 객체
		ResultSet rs = stmt.executeQuery(sql);						//executeQuery 마우스 올려보면 return type이 ResultSet이다. (리스트와 흡사함). DB에 질의문 실행
		
		//데이터 확인
		while(rs.next()) {
			System.out.println("[이　　름] " + rs.getString("NAME"));
			System.out.println("[학　　년] " + rs.getString("GRADE"));
			System.out.println("[평균점수] " + rs.getInt("SCORE"));
			System.out.println("[수정일자] " + rs.getTimestamp("UPDATE_DT"));
		}
		
		//3-2.수정(업데이트)
		sql = "UPDATE STUDENT SET NAME = '뽀야미', UPDATE_DT = current_timestamp()" + " WHERE STD_NO = 1";
		int affected_rows = stmt.executeUpdate(sql);
		
		System.out.println("\naffected_rows ::: " + affected_rows);
		
		//3-1.조회(수정된 데이터 확인)
		sql = "SELECT * FROM STUDENT";
		rs = stmt.executeQuery(sql);

		//데이터 확인
		while(rs.next()) {
			System.out.println("[이　　름] " + rs.getString("NAME"));				//return type이 ResultSet이라서 키 넣으면 value 나오는거..
			System.out.println("[학　　년] " + rs.getString("GRADE"));
			System.out.println("[평균점수] " + rs.getInt("SCORE"));
			System.out.println("[수정일자] " + rs.getTimestamp("UPDATE_DT"));
		}
		
		/* 4.자원반납(Connection 끊기. 닫겨있지 않다면(열려있다면) 연결 종료 */
		stmt.close();
		if(!conn.isClosed()) conn.close();
	}
}
