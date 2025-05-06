import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;

    String emp_name;

    int emp_age;

    String emp_departments;


    @Override
    public void get_details() {
        System.out.println("Employees ID: "+emp_id);
        System.out.println("Employees name: "+emp_name);
        System.out.println("Employees age: "+emp_age);
        System.out.println("Employees departments: "+emp_departments);
    }

    @Override
    public void set_details() {
        Scanner input = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("==================*** ENTER EMPLOYEES DETAILS ***=======================");
        System.out.println();
        emp_id = input.nextLine();
        System.out.println("EMPLOYEES ID: ");
        emp_name = input.nextLine();
        System.out.println("EMPLOYEES NAME: ");
        emp_age = input.nextInt();
        System.out.println("EMPLOYEES AGE: ");
        emp_departments = input.nextLine();
        System.out.println("EMPLOYEES DEPARTMENTS: ");

    }
}
