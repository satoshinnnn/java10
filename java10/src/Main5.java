public class Main5 {

    public static void main(String[] args) {
        OfficeStaff staff = new OfficeStaff("Lan", 800);
        Manager manager = new Manager("Minh", 2000);
        Employee m1 = new Manager("Quan", 2000);

        System.out.println("===== BẢNG LƯƠNG =====");

        System.out.println("Nhân viên: " + staff.name);
        System.out.println("Lương: " + staff.calculateSalary());

        System.out.println();

        System.out.println("Manager: " + manager.name);
        System.out.println("Bonus: " + manager.getBonus());
        System.out.println("Tổng lương: " + manager.calculateSalary());
    }
}
