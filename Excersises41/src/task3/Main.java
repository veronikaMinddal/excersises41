package Task3;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        Customer cus1 = new Customer("Johnny", "Five", "J5nny", 24);
        Customer cus2 = new Customer("John", "Johnson", "j-man", 43);
        Customer cus3 = new Customer("Camilla", "Dergman", "CamiD", 33);
        Customer cus4 = new Customer("Veronika", "Mindal", "Veronikat", 22);
        Customer cus5 = new Customer("Ole", "Ædedolk", "Ollebolle", 146);
        Customer cus6 = new Customer("Frø", "Dreng", "Drengefrø", 3);

        public static ArrayList<Customer> customers = new ArrayList<>();

        customers.add(cus1);
        customers.add(cus2);
        customers.add(cus3);
        customers.add(cus4);
        customers.add(cus5);
        customers.add(cus6);

        printCustomer();
    }
    public static void printCustomer()
    {
        for (int i = 0; i < customers.length; i++ ) {
            System.out.println(custumers[i]);
        }
    }





}