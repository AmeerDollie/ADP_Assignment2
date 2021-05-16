package za.ac.cput;

import java.util.Objects;

/*
    Ameer Dollie - 218336934
    This is the employee class
 */

public class employee {

    private String firstName, lastName;
    private int age, id;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public employee(String firstName) {
        this.firstName = firstName;
    }

    public employee(String firstName, int id) {
        this.firstName = firstName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return id == employee.id;
    }
}
