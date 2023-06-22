package manager.service.impl;

import manager.entity.Student;
import manager.service.ManagerService;
import manager.repository.*;
import manager.repository.impl.CollectionRepository;
import manager.repository.impl.DBRepository;

import java.util.List;


/**
 * 서비스는 호출하는게 repository임..!
 * 
 * repository객ㅊㅔ를 만들고 사용!
 */
public class ManagerServiceImpl implements ManagerService {
	// 어떤 DB를 사용할건지~~~~!!!! 여기서 세팅..!!!
	//이걸 통해서 DBRepository로 연동! =======> 이 부분을 CollectionRepository로 바꿔주면 변경됨. private final Repository repository = new CollectionRepository();
	
	//DB를 사용하고싶다 그러면 아래 주석 풀어서 쓰기
	//?? 제어의 역전. 스프링 가면 프레임워크까지.. 선택한다.
	//private final Repository repository = new DBRepository();		
	
	
	//컬렉션으로 시작할 때는 메모리에 새로 띄우기 때문에 무조건 초기화 되면서 실행 됨
	private final Repository repository = new CollectionRepository();

    @Override
    public Student registerStudent(Student student) throws Exception {
    	Student resultStudent = null;
    	
    	//성공 실패 여부 확인
    	if(repository.registStudent(student)) {
    		resultStudent = repository.lastInsertedStudent();
    	}
    	
        return resultStudent;
    }

    @Override
    public Student modifyStudent(Student student) throws Exception {
    	
    	// student.getStdNo();굳이 인자로 넘기지 않아도 되지만 repository 표준에 updateStudent(int, Student)
    	int affectedRows = repository.updateStudent(student.getStdNo(), student); 		//나중에 빼주삼..
    	if(affectedRows > 0) {
    		return student;
    	} else {
    		return null;
    	}
    }

    @Override
    public List<Student> searchStudents(Student student) throws Exception {
    	List<Student> list = null;		//여기서는 왜  = new ArrayList<Student>()로 초기화 안하는지 물어보기..
    	
    	if(student == null) {
    		//1.전체검색
        	list = repository.selectStudents();
    	} else if (student.getName() != null){
    		//2.학생이름
        	list = repository.selectStudent(student.getName());
    	}else {
    		//3.학생번호로 조회
    		list = List.of(repository.selectStudent(student.getStdNo()));
    	}
    		
        return list;
    }

    @Override
    public boolean deleteStudent(int stdNo) throws Exception {
        return repository.deleteStudent(stdNo);
    }

    @Override
    public void closeService() throws Exception {
    	repository.closeRepository();
    }
}
