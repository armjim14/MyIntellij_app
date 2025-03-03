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
        Button RockButton = new Button("Rock");
        Button PaperButton = new Button("Paper");
        Button ScissorsButton = new Button("Scissors");

        EventHandler<ActionEvent> rock_event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                // lb.setText("world hello!    ");
                handlePlayerChoice(lb, 0);
            }
        };
        RockButton.setOnAction(rock_event);

        EventHandler<ActionEvent> paper_event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                handlePlayerChoice(lb, 1);
            }
        };
        PaperButton.setOnAction(paper_event);

        EventHandler<ActionEvent> scissors_event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e){
                handlePlayerChoice(lb, 2);
            }
        };
        ScissorsButton.setOnAction(scissors_event);

        TilePane  r = new TilePane ();

        r.getChildren().add(RockButton);
        r.getChildren().add(PaperButton);
        r.getChildren().add(ScissorsButton);

        r.getChildren().add(lb);

        Scene sc = new Scene(r, 300, 300);
        stage.setScene(sc);

        stage.setTitle("My App");
        stage.show();
    }

    public static void runProgram(String[] args){
        launch(args);
    }

    private static void handlePlayerChoice(Label lb, int action){
        String displayWinner = GameLogic.runUserInput(action);
        lb.setText(displayWinner);
    }
}
