package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;

import manager.entity.Student;
import manager.repository.Repository;

/*Repository타입의 CollectionRepository(어떤걸로 로딩할지)*/
/**
 * implements하는 메서드들을 구현해줘야함 Add unimplements method
 */
/*
Spring 예
@Qualifier("DB")
*/
public class CollectionRepository implements Repository{

	@Override
	public List<Student> selectAllStudents() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student selectStudents(int stdNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selectSearchStudents(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteStudent(int stdNo) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int rowCnt() throws Exception {
		// TODO Auto-generated method stub
		return 100;
	}

}
