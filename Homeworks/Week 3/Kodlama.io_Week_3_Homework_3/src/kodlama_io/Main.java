package kodlama_io;

import kodlama_io.business.CategoryManager;
import kodlama_io.business.CourseManager;
import kodlama_io.business.TeacherManager;
import kodlama_io.core.logging.DatabaseLogger;
import kodlama_io.core.logging.FileLogger;
import kodlama_io.core.logging.ILogger;
import kodlama_io.data_access.category.JdbcCategoryDao;
import kodlama_io.data_access.course.HibernateCourseDao;
import kodlama_io.data_access.teacher.HibernateTeacherDao;
import kodlama_io.entities.Category;
import kodlama_io.entities.Course;
import kodlama_io.entities.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = new ILogger[]{
                new FileLogger(),
                new DatabaseLogger()
        };

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        // tests
        teacherManager.add(new Teacher("Engin", "Demiroğ"));
        teacherManager.add(new Teacher("Engin", "Demiroğ"));
        System.out.println();
        categoryManager.add(new Category("Kod"));
        categoryManager.add(new Category("Kod"));
        System.out.println();
        courseManager.add(new Course("C#", 10.99));
        courseManager.add(new Course("C#", 9.99));
    }
}
