public class Manager extends Employee implements BonusCalculator{

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary*0.3;
    }

    @Override
    double calculateSalary() {
        return salary + getBonus();
    }
}
