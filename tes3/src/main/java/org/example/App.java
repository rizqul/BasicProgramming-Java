package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
//        Text txtName = new Text("Name : ");
//        Text txtDate = new Text("Date : ");
//        Text txtDash1 = new Text("-");
//        Text txtDash2 = new Text("-");
//
//       TextField tfName = new TextField();
//       TextField tfDate = new TextField();
//       TextField tfMonth = new TextField();
//       TextField tfYear = new TextField();
//
//       tfName.setMaxWidth(152);
//       tfDate.setMaxWidth(40);
//       tfMonth.setMaxWidth(40);
//       tfYear.setMaxWidth(70);
//
//        HBox name = new HBox(0);
//        name.getChildren().addAll(txtName, tfName);
//        name.setAlignment(Pos.CENTER);
//
//        HBox date = new HBox(0);
//        date.getChildren().addAll(txtDate, tfDate, txtDash1, tfMonth, txtDash2, tfYear);
//        date.setAlignment(Pos.CENTER);
//        Button btnSubmit = new Button("Submit");
//        Button btnBack = new Button("back");
//
//        var req = new Object(){
//            Label nama = new Label();
//        };
//
//        VBox box = new VBox(5);
//        box.getChildren().addAll(name , date, btnSubmit);
//        box.setAlignment(Pos.CENTER);
//        StackPane pane1 = new StackPane();
//        pane1.setAlignment(Pos.BASELINE_CENTER);
//        pane1.getChildren().addAll(req.nama, btnBack);
//        Scene scene2 = new Scene(pane1, 480,360);
//        Scene scene = new Scene(box, 480, 360);
//
//        btnSubmit.setOnAction(e -> {
//            int hasil = Integer.parseInt(tfName.getText())*2;
//            req.nama.setText("hasil" + hasil);
//            stage.setScene(scene2);
//            btnBack.setOnAction(b -> {
//                stage.setScene(scene);
//            });
//        });
//
//
//
//
//        stage.setScene(scene);
//        stage.show();


        Text tFFunction = new Text("Function");
        TextField tfFunction = new TextField();
        tfFunction.setMinWidth(100);


    }

    public static void main(String[] args) {
        launch();
    }

}