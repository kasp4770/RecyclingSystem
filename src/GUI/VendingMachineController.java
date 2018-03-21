package GUI;

import Database.DB_Statements;
import Model.Item;
import Model.Types;
import Model.VendingMachine;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import java.io.IOException;

public class VendingMachineController extends AnchorPane{

    @FXML
    AnchorPane MainScreen;
    @FXML
    private static TextArea txtReciept;
    @FXML
    private static TextField txtCountMonays;
    @FXML
    private Button btnPantA1, btnPantA2, btnPantB, btnPantC, btnPrintReceipt;

    public VendingMachineController(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VendingMachine.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try{
            fxmlLoader.load();
        }catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }

    public String getText() {
        return textProperty().get();
    }

    public String getTextArea(){
        return textAreaProperty().get();
    }

    public void setText(String value, Node node) {
        if(node == txtCountMonays){
        textProperty().set(value);
        }else if(node == txtReciept){
            textAreaProperty().setValue(value);
        }
    }

    public StringProperty textProperty() {
        return txtCountMonays.textProperty();
    }
    public StringProperty textAreaProperty(){
        return  txtReciept.textProperty();
    }

    DB_Statements statements = new DB_Statements();
    VendingMachine object = VendingMachine.getInstance();

    @FXML
    public void btnCode(ActionEvent event){

        if(event.getSource()==btnPantA1){
            System.out.println("PantA button works!");
            //txtCountMonays.setEditable(false);
            //Item item = new Item(Types.A);
            //txtCountMonays.setText(String.valueOf(object.getCountMonays()));
        }
        else if (event.getSource()==btnPantA2){
            System.out.println("PantA2 button works!");
        }
        else if (event.getSource()==btnPantB){
            System.out.println("PantB button works!");
        }
        else if (event.getSource()==btnPantC){
            System.out.println("PantC button works!");
        }
        else if (event.getSource()==btnPrintReceipt){
            System.out.println("Print receipt button works!");
            //txtReciept.setEditable(false);
            //txtReciept.isWrapText();
            //lblReciept.(object.printReceipt());
        }
    }
}
