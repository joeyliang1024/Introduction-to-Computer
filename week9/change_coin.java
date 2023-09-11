package stu_108201017;

import java.io.IOException;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class change_coin extends Application{

    public static void main(String[] args) throws IOException {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException{
        TextField textField = new TextField();
        textField.setLayoutX(65);
        textField.setLayoutY(0);
        Text text = new Text();
        text.setText("");
        text.setLayoutY(120);
        text.setLayoutX(20);
        //ComboBox
        ObservableList<String> options = FXCollections.observableArrayList("美元","台幣","日圓","歐元","人民幣");
        final ComboBox comboBox = new ComboBox(options);
        comboBox.setLayoutX(20);
        comboBox.setLayoutY(40);
        comboBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String t, String t1) {
                comboBox.setValue(String.valueOf(t1));
            }
        });
        final ComboBox comboBox2 = new ComboBox(options);
        comboBox2.setLayoutX(170);
        comboBox2.setLayoutY(40);
        comboBox2.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String t, String t1) {
                comboBox2.setValue(String.valueOf(t1));
            }
        });
        //Button
        Button button1 = new Button("<->");
        button1.setLayoutX(120);
        button1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                Object to_be_change = comboBox.getValue();
                Object change = comboBox2.getValue();
                comboBox.setValue(change);
                comboBox2.setValue(to_be_change);
            }
        });
        button1.setLayoutY(40);
        Button button2 = new Button("轉換");
        button2.setLayoutX(117);
        button2.setLayoutY(70);
        button2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(textField.getText().matches("([1-9]\\d*\\.+\\d*)|(0\\.\\d*[1-9])")){
                    Double transpose = 0.0;
                    switch (String.valueOf(comboBox.getValue())){
                        case "美元":
                            switch (String.valueOf(comboBox2.getValue())){
                                case "美元":
                                    transpose = Double.valueOf(textField.getText());
                                    break;
                                case "台幣":
                                    transpose = Double.valueOf(textField.getText())*29.42;
                                    break;
                                case"日圓":
                                    transpose = Double.valueOf(textField.getText())*124.819687;
                                    break;
                                case "歐元":
                                    transpose = Double.valueOf(textField.getText())*0.913381;
                                    break;
                                case "人民幣":
                                    transpose = Double.valueOf(textField.getText())*6.347357;
                                    break;
                            }
                            break;
                        case "台幣":
                            switch (String.valueOf(comboBox2.getValue())){
                                case "美元":
                                    transpose = Double.valueOf(textField.getText())/29.42;
                                    break;
                                case "台幣":
                                    transpose = Double.valueOf(textField.getText());
                                    break;
                                case"日圓":
                                    transpose = Double.valueOf(textField.getText())/29.42*124.819687;
                                    break;
                                case "歐元":
                                    transpose = Double.valueOf(textField.getText())/29.42*0.913381;
                                    break;
                                case "人民幣":
                                    transpose = Double.valueOf(textField.getText())/29.42*6.347357;
                                    break;
                            }
                            break;
                        case"日圓":
                            switch (String.valueOf(comboBox2.getValue())){
                                case "美元":
                                    transpose = Double.valueOf(textField.getText())/124.819687;
                                    break;
                                case "台幣":
                                    transpose = Double.valueOf(textField.getText())/124.819687*29.42;
                                    break;
                                case"日圓":
                                    transpose = Double.valueOf(textField.getText());
                                    break;
                                case "歐元":
                                    transpose = Double.valueOf(textField.getText())/124.819687*0.913381;
                                    break;
                                case "人民幣":
                                    transpose = Double.valueOf(textField.getText())/124.819687*6.347357;
                                    break;
                            }
                            break;
                        case "歐元":
                            switch (String.valueOf(comboBox2.getValue())){
                                case "美元":
                                    transpose = Double.valueOf(textField.getText())/0.913381;
                                    break;
                                case "台幣":
                                    transpose = Double.valueOf(textField.getText())/0.913381*29.42;
                                    break;
                                case"日圓":
                                    transpose = Double.valueOf(textField.getText())/0.913381*124.819687;
                                    break;
                                case "歐元":
                                    transpose = Double.valueOf(textField.getText());
                                    break;
                                case "人民幣":
                                    transpose = Double.valueOf(textField.getText())/0.913381*6.347357;
                                    break;
                            }
                            break;
                        case "人民幣":
                            switch (String.valueOf(comboBox2.getValue())){
                                case "美元":
                                    transpose = Double.valueOf(textField.getText())/6.347357;
                                    break;
                                case "台幣":
                                    transpose = Double.valueOf(textField.getText())/6.347357*29.42;
                                    break;
                                case"日圓":
                                    transpose = Double.valueOf(textField.getText())/6.347357*124.819687;
                                    break;
                                case "歐元":
                                    transpose = Double.valueOf(textField.getText())/6.347357*0.913381;
                                    break;
                                case "人民幣":
                                    transpose = Double.valueOf(textField.getText());
                                    break;
                            }
                            break;
                    }
                    String di = String.valueOf(transpose);
                    String[] d2 = di.split("\\.");
                    if(d2[1].length()==1){di = di+"00";}
                    else if(d2[1].length()==2){di = di+"0";}
                    String a = String.valueOf(textField.getText())+" "+String.valueOf(comboBox.getValue())+" = "+ di +" "+String.valueOf(comboBox2.getValue());
                    text.setText(a);
                }
            }
        });
        //
        Pane root = new Pane();
        root.getChildren().addAll(textField,comboBox,comboBox2,text,button1,button2);
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }
}
