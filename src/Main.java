import java.util.ArrayList;

public class Main {



//1.c
    public static void main(String[] args) {

    Customer customer1 = new Customer("Ahmad","Tutor","ahmadtutor");
    Customer customer2 = new Customer("Madiha","Khan","Madi1");
    Customer customer3 = new Customer("Dan","Jensen","Dan1");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);


    }

    //1.d
    public static void printCustomers(ArrayList<Customer> customers){

        for(Customer c: customers){
                  System.out.println(c);
        }
    }

}