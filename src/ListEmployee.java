public class ListEmployee {
    private final Employee[] employees;
    private int size;

    public ListEmployee() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String surname, String name, String patronymic, String department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить данные работника. Штат заполнен.");
        } else {
            employees[size++] = new Employee(surname, name, patronymic, department, salary);
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public void minSalary(int min) {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == min) {
                System.out.println("Минимальная зарплата - " + ' ' + min + " у сотрудника : " + employee.getSurname() + ' ' + employee.getName()
                        + ' ' + employee.getPatronymic() + ' ' + " id - " + employee.getId());
            }
        }
    }

    public void maxSalary(int max) {
        max = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() == max) {
                System.out.println("Максимальная зарплата - " + ' ' + max + " у сотрудника : " + employee.getSurname() + ' ' + employee.getName()
                        + ' ' + employee.getPatronymic() + ' ' + " id - " + employee.getId());
            }
        }
    }
    public int midlSalary() {
        return sumSalary() / size;
    }
    public void printAllName() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getName() + ' ' + employee.getSurname() + ' ' + employee.getPatronymic());
        }
    }
}
