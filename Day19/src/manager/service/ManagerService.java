package manager.service;

import manager.entity.Student;

import java.util.List;

public interface ManagerService {

    //-- 학생등록
    Student registerStudent(Student student) throws Exception;

    //-- 학생수정
    Student modifyStudent(Student student) throws Exception;

    //-- 학생조회
    List<Student> searchStudents(Student student) throws Exception;

    //-- 학생삭제
    boolean deleteStudent(int stdNo) throws Exception;

    //-- 자원반납
    void closeService() throws Exception;

}
