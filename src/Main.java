public class Main {
    public static void main(String[] args) {

        ListEmployee listEmployee = new ListEmployee();

        listEmployee.addEmployee("Ласточкин", "Валерий", "Степанович", "01", 120);
        listEmployee.addEmployee("Семплеяров", "Аркадий", "Аполлонович", "01", 140);
        listEmployee.addEmployee("Стравинский", "Александр", "Николаевич", "02", 190);
        listEmployee.addEmployee("Квасцов", "Тимофей", "Кондратьевич", "02", 205);
        listEmployee.addEmployee("Берлиоз", "Михаил", "Александрович", "03", 85);
        listEmployee.addEmployee("Римский", "Григорий", "Данилович", "03", 90);
        listEmployee.addEmployee("Босой", "Никанор", "Иванович", "04", 240);
        listEmployee.addEmployee("Варенуха", "Иван", "Савельевич", "04", 285);
        listEmployee.addEmployee("Лиходеев", "Степан", "Богданович", "05", 175);
        listEmployee.addEmployee("Покобатько", "Милица", "Андреевна", "05", 170);
        listEmployee.addEmployee("Иванов", "Иван", "Иванович", "00", 100);

        listEmployee.printAllEmployees();
        System.out.println("Ежемесячные затраты на зарплату равны - " + ' ' + listEmployee.sumSalary());
        listEmployee.minSalary(1000);
        listEmployee.maxSalary(0);
        System.out.println("Средняя заработная плата составляет - " + ' ' + listEmployee.midlSalary());
        System.out.println("Фамилия Имя Отчество всех сотрудников : ");
        listEmployee.printAllName();

    }
}