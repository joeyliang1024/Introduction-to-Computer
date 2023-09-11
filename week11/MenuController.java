package stu_108201017;

import javafx.fxml.FXML;

import java.io.IOException;

public class MenuController {
    @FXML
    public void OnStartPressed() throws IOException{
        P11.mazeScene.getRoot().requestFocus();
        P11.currentStage.setScene(P11.mazeScene);
    }
    @FXML
    public void OnExitPressed() throws IOException{
       P11.currentStage.close();
    }
}
