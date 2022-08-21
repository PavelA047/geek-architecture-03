package composite;

public class Main {
    public static void main(String[] args) {
        Designer designer = new Designer();
        designer.construct("a", 200);
        Developer developer = new Developer();
        developer.construct("b", 300);
        Organization organization = new Organization();
        organization.addEmployee(designer);
        organization.addEmployee(developer);
        System.out.println(organization.getNetSalaries());
    }
}
