package GUI;

import Model.Item;
import Model.Types;
import Model.VendingMachine;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class VendingMachineController extends Application{

    @FXML
    AnchorPane MainScreen;
    @FXML
    TextArea txtReciept;
    @FXML
    TextField txtCountMonays;
    @FXML
    Button btnPantA1, btnPantA2, btnPantB, btnPantC, btnPrintReceipt;
    VendingMachine object = VendingMachine.getInstance();


    public void start(Stage primaryStage)throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("VendingMachine.fxml"));
        Scene scene = new Scene(root, 600, 335);
        primaryStage.setTitle("Vending Machine 1.0");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void attachCode(){
        btnPantA1.setOnAction(event -> btnCode(event));
        btnPantA2.setOnAction(event -> btnCode(event));
        btnPantB.setOnAction(event -> btnCode(event));
        btnPantC.setOnAction(event -> btnCode(event));
        btnPrintReceipt.setOnAction(event -> btnCode(event));
    }
    public void btnCode(ActionEvent event){

        if(event.getSource()==btnPantA1){
            Item item = new Item(Types.A);
            txtCountMonays.setText(String.valueOf(object.getCountMonays()));
        }
        else if (event.getSource()==btnPantA2){
        }
        else if (event.getSource()==btnPantB){
        }
        else if (event.getSource()==btnPantC){
        }
        else if (event.getSource()==btnPrintReceipt){
        }
    }

    public static void main(String[] args) { launch(args);
    }
}
