/**
Assignment 5
Student numnber : 108201017
Course : 2022-CE1002
 */
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class A5_108201017_2 extends Application {
    public static void main(String[] args) throws IOException{
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        //標題
        primaryStage.setTitle("Hello World");
        //是非題 Check Box 
        CheckBox checkBox = new CheckBox();
        checkBox.setText("一代一代一代一代");
        checkBox.setLayoutX(500);
        checkBox.setLayoutY(300);
        //選擇題 Radio Button
        RadioButton rb1 = new RadioButton("可以");
        rb1.setLayoutX(500);
        rb1.setLayoutY(200);
        RadioButton rb2 = new RadioButton("不行");
        rb2.setLayoutX(550);
        rb2.setLayoutY(200);
        //輸入文字 Text Field
        TextField textField = new TextField ();
        textField.setLayoutX(500);
        textField.setLayoutY(100);
        //送出按鈕
        Button btn1 = new Button();
        btn1.setText("press1");
        btn1.setLayoutX(100);
        btn1.setLayoutY(100);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String input = textField.getText();
                System.out.println(input);
            }
        });
        Button btn2 = new Button();
        btn2.setText("press2");
        btn2.setLayoutX(100);
        btn2.setLayoutY(200);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(rb1.isSelected()){
                    System.out.println(rb1.getText());
                }
                if(rb2.isSelected()){
                    System.out.println(rb2.getText());
                }
            }
        });
        Button btn3 = new Button();
        btn3.setText("press3");
        btn3.setLayoutX(100);
        btn3.setLayoutY(300);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {   
                System.out.println(checkBox.isSelected());   
            }
        });
        //display
        Pane root = new Pane(); 
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(rb1);
        root.getChildren().add(rb2);
        root.getChildren().add(checkBox);
        root.getChildren().add(textField);
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
    }
}
