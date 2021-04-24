package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FatwaBikinComboBox extends Application {
    Button button1,button2,button3;
    Stage window;
    Scene scene1,scene2,scene3,scene4;
    public static void main(String[] args){
    launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        String bogel;
        window = primaryStage;
        VBox layout1 = new VBox(15);
        Label label1 = new Label("Game terkeren adalah ");
        button1 = new Button("Submit");

        ComboBox<String> comboBoxMenu = new ComboBox<>();
        comboBoxMenu.setPromptText("Choose game");
        comboBoxMenu.getItems().addAll(
                "GTA V",
                "Assassins Creed Unity", "Watch Dog");
        comboBoxMenu.setOnAction(comboBoxAction -> {
            System.out.println(comboBoxMenu.getValue());
        });
     //   if (bogel.equalsIgnoreCase("GTA V")) {
        //    button1.setOnAction(tombol1 -> window.setScene(scene2));
        //}
        layout1.getChildren().addAll(label1, comboBoxMenu, button1);
        layout1.setAlignment(Pos.CENTER); //Cara atur posisi 1 automatik (harus import geometry pos
        //layout1.snapPositionX(0);   //cara atur posisi 2 harus pintar koordinat
        //layout1.snapPositionY(0);
        scene1 = new Scene(layout1, 800, 600);
        // Scene 2
        VBox layout2 = new VBox(10);
        Label labelGTA = new Label("Anda Memilih GTA V");
        Label labelGTAInfo = new Label ("GTA V adalah game yang sangat berat dan mahal :v");
        layout2.getChildren().addAll(labelGTA,labelGTAInfo);
        layout2.setAlignment(Pos.BASELINE_CENTER);
        button2 = new Button("Back");
        button2.setOnAction(tombol2 -> window.setScene(scene1));
        window.setScene(scene1);
        window.show();
    }
    public static String choosedComboBox (String check){
        String menu = check;
        return menu;
    }
}









