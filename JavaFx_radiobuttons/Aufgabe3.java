package themenBlock4;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aufgabe3 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Aufgabe 3 Fenster");
		FlowPane root = new FlowPane(10,10);
		root.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		Scene scene = new Scene(root, 600, 600, Color.WHITE);
		Label label = new Label("Geben Sie ihren Text ein: ");
		TextField text = new TextField();
		RadioButton bDatei = new RadioButton("in Datei speichern");
		RadioButton bConsole = new RadioButton("in Console ausgeben");
		Button bWrite = new Button("Write Input");
		ToggleGroup group = new ToggleGroup();
		group.getToggles().addAll(bDatei,bConsole);
		bWrite.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(text.getText().isEmpty()) {
					System.err.println("Eingabe darf nicht leer sein");
				}
				else if(bDatei.isSelected()) {
					try {
						FileWriter fw = new FileWriter("output.txt",true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(text.getText());
						bw.flush();
						bw.close();
						
					} catch (Exception e) {
						System.err.println(e.getLocalizedMessage());
					}
				}
				else if(bConsole.isSelected()) {
					System.out.println(text.getText());
				}
				
			}
		});
		/*bDatei.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				try {
					FileWriter fw = new FileWriter("output.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(text.getText());
					bw.flush();
					bw.close();
					
				} catch (Exception e) {
					System.err.println(e.getLocalizedMessage());
				}
				
				
			}
		});
		bConsole.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println(text.getText());
				
			}
		});
		*/
		root.getChildren().addAll(label,text,bDatei,bConsole,bWrite);
		stage.setScene(scene);
		stage.show();
		
	}

}
