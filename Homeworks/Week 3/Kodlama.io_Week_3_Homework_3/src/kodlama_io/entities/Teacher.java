package kodlama_io.entities;

public class Teacher extends BaseEntity {
    String lastName;

    public Teacher() {

    }

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public boolean equals(Teacher teacher) {
        if (this.name == teacher.name && this.lastName == teacher.lastName) {
            return true;
        }
        return false;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
