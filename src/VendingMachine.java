import java.util.ArrayList;
import java.util.Date;

public class VendingMachine {

    //create an object of Singleton
    private static VendingMachine instance = new VendingMachine();

    private static ArrayList<Item> pantlist;
    private Date date;
    private static double countMonays = 0.0;
    private static int countItems = 0;

    //Constructor is private so it can not be intantiated
    private VendingMachine(){
        pantlist = new ArrayList<>();
        date = new Date();
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
        countItems++;
    }
    public void clear(){
        pantlist.clear();
        countMonays = 0.0;
        countItems = 0;
    }

    public double getCountMonays(){
        return countMonays;
    }

    public int getCountItems(){
        return countItems;
    }

    public void printReciept(){
        System.out.println("Date: " + date.toString() + "\nCans'n'Bottles: " + countItems + "\nMonays: " + countMonays);
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for(int i = 0; i < pantlist.size(); i++){
            if(pantlist.get(i).getType() == 'A'){
                countA++;
            }else if(pantlist.get(i).getType() == 'B'){
                countB++;
            }else if(pantlist.get(i).getType() == 'C'){
                countC++;
            }
        }
        System.out.println("Pant A: " + countA + "\nPant B: " + countB + "\nPant C: " + countC);
        clear();
    }

    public void showMessage(){
        System.out.println("This is a vendingmachine. Insert your cans or bottles, and retrieve monays for it.");
    }

}
