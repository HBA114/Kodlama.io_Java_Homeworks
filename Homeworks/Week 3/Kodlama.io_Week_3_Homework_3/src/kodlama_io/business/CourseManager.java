package kodlama_io.business;

import kodlama_io.core.logging.ILogger;
import kodlama_io.data_access.course.ICourseDao;
import kodlama_io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;

    private List<Course> courses = new ArrayList<Course>();

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        boolean isCourseInDatabase = false;
        for (Course course1 : courses){
            if (course1.equals(course)){
                isCourseInDatabase = true;
                break;
            }
        }
        if (isCourseInDatabase || course.getPrice() < 0) {
            for (ILogger logger : loggers) {
                logger.log("Course can not be added to the database!");
            }
        } else {
            courseDao.add(course);
            courses.add(course);
            for (ILogger logger : loggers) {
                logger.log("Course added.");
            }
        }
    }
}
