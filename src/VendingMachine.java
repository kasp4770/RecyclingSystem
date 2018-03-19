import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    //create an object of Singleton
    private static VendingMachine instance = new VendingMachine();
    private static ArrayList<Item> pantlist;
    private static double countMonays = 0.0;

    //Constructor is private so it can not be intantiated
    private VendingMachine(){
        pantlist = new ArrayList<>();
    }

    public static VendingMachine getInstance(){
        return instance;
    }

    public ArrayList<Item> getPantlist(){
        return pantlist;
    }

    public void add(Item item){
        pantlist.add(item);
        countMonays = countMonays + item.getPrice();

    }

    public double getCountMonays(){
        return countMonays;
    }

    public void showMessage(){
        System.out.println("This is a vendingmachine. Insert your cans or bottles, and retrive monays for it.");
    }

}
