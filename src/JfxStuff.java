import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class JfxStuff extends Application {

    @Override
    public void start(Stage stage) {
        Label lb = new Label("Hello World!");
        Button PaperButton = new Button("Paper");

        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                lb.setText("world hello!    ");
            }
        };

        PaperButton.setOnAction(event);

        TilePane  r = new TilePane ();
        r.getChildren().add(lb);
        r.getChildren().add(PaperButton);

        Scene sc = new Scene(r, 300, 300);
        stage.setScene(sc);

        stage.setTitle("My App");
        stage.show();
    }

    public static void runProgram(String[] args){
        launch(args);
    }
}
