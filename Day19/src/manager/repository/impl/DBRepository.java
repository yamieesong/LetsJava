package manager.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import manager.connect.MariaDBConnect;		//이 부분 수정하면 됨
import manager.entity.Student;
import manager.repository.Repository;

public class DBRepository implements Repository {

	
	//1.DB커넥션을 불러와야함
	private Connection connection = null;		//접근 못하게 생성
	
	//DBRepository의 객체가 생성될 때 DBConnection 객체를 connection에 넣고 싶다.
	//생성할 때 사용하는 메서드 = 생성자
	
	//생성자 (접근제한자 + 클래스명)
	public DBRepository() {
		/*this.connection = MariaDBConnect.getConnection(); 이렇게 하면 에러난다 Exception을 잡지 않은 상태라서..! 그래서 아래 try catch로 잡는 방법으로 사용*/
		try {
			this.connection = MariaDBConnect.getConnection();
		} catch (Exception ex) {
			System.out.println("DB접속에러 ::: \n" + ex.getMessage());			//싱글턴, 하나로 공유하는 방식
		}
		
	}
	
	
	//-- R
	// 검색어가 없다. (즉 인자가 없는 메서드 = 전체). 학생 전체를 불러온다
	@Override
	public List<Student> selectStudents() throws SQLException {
		String sql = "SELECT * FROM STUDENT ORDER BY STD_NO ASC";
		PreparedStatement pstmt = connection.prepareStatement(sql);			//PreparedStatement 이거는 좀 공부 더 하기 executeQuery를 쓰기 위해서 쓴거!
		//쿼리를 DB에 날린다
		/*pstmt.executeQuery(sql);      return type이 result set임 그래서 resultset타입으로 받게 하기*/
		ResultSet result = pstmt.executeQuery();
		List<Student> resultList = new ArrayList<Student>();
		
		while(result.next()) {		//한 개라도 데이터가 있으면! 들어올 수 있게
			resultList.add(
						   new Student(result.getInt("STD_NO"), result.getString("NAME"), result.getString("GRADE") ,result.getInt("SCORE") ,result.getString("INSERT_DT"), result.getString("UPDATE_DT"))
						  );
		}
		//자! 이제 ManagerService.java로 가보자
		return resultList;			//리턴 시에는 자바 일반 오브젝트로 진행한다. 아니면 지옥이...
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {				//사번이나 학번 이런건 하나의 키라서 List로 받아오지 않음
		String sql = "SELECT * FROM STUDENT WHERE STD_NO = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, stdNo);
		
		ResultSet result = pstmt.executeQuery();
		
		Student student = null;
		
		while(result.next()) {
			student = new Student(result.getInt("STD_NO"), result.getString("NAME"), result.getString("GRADE") ,result.getInt("SCORE") ,result.getString("INSERT_DT"), result.getString("UPDATE_DT"));
		}
		
		return student;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		String sql = "SELECT * FROM STUDENT WHERE NAME = ?";		//?는 치환해주는 것
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, name);		//물음표 순서대로 1,2 이런식으로 사용하면 됨 따로 공부하기!
		
		ResultSet result = pstmt.executeQuery();
		List<Student> resultList = new ArrayList<Student>();
		
		while(result.next()) {
			resultList.add(
						   new Student(result.getInt("STD_NO"), result.getString("NAME"), result.getString("GRADE") ,result.getInt("SCORE") ,result.getString("INSERT_DT"), result.getString("UPDATE_DT"))
						  );
		}
		
		return resultList;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		//맨 마지막에 들어가는 학생을 1명 뽑아오는 거
		String sql = "SELECT * FROM STUDENT ORDER BY STD_NO DESC LIMIT 1";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		ResultSet result = pstmt.executeQuery();
		Student student = null;
		
		while(result.next()) {
			student = new Student(result.getInt("STD_NO"), result.getString("NAME"), result.getString("GRADE") ,result.getInt("SCORE") ,result.getString("INSERT_DT"), result.getString("UPDATE_DT"));
		}
		return student;
	}

	//--- C

	@Override
	public boolean registStudent(Student student) throws SQLException {			//insert부분
		String sql = "INSERT INTO STUDENT (NAME, GRADE, SCORE) VALUES (?, ?, ?)";
		PreparedStatement pstmt = connection.prepareStatement(sql);		//통신 고속도로 만들기 ~.~
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		
		//execute=항상 false, 돌아오는 값이 있으면 true
		//executeUpdate 리턴타입 int(영향받은 row의 숫자)
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		
		return affectedRows > 0 ;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {		//많아도 좋으니 여러개 만들어서 서비스에서 조합해서 쓰는게 좋음
		String sql = "UPDATE STUDENT SET NAME = ?, GRADE = ?, SCORE =?, UPDATE_DT=current_timestamp()  WHERE STD_NO = ? ";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getGrade());
		pstmt.setInt(3, student.getScore());
		pstmt.setInt(4, stdNo);
		
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		
		return affectedRows;

	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		String sql = "DELETE FROM STUDENT WHERE STD_NO = ?";
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		pstmt.setInt(1, stdNo);
		
		int affectedRows = pstmt.executeUpdate();
		pstmt.close();
		
		return affectedRows > 0;
	}

	@Override
	public void closeRepository() throws Exception {
		//데이터베이스 커넥션을 닫는 부분
		if(connection != null && !connection.isClosed()) {
			connection.close();
		}
	}

}
