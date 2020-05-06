package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Glow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root, 720,200);
        primaryStage.setTitle("Hello World");
        scene.setFill(Color.BLACK);
        Glow glow = new Glow();

        //PRVA RUNA

        Line l1 = new Line();
        l1.setStartX(50);
        l1.setStartY(50);
        l1.setEndX(100);
        l1.setEndY(50);
        l1.setStroke(Color.VIOLET);
        l1.setStrokeWidth(3);
        glow.setLevel(10);
        l1.setEffect(glow);
        root.getChildren().add(l1);

        Line l2 = new Line();
        l2.setStartX(50);
        l2.setStartY(50);
        l2.setEndX(100);
        l2.setEndY(150);
        l2.setStroke(Color.VIOLET);
        l2.setStrokeWidth(3);
        glow.setLevel(10);
        l2.setEffect(glow);
        root.getChildren().add(l2);

        Line l3 = new Line();
        l3.setStartX(50);
        l3.setStartY(150);
        l3.setEndX(100);
        l3.setEndY(150);
        l3.setStroke(Color.VIOLET);
        l3.setStrokeWidth(3);
        glow.setLevel(10);
        l3.setEffect(glow);
        root.getChildren().add(l3);

        Line l4 = new Line();
        l4.setStartX(50);
        l4.setStartY(150);
        l4.setEndX(65);
        l4.setEndY(125);
        l4.setStroke(Color.VIOLET);
        l4.setStrokeWidth(3);
        glow.setLevel(10);
        l4.setEffect(glow);
        root.getChildren().add(l4);

        Line l5 = new Line();
        l5.setStartX(100);
        l5.setStartY(50);
        l5.setEndX(90);
        l5.setEndY(75);
        l5.setStroke(Color.VIOLET);
        l5.setStrokeWidth(3);
        glow.setLevel(10);
        l5.setEffect(glow);
        root.getChildren().add(l5);

        //DRUHA RUNA

        Line l6 = new Line();
        l6.setStartX(150);
        l6.setStartY(50);
        l6.setEndX(250);
        l6.setEndY(50);
        l6.setStroke(Color.YELLOW);
        l6.setStrokeWidth(3);
        glow.setLevel(10);
        l6.setEffect(glow);
        root.getChildren().add(l6);

        Line l7 = new Line();
        l7.setStartX(250);
        l7.setStartY(50);
        l7.setEndX(230);
        l7.setEndY(70);
        l7.setStroke(Color.YELLOW);
        l7.setStrokeWidth(3);
        glow.setLevel(10);
        l7.setEffect(glow);
        root.getChildren().add(l7);

        Line l8 = new Line();
        l8.setStartX(150);
        l8.setStartY(50);
        l8.setEndX(200);
        l8.setEndY(115);
        l8.setStroke(Color.YELLOW);
        l8.setStrokeWidth(3);
        glow.setLevel(10);
        l8.setEffect(glow);
        root.getChildren().add(l8);

        Line l9 = new Line();
        l9.setStartX(200);
        l9.setStartY(115);
        l9.setEndX(212.5);
        l9.setEndY(100);
        l9.setStroke(Color.YELLOW);
        l9.setStrokeWidth(3);
        glow.setLevel(10);
        l9.setEffect(glow);
        root.getChildren().add(l9);

        Line l10 = new Line();
        l10.setStartX(230);
        l10.setStartY(70);
        l10.setEndX(210);
        l10.setEndY(70);
        l10.setStroke(Color.YELLOW);
        l10.setStrokeWidth(3);
        glow.setLevel(10);
        l10.setEffect(glow);
        root.getChildren().add(l10);

        //TRETIA RUNA

        Line l11 = new Line();
        l11.setStartX(350);
        l11.setStartY(50);
        l11.setEndX(300);
        l11.setEndY(130);
        l11.setStroke(Color.RED);
        l11.setStrokeWidth(3);
        glow.setLevel(10);
        l11.setEffect(glow);
        root.getChildren().add(l11);

        Line l12 = new Line();
        l12.setStartX(300);
        l12.setStartY(130);
        l12.setEndX(400);
        l12.setEndY(130);
        l12.setStroke(Color.RED);
        l12.setStrokeWidth(3);
        glow.setLevel(10);
        l12.setEffect(glow);
        root.getChildren().add(l12);

        Line l13 = new Line();
        l13.setStartX(400);
        l13.setStartY(130);
        l13.setEndX(365);
        l13.setEndY(70);
        l13.setStroke(Color.RED);
        l13.setStrokeWidth(3);
        glow.setLevel(10);
        l13.setEffect(glow);
        root.getChildren().add(l13);

        //STVRTA RUNA

        Line l14 = new Line();
        l14.setStartX(450);
        l14.setStartY(50);
        l14.setEndX(550);
        l14.setEndY(50);
        l14.setStroke(Color.LIGHTGREEN);
        l14.setStrokeWidth(3);
        glow.setLevel(10);
        l14.setEffect(glow);
        root.getChildren().add(l14);

        Line l15 = new Line();
        l15.setStartX(450);
        l15.setStartY(50);
        l15.setEndX(500);
        l15.setEndY(130);
        l15.setStroke(Color.LIGHTGREEN);
        l15.setStrokeWidth(3);
        glow.setLevel(10);
        l15.setEffect(glow);
        root.getChildren().add(l15);

        Line l16 = new Line();
        l16.setStartX(500);
        l16.setStartY(130);
        l16.setEndX(540);
        l16.setEndY(70);
        l16.setStroke(Color.LIGHTGREEN);
        l16.setStrokeWidth(3);
        glow.setLevel(10);
        l16.setEffect(glow);
        root.getChildren().add(l16);

        //PIATA RUNA

        Line l17 = new Line();
        l17.setStartX(650);
        l17.setStartY(50);
        l17.setEndX(630);
        l17.setEndY(80);
        l17.setStroke(Color.LIGHTBLUE);
        l17.setStrokeWidth(3);
        glow.setLevel(10);
        l17.setEffect(glow);
        root.getChildren().add(l17);

        Line l18 = new Line();
        l18.setStartX(650);
        l18.setStartY(50);
        l18.setEndX(700);
        l18.setEndY(130);
        l18.setStroke(Color.LIGHTBLUE);
        l18.setStrokeWidth(3);
        glow.setLevel(10);
        l18.setEffect(glow);
        root.getChildren().add(l18);

        Line l19 = new Line();
        l19.setStartX(700);
        l19.setStartY(130);
        l19.setEndX(600);
        l19.setEndY(130);
        l19.setStroke(Color.LIGHTBLUE);
        l19.setStrokeWidth(3);
        glow.setLevel(10);
        l19.setEffect(glow);
        root.getChildren().add(l19);

        Line l20 = new Line();
        l20.setStartX(600);
        l20.setStartY(130);
        l20.setEndX(620);
        l20.setEndY(100);
        l20.setStroke(Color.LIGHTBLUE);
        l20.setStrokeWidth(3);
        glow.setLevel(10);
        l20.setEffect(glow);
        root.getChildren().add(l20);

        Line l21 = new Line();
        l21.setStartX(620);
        l21.setStartY(100);
        l21.setEndX(650);
        l21.setEndY(100);
        l21.setStroke(Color.LIGHTBLUE);
        l21.setStrokeWidth(3);
        glow.setLevel(10);
        l21.setEffect(glow);
        root.getChildren().add(l21);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
