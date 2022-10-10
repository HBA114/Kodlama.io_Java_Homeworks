package kodlama_io.business;

import kodlama_io.core.logging.ILogger;
import kodlama_io.data_access.teacher.ITeacherDao;
import kodlama_io.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {
    private ITeacherDao teacherDao;
    private ILogger[] loggers;
    private List<Teacher> teachers = new ArrayList<Teacher>();

    public TeacherManager(ITeacherDao teacherDao, ILogger[] loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    public void add(Teacher teacher) {
        boolean isTeacherInDatabase = false;
        for (Teacher teacher1 : teachers){
            if (teacher1.equals(teacher)){
                isTeacherInDatabase = true;
                break;
            }
        }
        if (!isTeacherInDatabase) {
            teacherDao.add(teacher);
            teachers.add(teacher);
            for (ILogger logger : loggers) {
                logger.log("Teacher Added");
            }
        } else {
            for (ILogger logger : loggers) {
                logger.log("Teacher already in database!");
            }
        }
    }
}
