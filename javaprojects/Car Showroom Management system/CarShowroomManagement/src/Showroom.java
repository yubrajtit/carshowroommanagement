import java.util.Scanner;

public class Showroom implements utility {

    String showroom_name;

    String showroom_address;

    int total_employees;

    int total_cars_in_stock = 0;

    String manager_name;


    @Override
    public void get_details() {
        System.out.println("showroom name: "+showroom_name );
        System.out.println("Showroom address: "+showroom_address);
        System.out.println("Total employees: "+total_employees);
        System.out.println("Total car in stock: "+total_cars_in_stock);
        System.out.println("Manager name: "+manager_name);

    }

    @Override
    public void set_details() {
        Scanner input = new  Scanner(System.in);
        System.out.println("=====================*** ENTER SHOWROOM DETAILS ***========================= ");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = input.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showroom_address = input.nextLine();
        System.out.print("TOTAL EMPLOYEES: ");
        total_employees = input.nextInt();
        System.out.print("TOTAL CAR IN STOCK: ");
        total_cars_in_stock = input.nextInt();
        System.out.print("MANAGER NAME: ");
        manager_name = input.nextLine();
    }
}
