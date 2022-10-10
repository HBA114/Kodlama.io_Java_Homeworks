package kodlama_io.data_access.course;

import kodlama_io.entities.Course;

public class JdbcCourseDao implements ICourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Course added to the database with Jdbc : " + course.getName());
    }

}
