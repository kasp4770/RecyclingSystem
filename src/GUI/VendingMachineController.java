package GUI;

import Database.DB_Statements;
import Model.Item;
import Model.Types;
import Model.VendingMachine;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class VendingMachineController extends Application{

    @FXML
    AnchorPane MainScreen;
    @FXML
    Label lblReciept;
    @FXML
    Label lblCountMonays;
    @FXML
    Button btnPantA1, btnPantA2, btnPantB, btnPantC, btnPrintReceipt;
    DB_Statements statements = new DB_Statements();
    VendingMachine object = VendingMachine.getInstance();


    public void start(Stage stage)throws Exception{

        //lblReciept.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
        //lblCountMonays.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
        Parent root = FXMLLoader.load(getClass().getResource("VendingMachine.fxml"));
        Scene scene = new Scene(root, 600, 335);
        stage.setTitle("Vending Machine 1.0");
        stage.setScene(scene);
        stage.show();

    }
    public void btnCode(ActionEvent event){

        if(event.getSource()==btnPantA1){
            Item item = new Item(Types.A);
            lblCountMonays.setText(String.valueOf(object.getCountMonays()));
        }
        else if (event.getSource()==btnPantA2){
        }
        else if (event.getSource()==btnPantB){
        }
        else if (event.getSource()==btnPantC){
        }
        else if (event.getSource()==btnPrintReceipt){
            lblReciept.isWrapText();
            //lblReciept.(object.printReceipt());
        }
    }

    public static void main(String[] args) { launch(args);
    }
}
