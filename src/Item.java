import Database.DB_Statements;

public class Item {

    private Types type;
    private double price;
    protected DB_Statements statements;

    public Item(Types type) {
        this.type = type;
    }

    public char getType() {
        return type.getType();
    }

    public void setType(Types type) {
        this.type = type;
    }

    public double getPrice() {
        statements.retrievePrice(this.getType());

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type=" + type +
                ", price=" + price +
                '}';
    }
}
