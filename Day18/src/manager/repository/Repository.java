package manager.repository;

import java.sql.SQLException;
import java.util.List;

import manager.entity.Student;

/**
 * 어떤 메서드를 만들지 정의
 * 이것들을 implements 한 클래스를 만들어 사용하면 됨(connection에 맞게 2개 있어야 함)
 */
public interface Repository {

	/* CRUD */
	// 1.Read(Select)
	List<Student> selectAllStudents() throws SQLException;						//resultSet하면 레이어간 의존도가 높아짐. 학생의 목록을 리턴하려고 앞에 List<Student> 선언
	
	Student selectStudents(int stdNo) throws SQLException;						//특정한 한 사람만 조회
	
	List<Student> selectSearchStudents(Student student) throws SQLException;	//특정 조건으로 조회
		
	
	// 2.Create(Insert)
	boolean registStudent(Student student) throws SQLException;					//성공과 실패만 리턴하게 만듬
	
	
	// 3.Update
	int updateStudent(int stdNo, Student student) throws SQLException;			//업데이트 된 row 수를 리턴받으려고 int로 선언
	
	
	// 4.Delete
	boolean deleteStudent(int stdNo) throws SQLException;						//조건에 대한 인자값만 받겠다
	
	
	// ETC
	int rowCnt() throws Exception;												//전체 rows 수
}
