package kodlama_io.business;

import kodlama_io.core.logging.ILogger;
import kodlama_io.data_access.category.ICategoryDao;
import kodlama_io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private List<Category> categories = new ArrayList<Category>();

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        if (isAvailable(category)) {
            categoryDao.add(category);
            categories.add(category);
            for (ILogger logger : loggers) {
                logger.log("Category Added");
            }
        } else {
            for (ILogger logger : loggers) {
                logger.log("Category already in database!");
            }
        }
    }

    boolean isAvailable(Category category) {
        boolean isAvailable = true;
        for (Category category1 : categories) {
            if (category1.equals(category)) {
                isAvailable = false;
                break;
            }
        }
        return isAvailable;
    }
}
