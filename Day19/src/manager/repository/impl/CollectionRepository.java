package manager.repository.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import manager.connect.CollectionDBConnect;
import manager.entity.Student;
import manager.repository.Repository;


//인터페이스를 구현하고 있는 거라서 DBRepository랑 같은 구조로 되어 있다
public class CollectionRepository implements Repository {

	private static List<Student> students;
	private int stdNo = 1;
	
	public CollectionRepository() {
		this.students = CollectionDBConnect.getConnection();			//DBCollectionRepository에서 DB 커넥션 만들고 get해서 가져온거랑 똑같은
	}

	@Override
	public List<Student> selectStudents() throws SQLException {
		return this.students;
	}

	@Override
	public Student selectStudent(int stdNo) throws SQLException {
		//이거 너모너모 중요해!!!
		
		/*방법 1         :::루프 돌리는거 성능 (1.for문, 2.foreach문-향상된for문, 3.스트림)
		Student student = null;
		for (Student v : this.students) {
			if(v.getStdNo() == stdNo) {
				student = v;
				break;
			}
		}
		*/
		/*p.416스트림 ( 람다식, 스트림 따로 공부하기 꼭 )*/
		//Student student = students.stream().filter(여기가 람다식!!!)
		//Student student = students.stream().filter(v -> v.getStdNo() == stdNo).collect(Collectors.toList()); 이러면 오류가 나옴 오류 방지를 위해 아래처럼
		List<Student> stdList = students.stream().filter(v -> v.getStdNo() == stdNo).collect(Collectors.toList());
		
		//결과가 없으면 student의 size는 0
		
		
		return students.size() > 0 ? stdList.get(0) : null ;
	}

	@Override
	public List<Student> selectStudent(String name) throws Exception {
		List<Student> stdList = students.stream().filter(v -> v.getName() == name).collect(Collectors.toList());
		return stdList;
	}

	@Override
	public Student lastInsertedStudent() throws Exception {
		//ArrayList는 배열,그러면 배열 길이의 -1번째를 꺼내면 마지막 데이터를 가져올 수 있다!
		Student student = students.get(students.size()-1);		//이 경우 없는 경우도 생각해서 개발해줘야한다. 없으면 오류나니께..
		return student;
	}

	@Override
	public boolean registStudent(Student student) throws SQLException {
		//이거는 add하면 된다!
		
		students.add(student);
		//데이터베이스가 아니라서 넘버링을 할 수 없다. 그래서 상단의 student.setStdNo(stdNo++);를 활용하여 넘버링
		student.setStdNo(stdNo++);
		return true;
	}

	@Override
	public int updateStudent(int stdNo, Student student) throws SQLException {
		Student targetStudent = this.selectStudent(stdNo);
		if(targetStudent != null) {
			students.set(stdNo -1 , student);
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean deleteStudent(int stdNo) throws Exception {
		Student targetStudent = this.selectStudent(stdNo);
		
		if(targetStudent != null) {
			students.remove(stdNo -1); //인덱스는 0부터 시작하는데 stdNo는 1부터 시작하니까 한개 빼줘서 인덱스 
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void closeRepository() throws Exception {

	}
}
