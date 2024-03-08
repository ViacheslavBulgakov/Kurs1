import java.util.Objects;

public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private String department;
    private int salary;
    private final int id;
    static int count;

    public static void idCount () {
        count++;
    }


    public Employee(String surname, String name, String patronymic, String department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        Employee.idCount();
        this.id = count;
    }

    public String getSurname() {return surname; }
    public String getName(){
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public int getId() {return id;}

    public String getDepartment() {
        return department;
    }
    public void setDepartment (String department){
        this.department = department;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary (int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ' ' + patronymic + ' ' + department + ' ' + salary + ' ' + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, patronymic);
    }
}
