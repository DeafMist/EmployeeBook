public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

    }

    public static void employeesList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void employeesList(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            System.out.println("id = " + employee.getId() +
                    ", fio = " + employee.getFio() + ", salary = " + employee.getSalary());
        }
    }

    public static int salaryExpenses() {
        int total = 0;

        for (Employee employee : employees) {
            total += employee.getSalary();
        }

        return total;
    }

    public static int salaryExpenses(int department) {
        int total = 0;

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            total += employee.getSalary();
        }

        return total;
    }

    public static Employee employeeWithMinimumSalary() {
        Employee res = null;

        for (Employee employee : employees) {
            if (res == null) {
                res = employee;
                continue;
            }

            if (employee.getSalary() < res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static Employee employeeWithMinimumSalary(int department) {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            if (res == null) {
                res = employee;
                continue;
            }

            if (employee.getSalary() < res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static Employee employeeWithMaximumSalary() {
        Employee res = null;

        for (Employee employee : employees) {
            if (res == null) {
                res = employee;
                continue;
            }

            if (employee.getSalary() > res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static Employee employeeWithMaximumSalary(int department) {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            if (res == null) {
                res = employee;
                continue;
            }

            if (employee.getSalary() > res.getSalary()) {
                res = employee;
            }
        }

        return res;
    }

    public static int averageSalary() {
        return salaryExpenses() / employees.length;
    }

    public static int averageSalary(int department) {
        int total = 0;
        int count = 0;

        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            total += employee.getSalary();
            count++;
        }

        if (count == 0) {
            return 0;
        }
        else {
            return total / count;
        }
    }

    public static void employeeNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFio());
        }
    }

    public static void salaryIndexation(int percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * (1 + percent / 100));
        }
    }

    public static void salaryIndexation(int department, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }

            employee.setSalary(employee.getSalary() * (1 + percent / 100));
        }
    }

    public static void employeesListWithLessThanThisSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                continue;
            }

            System.out.println("id = " + employee.getId() +
                    ", fio = " + employee.getFio() + ", salary = " + employee.getSalary());
        }
    }

    public static void employeesListWithSalaryGreaterOrEqualToThis(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                continue;
            }

            System.out.println("id = " + employee.getId() +
                    ", fio = " + employee.getFio() + ", salary = " + employee.getSalary());
        }
    }
}
