public class VendingMachineTest {
    public static void main(String[] args) {

        VendingMachine object = VendingMachine.getInstance();

        Item item1 = new Item(Types.A, 1.0);
        Item item2 = new Item(Types.B, 1.5);
        Item item3 = new Item(Types.C, 3.0);

        object.add(item1);
        object.add(item2);
        object.add(item3);

        System.out.println(object.getPantlist());

        System.out.println("\n" + object.getCountMonays());

    }
}
