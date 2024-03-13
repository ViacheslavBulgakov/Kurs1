public class Main {

    public static Employee[] employees;
    public int size;

    public Main() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String surname, String name, String patronymic, String department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить данные работника. Штат заполнен.");
        } else {
            employees[size++] = new Employee(surname, name, patronymic, department, salary);
        }
    }
    public static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }
    public static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    public static Employee minSalary() {
        int min = 1000;
        Employee employeeSalaryMin = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() < min) {
                    min = employee.getSalary();
                    employeeSalaryMin = employee;
                }
            }
        return employeeSalaryMin;
    }
    public static Employee maxSalary() {
        int max = 0;
        Employee employeeSalaryMax = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getSalary() > max) {
                    max = employee.getSalary();
                    employeeSalaryMax = employee;
                }
            }
        return employeeSalaryMax;
    }
    public static double midlSalary() {
        int count = 0;
        double sum = 0;
        double midl = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
            midl =  sum / count;
        }
        return midl;
    }
    public static void printAllName() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println(employee.getName() + ' ' + employee.getSurname() + ' ' + employee.getPatronymic());
            }
        }
    }



    public static void main(String[] args) {

        Main main = new Main();

        main.addEmployee("Ласточкин", "Валерий", "Степанович", "01", 120);
        main.addEmployee("Семплеяров", "Аркадий", "Аполлонович", "01", 140);
        main.addEmployee("Стравинский", "Александр", "Николаевич", "02", 190);
        main.addEmployee("Квасцов", "Тимофей", "Кондратьевич", "02", 205);
        main.addEmployee("Берлиоз", "Михаил", "Александрович", "03", 85);
        main.addEmployee("Римский", "Григорий", "Данилович", "03", 90);
        main.addEmployee("Босой", "Никанор", "Иванович", "04", 240);
        main.addEmployee("Варенуха", "Иван", "Савельевич", "04", 285);
        main.addEmployee("Лиходеев", "Степан", "Богданович", "05", 175);
        main.addEmployee("Покобатько", "Милица", "Андреевна", "05", 170);
        main.addEmployee("Иванов", "Иван", "Иванович", "00", 100);


        printAllEmployees();
        System.out.println("Ежемесячные затраты на зарплату равны - " + ' ' + sumSalary());
        System.out.println("Минимальная зарплата у сотрудника - " + minSalary());
        System.out.println("Максимальная зарплата у сотрудника - " + maxSalary());
        System.out.println("Средняя заработная плата составляет - " + ' ' + midlSalary());
        System.out.println("Фамилия Имя Отчество всех сотрудников : ");
        printAllName();

    }
}
//https://github.com/ViacheslavBulgakov/Kurs1/compare/hwKurs1