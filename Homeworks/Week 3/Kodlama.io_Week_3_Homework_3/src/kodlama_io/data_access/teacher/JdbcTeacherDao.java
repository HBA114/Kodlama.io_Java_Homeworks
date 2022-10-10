package kodlama_io.data_access.teacher;

import kodlama_io.entities.Teacher;

public class JdbcTeacherDao implements ITeacherDao {

    @Override
    public void add(Teacher teacher) {
        System.out.println("Teacher added to the database with Jdbc : " + teacher.getName() + " " + teacher.getLastName());
    }
    
}
