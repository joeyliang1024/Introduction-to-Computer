package stu_108201017;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
public class P11 extends Application {
        public static Stage currentStage;
        public static Scene menuScene;
        public static Scene mazeScene;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(P11.class.getResource("/menu.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(P11.class.getResource("/maze.fxml"));
        currentStage = primaryStage;
        menuScene = new Scene(fxmlLoader1.load());
        mazeScene = new Scene(fxmlLoader2.load());
        currentStage.setTitle("Walk to Exit");
        currentStage.setScene(menuScene);
        currentStage.show();
    }
        public static void main(String[] args){
            launch();
        }
    }