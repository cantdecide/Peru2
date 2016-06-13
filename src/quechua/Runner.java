package quechua;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Runner extends Application {

  private Stage  _stage;
  private Button _button;
  private Label  _label;
  private Game   _gameEngine;

  public static void main(String[] args) {
    Application.launch();
  }

  public void start(Stage stage) {
    _stage = stage;
    _stage.setTitle("Learn Quechua");
    VBox vbox = new VBox(8.0);
    Button begin = new Button("start");
    begin.setOnAction(this::handleStartButtonClicked);
    vbox.getChildren().add(begin);
    Scene scene = new Scene(vbox);
    stage.setScene(scene);
    _stage.show();
  }

  private void handleStartButtonClicked(ActionEvent event) {
    _stage.hide();
    Stage firstStage = new Stage();
    VBox vbox = new VBox(8.0);
    Label prompt = new Label("How do you say 'Do you need help?' in Quechua?");
    vbox.getChildren().add(prompt);
    Button answer = new Button("answer");
    answer.setOnAction(this::handleAnswer1);
    vbox.getChildren().add(answer);
    Scene scene = new Scene(vbox);
    firstStage.setScene(scene);
    _stage = firstStage;
    _stage.show();
  }

  private void handleAnswer1(ActionEvent event) {
    _stage.hide();
    Stage firstStage = new Stage();
    VBox vbox = new VBox(8.0);
    Label prompt = new Label("Munanki anapanayta?");
    vbox.getChildren().add(prompt);
    Button pronunciation = new Button("How do you pronounce this?");
    vbox.getChildren().add(pronunciation);
    Button nextWord = new Button("Next Word");
    vbox.getChildren().add(nextWord);
    Scene scene = new Scene(vbox);
    firstStage.setScene(scene);
    _stage = firstStage;
    _stage.show();
  }
}
// How do I make it so they can answer it?
// Do I need to set the order that the words come in?
