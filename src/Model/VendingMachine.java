package Model;

import java.util.ArrayList;
import java.util.Date;

public class VendingMachine {

    //create an object of Singleton
    private static VendingMachine instance = new VendingMachine();
    //other data
    private static ArrayList<Item> pantlist;
    private Date date;
    private static double countMoney = 0.0;
    private static int countItems = 0;

    //Constructor is private so it can not be intantiated
    private VendingMachine(){
        pantlist = new ArrayList<>();
    }

    //gets the only object available
    public static VendingMachine getInstance(){
        return instance;
    }

    //iterates the arraylist and prints toString() of the objects within the list
    public ArrayList<Item> getPantlist(){
        return pantlist;
    }

    //add pant item to arraylist pantlist
    public void add(Item item){
        pantlist.add(item);
        countMoney = countMoney + item.getPrice();
        countItems++;
    }

    //Clears the pantlist and counts of money and inserted bottles and cans
    public void clear(){
        pantlist.clear();
        countMoney = 0.0;
        countItems = 0;
    }

    public double getCountMoney(){
        return countMoney;
    }

    public int getCountItems(){
        return countItems;
    }

    //Constructs a receipt with information from the pantlist
    public String printReceipt(){
        date = new Date();
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
        /*System.out.println("\n-- Your reciept --\nDate: " + date.toString() + "\nCans'n'Bottles: " + countItems +
                "\nExchange to monays: " + countMonays);
        System.out.println("Pant A: " + countA + "\nPant B: " + countB + "\nPant C: " + countC);*/

        return "-- Your receipt -- \nDate: " + date.toString() + "\nCans'n'Bottles: " + String.valueOf(countItems) +
                "\nMoney to exchange: " + String.valueOf(countMoney) +" DDK" + "\nPant A: " + String.valueOf(countA) +
                "\nPant B: " + String.valueOf(countB) + "\nPant C: " + String.valueOf(countC);
    }

    //A welcome message from the vendingmachine
    public String showMessage(){
        return "This is a vendingmachine. Insert your cans or bottles, get a reciept and exchange it for money.";
    }

}
