package kodlama_io.data_access.category;

import kodlama_io.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Category added to the database with Hibernate : " + category.getName());
    }
    
}
