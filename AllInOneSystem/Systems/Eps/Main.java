package AllInOneSystem.Systems.Eps;

import java.util.Scanner;

public class Main {

    public static String getSystemName() {
        return "Employee Payroll System";
    }

    public static String getSystemAuthor() {
        return "fancode343";
    }
    public static void main() {
        Scanner butang = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = butang.nextInt();

        Employee[] employee = new Employee[n];
        FullTimeEmpoyee[] FTE = new FullTimeEmpoyee[n];
        PartTimeEmployee[] PTE = new PartTimeEmployee[n];

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Type (1-Full Time, 2-Part Time): ");
            int type = butang.nextInt();

            System.out.print("Name: ");
            butang.nextLine();
            String name = butang.nextLine();

            System.out.print("Base Salary: ");
            double baseSalary = butang.nextDouble();

            int overtimeHours = 0;
            String performance = "";

            int hoursWorked = 0;
            double hoursRate = 0;

            switch (type) {
                case 1:
                    System.out.print("Overtime Huors: ");
                    overtimeHours = butang.nextInt();
                    System.out.print("Performance (Excellent/Good/Average/Poor): ");
                    butang.nextLine();
                    performance = butang.nextLine();
                    employee[i] = new Employee(name, baseSalary);
                    FTE[i] = new FullTimeEmpoyee(name, baseSalary, overtimeHours, performance);
                    break;
                case 2:
                    System.out.print("Hours Worked: ");
                    hoursWorked = butang.nextInt();
                    System.out.print("Hourly Rate: ");
                    hoursRate = butang.nextDouble();
                    employee[i] = new Employee(name, baseSalary);
                    PTE[i] = new PartTimeEmployee(name, baseSalary, hoursWorked, hoursRate);
                    break;
            }
        }
        System.out.println("--PAYROLL SUMMARY--");
        for (int i = 0; i < n; i++) {
            if (PTE[i] != null) {
                System.out.println(employee[i].getName() + " --> " + PTE[i].computeSalary());
            } else if (FTE[i] != null) {
                System.out.println(employee[i].getName() + " --> " + FTE[i].computeSalary());
            }
        }
        butang.close();
    }

}
