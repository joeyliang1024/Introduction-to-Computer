package stu_108201017;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ASCII extends Application {
    public static void main(String[] args) throws IOException{
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException{
        //textfield
        TextField textField1 = new TextField();
        textField1.setLayoutX(56);
        textField1.setLayoutY(0);
        TextField textField2 = new TextField();
        textField2.setLayoutX(56);
        textField2.setLayoutY(56);
        //text
        Text text1 = new Text();
        text1.setText("輸入：");
        text1.setLayoutX(10);
        text1.setLayoutY(18);
        Text text2 = new Text();
        text2.setText("輸出：");
        text2.setLayoutX(10);
        text2.setLayoutY(75);
        Text text3 = new Text();
        text3.setText("");
        text3.setLayoutX(10);
        text3.setLayoutY(175);
        //button
        Button btn1 = new Button();
        btn1.setText("新建");
        btn1.setLayoutX(0);
        btn1.setLayoutY(100);
        btn1.setOnAction(new EventHandler<ActionEvent>()  {
            @Override
            public void handle(ActionEvent event) {
                File filename = new File("108201017.txt");
                try {
                    if(filename.exists()){
                        text3.setText("新建失敗");
                    }
                    else{
                        filename.createNewFile();
                        text3.setText("已新建");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        Button btn2 = new Button();
        btn2.setText("存擋");
        btn2.setLayoutX(50);
        btn2.setLayoutY(100);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                File filename = new File("108201017.txt");
                try {
                    if(!filename.exists()){
                        text3.setText("存檔失敗");
                    }
                    else{
                        FileWriter fw = new FileWriter(filename.getAbsoluteFile());
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(textField2.getText());
                        bw.close();
                        text3.setText("已存檔");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        Button btn3 = new Button();
        btn3.setText("編碼");
        btn3.setLayoutX(100);
        btn3.setLayoutY(100);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String s = textField1.getText();
                String output = "";
                for(int i=0;i<s.length();i++){
                    int asciiValue = s.charAt(i);
                    output = output + Integer.toHexString(asciiValue);
                }
                if(s.equals("")){
                    text3.setText("編碼失敗");
                }
                else{
                    textField2.setText(output);
                    text3.setText("已編碼");
                }
            }
        });
        Button btn5 = new Button();
        btn5.setText("複製");
        btn5.setLayoutX(200);
        btn5.setLayoutY(100);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setSysClipboardText(textField2.getText());
                text3.setText("已複製");
                if(textField2.getText().equals("")){
                    text3.setText("複製失敗");
                }
            }
        });
        Button btn6 = new Button();
        btn6.setText("清空");
        btn6.setLayoutX(250);
        btn6.setLayoutY(100);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField1.setText("");
                textField2.setText("");
                text3.setText("已清空");
            }
        });
        //display
        Pane root = new Pane();
        root.getChildren().addAll(btn1,btn2,btn3,btn5,btn6);
        root.getChildren().addAll(textField1,textField2,text1,text2,text3);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
    public static void setSysClipboardText(String writeMe) {
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable tText = new StringSelection(writeMe);
        clip.setContents(tText, null);
    }

}
