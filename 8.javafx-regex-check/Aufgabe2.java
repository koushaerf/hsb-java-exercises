package uebung13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aufgabe2 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Aufgabe2");
		FlowPane root = new FlowPane(10,10);
		Scene scene = new Scene(root, 400, 200,Color.DARKKHAKI);
		root.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		Label label = new Label("Geben Sie die Telefonnummer!");
		TextField text = new TextField();
		Button b = new Button("check");
		Label erg = new Label();
		
		b.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				Pattern p = Pattern.compile("(0234)/{0,1}(3210)[0-9]{3}");
				Matcher m = p.matcher(text.getText());
				if(m.matches()) {
					erg.setText("ist Korrekt");
					erg.setTextFill(Color.GREEN);
				}
				else {
					erg.setText("versuchen Sie nochmal!!");
					erg.setTextFill(Color.DARKRED);
					text.setText("");
				}
			}
		});
		root.getChildren().addAll(label,text,b,erg);
		stage.setScene(scene);
		stage.show();
		
	}

}
