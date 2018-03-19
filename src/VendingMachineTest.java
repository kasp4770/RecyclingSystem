public class VendingMachineTest {
    public static void main(String[] args) {

        //Get Singleton object
        VendingMachine object = VendingMachine.getInstance();

        //Add items to the list of the VendingMachine object.
        Item item1 = new Item(Types.A, 1.0);
        Item item2 = new Item(Types.B, 1.5);
        Item item3 = new Item(Types.C, 3.0);
        object.add(item1);
        object.add(item2);
        object.add(item3);

        //test of Item toString() method.
        System.out.println(object.getPantlist());

        //test of static datafields
        System.out.println("\n" + object.getCountItems());
        System.out.println(object.getCountMonays() + "\n");

        //Reciept
        object.printReciept();

        //Test that the printReciept() method cleared the pantlist and reset the static datafields.
        System.out.println("\n" + object.getPantlist());
        System.out.println(object.getCountMonays());
        System.out.println(object.getCountItems());
        //or
        object.printReciept();

    }
}
