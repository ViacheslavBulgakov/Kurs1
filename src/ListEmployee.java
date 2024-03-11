public class ListEmployee {

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static String minSalary(Employee[] employees) {
        int min = 1000;
        String employeeSalaryMin = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getSalary() < min) {
                    min = employee.getSalary();
                    employeeSalaryMin = employee.getSurname();
                }
            }
        }
        return employeeSalaryMin;
    }


    public static String maxSalary(Employee[] employees) {
        int max = 0;
        String employeeSalaryMax = null;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                if (employee.getSalary() > max) {
                    max = employee.getSalary();
                    employeeSalaryMax = employee.getSurname();
                }
            }
        }
        return employeeSalaryMax;
    }

    public static int midlSalary(Employee[] employees) {
        int count = 0;
        int sum = 0;
        int midl = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                sum = sum + employee.getSalary();
                count++;
            }
        }
        if (count > 0) {
             midl =  sum / count;
        } else {
            System.out.println("Нет ни одного сотрудника");
        }
        return midl;
    }


       public static void printAllName(Employee[] employees) {
           for (int i = 0; i < employees.length; i++) {
               Employee employee = employees[i];
               if (employee != null) {
                   System.out.println(employee.getName() + ' ' + employee.getSurname() + ' ' + employee.getPatronymic());
               }
           }
       }
}
