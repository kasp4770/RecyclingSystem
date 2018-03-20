import Database.DB_Statements;

public class Item {

    private Types type;
    private double price;
    protected DB_Statements statements = new DB_Statements();

    public Item(Types type) {
        this.type = type;
        VendingMachine.getInstance().add(this);
    }

    public char getType() {
        return type.getType();
    }

    public double getPrice() {
        return statements.retrievePrice(this.getType());
    }

    @Override
    public String toString() {
        return "Pant: " +
                "type= " + type +
                ", price= " + getPrice() +
                "\n";
    }
}
