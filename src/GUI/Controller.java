package GUI;

import Database.DB_Statements;
import Model.Item;
import Model.Types;
import Model.VendingMachine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private TextArea txtReceiptOutput;
    @FXML
    private TextField txtCountOfMoneyOutput;
    @FXML
    private Button btnPantA1, btnPantA2, btnPantB, btnPantC, btnPrintReceipt;

    DB_Statements statements = new DB_Statements();
    VendingMachine object = VendingMachine.getInstance();

    @FXML
    public void btnCode(ActionEvent event){

        if(event.getSource()==btnPantA1){
            //System.out.println("PantA button works!");
            Item item = new Item(Types.A);

            String svartekst = String.valueOf(object.getCountMoney());
            txtCountOfMoneyOutput.setText(svartekst);

            //Output in console
            System.out.println("Pant A can added.    \t\tTotal inserts: " + object.getCountItems() + ".\t\tTotal value (DDK): " + object.getCountMoney());

        }
        else if (event.getSource()==btnPantA2){
            //System.out.println("PantA2 button works!");
            Item item = new Item(Types.A);

            String svartekst = String.valueOf(object.getCountMoney());
            txtCountOfMoneyOutput.setText(svartekst);

            //Output in console
            System.out.println("Pant A bottle added. \t\tTotal inserts: " + object.getCountItems() + ".\t\tTotal value (DDK): " + object.getCountMoney());
        }
        else if (event.getSource()==btnPantB){
            //System.out.println("PantB button works!");
            Item item = new Item(Types.B);

            String svartekst = String.valueOf(object.getCountMoney());
            txtCountOfMoneyOutput.setText(svartekst);

            //Output in console
            System.out.println("Pant B bottle added. \t\tTotal inserts: " + object.getCountItems() + ".\t\tTotal value (DDK): " + object.getCountMoney());
        }
        else if (event.getSource()==btnPantC){
            //System.out.println("PantC button works!");
            Item iten = new Item(Types.C);

            String svartekst = String.valueOf(object.getCountMoney());
            txtCountOfMoneyOutput.setText(svartekst);

            //Output in console
            System.out.println("Pant C bottle added. \t\tTotal inserts: " + object.getCountItems() + ".\t\tTotal value (DDK): " + object.getCountMoney());
        }
        else if (event.getSource()==btnPrintReceipt){
            //System.out.println("Print receipt button works!");

            String svartekst = object.printReceipt();
            txtReceiptOutput.setText(svartekst);

            //Output in console
            System.out.println(object.printReceipt());

            object.clear();
        }
    }

}
