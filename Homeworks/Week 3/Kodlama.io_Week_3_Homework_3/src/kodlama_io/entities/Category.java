package kodlama_io.entities;

public class Category extends BaseEntity {
    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public boolean equals(Category category) {
        if (this.name == category.name) {
            return true;
        }
        return false;
    }
}
