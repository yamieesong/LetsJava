package manager.connect;

import manager.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class CollectionDBConnect {
    private static final List<Student> students = new ArrayList<Student>();			//List<Student> students 이게 데이터베이스 역할

    public static List<Student> getConnection() {
        return students;
    }

    public void closeConnection() {};
}
