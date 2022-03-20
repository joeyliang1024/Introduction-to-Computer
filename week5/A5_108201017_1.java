/**
Assignment 5
Student numnber : 108201017
Course : 2022-CE1002
 */
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class A5_108201017_1 extends Application {
    public static void main(String[] args) throws IOException{
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        //標題
        primaryStage.setTitle("Hello World");
        //creating the image object
        Image image = new Image(getClass().getResourceAsStream("/tone.jpeg"));
        ImageView imageView = new ImageView(image);
        imageView.setX(20); 
        imageView.setY(150);
        imageView.setFitHeight(200); 
        imageView.setFitWidth(400);
        //是非題 Check Box 
        CheckBox checkBox = new CheckBox();
        checkBox.setText("一代一代一代一代");
        checkBox.setLayoutX(500);
        checkBox.setLayoutY(200);
        //選擇題 Radio Button
        RadioButton rb1 = new RadioButton("可以");
        rb1.setLayoutX(500);
        rb1.setLayoutY(300);
        RadioButton rb2 = new RadioButton("不行");
        rb2.setLayoutX(550);
        rb2.setLayoutY(300);
        //文字 Label
        Label label1 = new Label("Asia God Tone");
        label1.setLayoutX(500);
        label1.setLayoutY(150);
        Label label2 = new Label("他端的起來嗎");
        label2.setLayoutX(500);
        label2.setLayoutY(250);
        //送出按鈕
        Button btn = new Button();
        btn.setText("Send");
        btn.setLayoutX(370);
        btn.setLayoutY(400);
        //display
        Pane root = new Pane(); 
        root.getChildren().add(imageView);
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(checkBox);
        root.getChildren().add(rb1);
        root.getChildren().add(rb2);
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
    }
}