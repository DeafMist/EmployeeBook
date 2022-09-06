public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

    }

    public static void employeesList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int salaryExpenses() {
        int total = 0;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total;
    }

    public static Employee employeeWithMinimumSalary() {
        Employee res = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static Employee employeeWithMaximumSalary() {
        Employee res = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static int averageSalary() {
        return salaryExpenses() / employees.length;
    }

    public static void employeeNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }
}
