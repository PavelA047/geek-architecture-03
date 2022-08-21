package composite;

public interface Employee {
    void construct(String name, float salary);
    String getName();
    void setSalary(float salary);
    float getSalary();
    String[] getRoles();
}
