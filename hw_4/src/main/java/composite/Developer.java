package composite;

public class Developer implements Employee{
    protected float salary;
    protected String name;
    protected String[] roles;

    @Override
    public void construct(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public float getSalary() {
        return this.salary;
    }

    @Override
    public String[] getRoles() {
        return this.roles;
    }
}
