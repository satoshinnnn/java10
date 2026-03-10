public class OfficeStaff extends Employee{

    public OfficeStaff(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}
