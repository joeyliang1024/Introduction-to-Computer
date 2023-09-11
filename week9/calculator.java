package stu_108201017;
/**
 Assignment 7
 Student numnber : 108201017
 Course : 2022-CE1002
 */
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Math;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class calculator extends Application {
    public static void main(String[] args) throws IOException{
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //標題
        primaryStage.setTitle("計算機");
        TextField textField = new TextField ();
        textField.setLayoutX(56);
        textField.setLayoutY(0);
        textField.setText("");
        //送出按鈕
        Button btn1 = new Button();
        btn1.setText("1");
        btn1.setLayoutX(50);
        btn1.setLayoutY(200);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn1.getText());
            }
        });
        Button btn2 = new Button();
        btn2.setText("2");
        btn2.setLayoutX(100);
        btn2.setLayoutY(200);
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn2.getText());
            }
        });
        Button btn3 = new Button();
        btn3.setText("3");
        btn3.setLayoutX(150);
        btn3.setLayoutY(200);
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn3.getText());
            }
        });
        Button btn4 = new Button();
        btn4.setText("4");
        btn4.setLayoutX(50);
        btn4.setLayoutY(150);
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn4.getText());
            }
        });
        Button btn5 = new Button();
        btn5.setText("5");
        btn5.setLayoutX(100);
        btn5.setLayoutY(150);
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn5.getText());
            }
        });
        Button btn6 = new Button();
        btn6.setText("6");
        btn6.setLayoutX(150);
        btn6.setLayoutY(150);
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn6.getText());
            }
        });
        Button btn7 = new Button();
        btn7.setText("7");
        btn7.setLayoutX(50);
        btn7.setLayoutY(100);
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn7.getText());
            }
        });
        Button btn8 = new Button();
        btn8.setText("8");
        btn8.setLayoutX(100);
        btn8.setLayoutY(100);
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn8.getText());
            }
        });
        Button btn9 = new Button();
        btn9.setText("9");
        btn9.setLayoutX(150);
        btn9.setLayoutY(100);
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn9.getText());
            }
        });
        Button btn0 = new Button();
        btn0.setText("0");
        btn0.setLayoutX(100);
        btn0.setLayoutY(250);
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+btn0.getText());
            }
        });
        Button plus = new Button();
        plus.setText("+");
        plus.setLayoutX(200);
        plus.setLayoutY(100);
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+plus.getText());
            }
        });
        Button minus = new Button();
        minus.setText("-");
        minus.setLayoutX(200);
        minus.setLayoutY(150);
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+minus.getText());
            }
        });
        Button muti = new Button();
        muti.setText("*");
        muti.setLayoutX(200);
        muti.setLayoutY(200);
        muti.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+muti.getText());
            }
        });
        Button division = new Button();
        division.setText("/");
        division.setLayoutX(200);
        division.setLayoutY(250);
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+division.getText());
            }
        });
        Button percent = new Button();
        percent.setText("%");
        percent.setLayoutX(200);
        percent.setLayoutY(50);
        percent.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+percent.getText());
            }
        });
        Button dot = new Button();
        dot.setText(".");
        dot.setLayoutX(50);
        dot.setLayoutY(250);
        dot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+dot.getText());
            }
        });
        Button power = new Button();
        power.setText("^");
        power.setLayoutX(150);
        power.setLayoutY(50);
        power.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText(textField.getText()+power.getText());
            }
        });
        Button back = new Button();
        back.setText("<--");
        back.setLayoutX(100);
        back.setLayoutY(50);
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String minus_one = textField.getText().substring(0, textField.getText().length() - 1);
                textField.setText(minus_one);
            }
        });
        Button C = new Button();
        C.setText("C");
        C.setLayoutX(50);
        C.setLayoutY(50);
        C.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textField.setText("");
            }
        });
        Button equal = new Button();
        equal.setText("=");
        equal.setLayoutX(150);
        equal.setLayoutY(250);
        equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //要算結果
                String operator = "";
                Double temp;
                ArrayList<String> sym = new ArrayList<>();
                ArrayList<Double> num = new ArrayList<Double>();
                ArrayList<Integer> temp1 = new ArrayList();
                ArrayList<Integer> temp2 = new ArrayList();
                //取出符號和數字
                String numbers = textField.getText().replaceAll("\\+|-|\\*|/|%|\\^",",");
                String[] number1 = numbers.split(",");
                for(String number : number1){
                    num.add(Double.parseDouble(number));
                }
                for(int j = 0; j < textField.getText().length(); j++) {
                    if (textField.getText().substring(j, j + 1).matches("\\+|-|\\*|/|%|\\^")) {
                        operator += textField.getText().substring(j, j + 1);
                        sym.add(operator);
                        operator = "";
                    }
                }
                //計算
                for(int i=0;i<sym.size();i++){
                    if(sym.get(i).equals("^")){
                        temp1.add(i);
                    }
                }
                for(int j = 0;j<temp1.size();j++){
                    temp = Math.pow(num.get(temp1.get(j)-j),num.get(temp1.get(j)+1-j));
                    num.set(temp1.get(j)-j,temp);
                    num.remove(temp1.get(j)+1-j);
                    sym.remove(temp1.get(j)-j);
                }

                for(int k=0;k<sym.size();k++){
                    if(sym.get(k).equals("*")||sym.get(k).equals("/")||sym.get(k).equals("%")){
                        temp2.add(k);
                    }
                }
                for(int l = 0;l<temp2.size();l++){
                    if(sym.get(temp2.get(l)-l).equals("*")){
                        temp = (num.get(temp2.get(l)-l))*(num.get(temp2.get(l)+1-l));
                        num.set(temp2.get(l)-l,temp);
                        num.remove(temp2.get(l)+1-l);
                        sym.remove(temp2.get(l)-l);
                    }
                    else if(sym.get(temp2.get(l)-l).equals("/")){
                        temp = num.get(temp2.get(l)-l)/num.get(temp2.get(l)+1-l);
                        num.set(temp2.get(l)-l,temp);
                        num.remove(temp2.get(l)+1-l);
                        sym.remove(temp2.get(l)-l);
                    }
                    else if(sym.get(temp2.get(l)-l).equals("%")){
                        temp = num.get(temp2.get(l)-l)%num.get(temp2.get(l)+1-l);
                        num.set(temp2.get(l)-l,temp);
                        num.remove(temp2.get(l)+1-l);
                        sym.remove(temp2.get(l)-l);
                    }
                }
                double sum = num.get(0);
                for(int m=0;m<sym.size();m++){
                    //System.out.println(sym.get(m));
                    if(sym.get(m).equals("+")){
                        sum = sum + num.get(m+1);
                    }
                    else if(sym.get(m).equals("-")){
                        sum = sum - num.get(m+1);
                    }
                }
                textField.setText(String.valueOf(sum));
            }
        });
        //display
        Pane root = new Pane();
        root.getChildren().addAll(btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
        root.getChildren().addAll(plus,minus,muti,percent,equal,division,power,dot,back,C);
        root.getChildren().add(textField);
        primaryStage.setScene(new Scene(root, 275, 300));
        primaryStage.show();
    }
}

