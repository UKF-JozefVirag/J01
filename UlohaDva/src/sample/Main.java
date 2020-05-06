package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);
        TextField vstup = new TextField();
        Button accept = new Button("Zobraz");
        String x = vstup.getText();
        accept.setLayoutX(200);
        Label abc = new Label(x);
        abc.setLayoutX(100);
        abc.setLayoutY(100);
        abc.setFont(Font.font("Verdana", 50));
        root.getChildren().add(abc);
        accept.setOnAction(e->{
            String temp = vstup.getText();
            int sam = 0;
            int spo = 0;
            for(int i = 0; i<temp.length(); i++){
                if(temp.charAt(i)=='a' ||temp.charAt(i)=='e' ||temp.charAt(i)=='i'
                        ||temp.charAt(i)=='o' ||temp.charAt(i)=='u' ||temp.charAt(i)=='y'){
                    sam++;
                }
                else{
                    spo++;
                }
            }
            abc.setText(vstup.getText());
            Color c = Color.rgb(sam*16, spo*24, (temp.length()%25)*10);
            scene.setFill(c);

        });
        root.getChildren().addAll(accept, vstup);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
