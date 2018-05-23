package payroll;
import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our payroll program");
        String response;
        Employee ee = new Employee();
        System.out.println("Enter employee first name: ");
        ee.firstName = in.nextLine();
        System.out.println("Enter employee last name:");
        ee.lastName = in.nextLine();
        System.out.println("Is this a hourly wage employee? (y/n)");
        response = in.nextLine();
        if (response.equalsIgnoreCase("y")) {
            ee.employeeType = 'h';
            System.out.println("Enter hourly wage: ");
            ee.hourlyWage = in.nextDouble();
            System.out.println("How many hours did this employee work: ");
            ee.hoursWorked = in.nextDouble();
        } else {
            ee.employeeType = 's';
            System.out.println("Enter yearly salary: ");
            ee.salary = in.nextDouble();
        }
        System.out.println(ee.printEmployee());
        System.out.println(ee.firstName + "'s weekly earnings: "
                + ee.calculateEarnings());
    }
    static class Employee {

        private String firstName, lastName;
        private char employeeType;
        private double hourlyWage, salary, hoursWorked = 0;

        public Employee() {
        }

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        protected double calculateEarnings() {
            double weeklyEarnings;
            if (employeeType == 'h') {
                if (hoursWorked <= 40) {
                    weeklyEarnings = hoursWorked * hourlyWage;
                } else {
                    weeklyEarnings = 40 * hourlyWage + ((hoursWorked - 40)
                            * hourlyWage * 1.5);
                }
            } else {
                weeklyEarnings = salary / 52;
            }
            return weeklyEarnings;
        }

        public String printEmployee() {
            String message;
            if (employeeType == 'h') {
                message = firstName + " " + lastName + ", " + "employee type: "
                        + employeeType + ", hourly wage: " + hourlyWage;
            } else {
                message = firstName + " " + lastName + ", " + "employee type: "
                        + employeeType + ", salary: " + salary;
            }
            return message;
        }
    }
}
