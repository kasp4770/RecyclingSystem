package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) { launch(args);
    }

    public void start(Stage stage)throws Exception{

        VendingMachineController vendingMachineController = new VendingMachineController();
        stage.setScene(new Scene(vendingMachineController));
        stage.setTitle("Vending Machine 1.0");
        stage.setWidth(600);
        stage.setHeight(385);
        stage.show();
    }
}
