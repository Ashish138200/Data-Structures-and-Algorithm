package Lists;

import java.util.Objects;

public class Employee {
    private String fname;
    private String lname;
    private int id;

    public Employee(String fname, String lname, int id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                fname.equals(employee.fname) &&
                lname.equals(employee.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", id=" + id +
                '}';
    }
}
