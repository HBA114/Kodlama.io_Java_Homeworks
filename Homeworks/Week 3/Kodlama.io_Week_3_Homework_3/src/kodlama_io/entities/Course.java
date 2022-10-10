package kodlama_io.entities;

public class Course extends BaseEntity {
    private double price;

    public Course() {
    }

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public boolean equals(Course course) {
        if (this.name == course.name) {
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
