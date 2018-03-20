package Model;

import Database.*;

import java.sql.Connection;

public class VendingMachineTest {
    public static void main(String[] args) {

        //Inititalize database
        DB_Statements statements = new DB_Statements();

        //Get Singleton object
        VendingMachine object = VendingMachine.getInstance();

        //Add items to the list of the Model.VendingMachine object (automatic within the Model.Item constructor).
        Item item1 = new Item(Types.A);
        Item item2 = new Item(Types.B);
        Item item3 = new Item(Types.C);

        //test of Model.Item toString() method.
        System.out.println(object.getPantlist());

        //test of static datafields
        System.out.println("\n" + object.getCountItems());
        System.out.println(object.getCountMonays() + "\n");

        //Reciept
        object.printReceipt();

        //Test that the printReciept() method cleared the pantlist and reset the static datafields.
        System.out.println("\n-- TEST THAT IT WORKS: ... --");

        System.out.println("\n" + object.getPantlist());
        System.out.println(object.getCountMonays());
        System.out.println(object.getCountItems());
        //or
        object.printReceipt();
        DB_Statements.con = null;

    }
}
