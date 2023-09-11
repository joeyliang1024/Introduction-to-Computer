package stu_108201017;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
public class MazeController implements EventHandler<KeyEvent> {
    int rowIndex = 0;
    int columnIndex =0;
    int tempRow = 0;
    int tempCol = 0;
    @FXML
    GridPane maze;
    @FXML
    Pane man;
    @FXML
    Label successLabel;
    @FXML
    Button backButton;
    @FXML
    Pane man1;
    @FXML
    Label defeatLabel;

    @FXML
    public void OnBackPressed() {
        P11.currentStage.setScene(P11.menuScene);
    }
    @Override
    public void handle(KeyEvent e) {
        if(e.getCode() == KeyCode.DOWN && !(rowIndex==4 && columnIndex==4)){
            if(rowIndex+1 != tempRow) {
                tempRow = rowIndex;
                tempCol = columnIndex;
                rowIndex++;
            }
        }
        if(e.getCode() == KeyCode.UP && !(rowIndex==4 && columnIndex==4)){
            if(rowIndex-1 != tempRow) {
                tempRow = rowIndex;
                tempCol = columnIndex;
                rowIndex--;
            }
        }
        if(e.getCode() == KeyCode.RIGHT && !(rowIndex==4 && columnIndex==4)){
            if(columnIndex+1 != tempCol) {
                tempRow = rowIndex;
                tempCol = columnIndex;
                columnIndex++;
            }
        }
        if(e.getCode() == KeyCode.LEFT && !(rowIndex==4 && columnIndex==4)){
            if(columnIndex-1 != tempCol) {
                tempRow = rowIndex;
                tempCol = columnIndex;
                columnIndex--;
            }
        }
        if(e.getCode() == KeyCode.SPACE){
            tempRow = 0;
            tempCol = 0;
            columnIndex=0;
            rowIndex=0;
            successLabel.setVisible(false);
            defeatLabel.setVisible(false);
        }
        walkToNewPosition();
        if(rowIndex==4 && columnIndex==4){
            successLabel.setVisible(true);
            defeatLabel.setVisible(false);
        }
    }
    private void walkToNewPosition() {
        int maxRowIndex = maze.getRowCount()-1;
        int mazColumnIndex = maze.getColumnCount()-1;
        if(rowIndex<0){
            defeatLabel.setVisible(true);
            rowIndex=0;
        }
        if(rowIndex>maxRowIndex){
            defeatLabel.setVisible(true);
            rowIndex = maxRowIndex;
        }
        if(columnIndex<0){
            defeatLabel.setVisible(true);
            columnIndex=0;
        }
        if(columnIndex>mazColumnIndex){
            columnIndex = mazColumnIndex;
            defeatLabel.setVisible(true);
        }

        GridPane.setRowIndex(man1,tempRow);
        GridPane.setColumnIndex(man1,tempCol);
        GridPane.setRowIndex(man,rowIndex);
        GridPane.setColumnIndex(man,columnIndex);
    }
}

