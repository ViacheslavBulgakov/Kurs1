public class Main {

    public Employee[] employees;
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


        ListEmployee.printAllEmployees(main.employees);
        System.out.println("Ежемесячные затраты на зарплату равны - " + ' ' + ListEmployee.sumSalary(main.employees));
        System.out.println("Минимальная зарплата у сотрудника - " + ListEmployee.minSalary(main.employees));
        System.out.println("Максимальная зарплата у сотрудника - " + ListEmployee.maxSalary(main.employees));
        System.out.println("Средняя заработная плата составляет - " + ' ' + ListEmployee.midlSalary(main.employees));
        System.out.println("Фамилия Имя Отчество всех сотрудников : ");
        ListEmployee.printAllName(main.employees);

    }
}