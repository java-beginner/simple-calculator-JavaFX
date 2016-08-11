package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX簡易電卓
 * メインクラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root;
        try {
            root = (BorderPane)FXMLLoader.load(getClass().getResource(Constants.APP_SETTING_FXML));
            Scene scene = new Scene(root);
            primaryStage.setTitle(Constants.APP_SETTING_TITLE);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
