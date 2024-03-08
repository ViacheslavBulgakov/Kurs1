public class Main {
    public static void main(String[] args) {

        Employee[] employees;
        employees = new Employee[10];

        employees[0] = new Employee("Ласточкин", "Валерий", "Степанович", "01", 120);
        employees[1] = new Employee("Семплеяров", "Аркадий", "Аполлонович", "01", 140);
        employees[2] = new Employee("Стравинский", "Александр", "Николаевич", "02", 190);
        employees[3] = new Employee("Квасцов", "Тимофей", "Кондратьевич", "02", 205);
        employees[4] = new Employee("Берлиоз", "Михаил", "Александрович", "03", 85);
        employees[5] = new Employee("Римский", "Григорий", "Данилович", "03", 90);
        employees[6] = new Employee("Босой", "Никанор", "Иванович", "04", 240);
        employees[7] = new Employee("Варенуха", "Иван", "Савельевич", "04", 285);
        employees[8] = new Employee("Лиходеев", "Степан", "Богданович", "05", 175);
        employees[9] = new Employee("Покобатько", "Милица", "Андреевна", "05", 170);


        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(employees[i]);
        }
        int sumSalary = 0;
        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            sumSalary = sumSalary + employee.getSalary();
        }
        System.out.println("Ежемесячные затраты на зарплату равны - " + ' ' + sumSalary);

        int salaryMin = 1000;
        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() < salaryMin) {
                salaryMin = employee.getSalary();
            }
        }
        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            if (salaryMin == employee.getSalary()) {
                System.out.println("Минимальная зарплата - " + ' ' + salaryMin + " у сотрудника : " + employee.getSurname() + ' ' + employee.getName()
                        + ' ' + employee.getPatronymic() + ' ' + " id - " + employee.getId());
            }
        }

        int salaryMax = 0;
        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            if (employee.getSalary() > salaryMax) {
                salaryMax = employee.getSalary();
            }
        }
        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            if (salaryMax == employee.getSalary()) {
                System.out.println("Максимальная зарплата - " + ' ' + salaryMax + " у сотрудника : " + employee.getSurname() + ' ' + employee.getName()
                        + ' ' + employee.getPatronymic() + ' ' + " id - " + employee.getId());
            }
        }
        int salaryMidl;
        salaryMidl = sumSalary / employees.length;
        System.out.println("Средняя заработная плата составляет - " + ' ' + salaryMidl);

        for (i = 0; i < 10; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getSurname() + ' ' + employee.getName() + ' ' + employee.getPatronymic());
        }

        System.out.println(employees[0].equals(employees[1]));
        System.out.println(employees[0].hashCode() == employees[1].hashCode());

    }
}