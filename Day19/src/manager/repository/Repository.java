package manager.repository;

import java.sql.SQLException;
import java.util.List;
import manager.entity.Student;

public interface Repository {
	
	// CRUD 
	// 1. Read  - 통신은 <Student>로
	List<Student> selectStudents() throws SQLException;
	//selectStudent오버로딩1
	Student selectStudent(int stdNo) throws SQLException;
	//selectStudent오버로딩2
	List<Student> selectStudent(String name) throws Exception;

	//-- 최종 추가된 학생
	Student lastInsertedStudent() throws Exception; // 최종 입력된 학생번호

	
	// 2. Create(Insert) 
	boolean registStudent(Student student) throws SQLException;
	
	// 3.Update
	int updateStudent(int stdNo, Student student) throws SQLException; 
	
	// 4.Delete 
	boolean deleteStudent(int stdNo) throws Exception;


	// 5. 자원반납
	void closeRepository() throws Exception;

	
}
