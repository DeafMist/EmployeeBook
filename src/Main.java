public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        fillArray();

        System.out.println("------Список всех сотрудников------");
        employeesList();
        System.out.println();

        System.out.println("------Список сотрудников 5 отдела------");
        employeesList(5);
        System.out.println();

        System.out.println("------Затраты компании на выплату зарплат всем сотрудникам------");
        System.out.println(salaryExpenses());
        System.out.println();

        System.out.println("------Затраты компании на выплату зарплат сотрудникам 5 отдела------");
        System.out.println(salaryExpenses(5));
        System.out.println();

        System.out.println("------Сотрудник с минимальной зарплатой------");
        System.out.println(employeeWithMinimumSalary());
        System.out.println();

        System.out.println("------Сотрудник из 4 отдела с минимальной зарплатой------");
        System.out.println(employeeWithMinimumSalary(4));
        System.out.println();

        System.out.println("------Сотрудник с максимальной зарплатой------");
        System.out.println(employeeWithMaximumSalary());
        System.out.println();

        System.out.println("------Сотрудник из 3 отдела с максимальной зарплатой------");
        System.out.println(employeeWithMaximumSalary(3));
        System.out.println();

        System.out.println("------Средняя зарплата в компании------");
        System.out.println(averageSalary());
        System.out.println();

        System.out.println("------Средняя зарплата в 5 отделе------");
        System.out.println(averageSalary(5));
        System.out.println();

        System.out.println("------Вывод ФИО сотрудников------");
        employeeNames();
        System.out.println();

        System.out.println("------Поднятие зарплаты всем сотрудникам на 5%------");
        salaryIndexation(5);
        employeesList();
        System.out.println();

        System.out.println("------Поднятие зарплаты сотрудникам из отдела 1 на 5%------");
        salaryIndexation(1, 5);
        employeesList(1);
        System.out.println();

        System.out.println("------Сотруднки, зарплата которых меньше 40000------");
        employeesListWithLessThanThisSalary(40000);
        System.out.println();

        System.out.println("------Сотруднки, зарплата которых больше 80000------");
        employeesListWithSalaryGreaterOrEqualToThis(80000);
        System.out.println();
    }

    private static void fillArray() {
        employees[0] = new Employee("Никифоров Герасим Акакиевич", 1, 31650);
        employees[1] = new Employee("Христофоров Валерьян Никифорович", 4, 63300);
        employees[2] = new Employee("Чапаев Иван Васильевич", 1, 57900);
        employees[3] = new Employee("Герасимов Анатолий Матмехович", 3, 28470);
        employees[4] = new Employee("Петухов Никита Андреевич", 5, 46320);
        employees[5] = new Employee("Каштанов Булат Айратович", 3, 41860);
        employees[6] = new Employee("Пацаев Качан Качанович", 5, 100001);
        employees[7] = new Employee("Приветов Алексей Геннадьевич", 4, 35580);
        employees[8] = new Employee("Бургамистров Валерий Устинович", 3, 82430);
        employees[9] = new Employee("Александров Александр Юрьевич", 1, 99999);
    }

    private static void employeesList() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            System.out.println(employee);
        }
    }

    private static void employeesList(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getDepartment() != department) {
                continue;
            }

            System.out.println("id = " + employee.getId() +
                    ", fio = " + employee.getFio() + ", salary = " + employee.getSalary());
        }
    }

    private static int salaryExpenses() {
        int total = 0;

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            total += employee.getSalary();
        }

        return total;
    }

    private static int salaryExpenses(int department) {
        int total = 0;

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getDepartment() != department) {
                continue;
            }

            total += employee.getSalary();
        }

        return total;
    }

    private static Employee employeeWithMinimumSalary() {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee == null) {
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

    private static Employee employeeWithMinimumSalary(int department) {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

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

    private static Employee employeeWithMaximumSalary() {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee == null) {
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

    private static Employee employeeWithMaximumSalary(int department) {
        Employee res = null;

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

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

    private static double averageSalary() {
        return (double) salaryExpenses() / Employee.counter;
    }

    private static double averageSalary(int department) {
        int total = 0;
        int count = 0;

        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

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
            return (double) total / count;
        }
    }

    private static void employeeNames() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            System.out.println(employee.getFio());
        }
    }

    private static void salaryIndexation(int percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            employee.setSalary((int) (employee.getSalary() * (1 + (double) percent / 100)));
        }
    }

    private static void salaryIndexation(int department, int percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getDepartment() != department) {
                continue;
            }

            employee.setSalary((int) (employee.getSalary() * (1 + (double) percent / 100)));
        }
    }

    private static void employeesListWithLessThanThisSalary(int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getSalary() >= salary) {
                continue;
            }

            System.out.println(employee);
        }
    }

    private static void employeesListWithSalaryGreaterOrEqualToThis(int salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }

            if (employee.getSalary() < salary) {
                continue;
            }

            System.out.println(employee);
        }
    }
}
