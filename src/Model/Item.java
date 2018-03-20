package Model;

import Database.DB_Statements;

public class Item {

    //Datafield
    private Types type;
    private DB_Statements statements = new DB_Statements();

    //Constructor
    public Item(Types type) {
        this.type = type;
        VendingMachine.getInstance().add(this);
    }

    //Returns the type of pant, A, B or C from the enum Model.Types class
    public char getType() {
        return type.getType();
    }

    //Returns the value of the pant type from database
    public double getPrice() {
        return statements.retrievePrice(this.getType());
    }

    //Return a description of the item object
    @Override
    public String toString() {
        return "Pant: " +
                "type= " + type +
                ", price= " + getPrice() +
                "\n";
    }
}
