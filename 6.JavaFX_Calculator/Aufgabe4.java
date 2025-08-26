package uebung10;

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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aufgabe4 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Aufgabe4 Fenster");
		FlowPane root = new FlowPane(10, 10);
		root.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		Scene scene = new Scene(root, 600, 600, Color.WHITE);
		TextField text1 = new TextField();
		Button bAdd = new Button("+");
		Button bMinus = new Button("-");
		Button bMultiplikation = new Button("*");
		Button bDivision = new Button("/");
		TextField text2 = new TextField();
		Label erg = new Label();
		bAdd.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				try {
					int zahl1 = Integer.parseInt(text1.getText());
					int zahl2 = Integer.parseInt(text2.getText());
					int summe = zahl1+zahl2 ;
					erg.setText("Ergebnis : "+summe);
					
				} catch (Exception e) {
					erg.setText(e.getLocalizedMessage());
				}
				
			}
		});
		bMinus.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				try {
					int zahl1 = Integer.parseInt(text1.getText());
					int zahl2 = Integer.parseInt(text2.getText());
					int subtrakt = zahl1-zahl2 ;
					erg.setText("Ergebnis : "+subtrakt);
					
				} catch (Exception e) {
					erg.setText(e.getLocalizedMessage());
				}
				
			}
		});
		bMultiplikation.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			try {
				int zahl1 = Integer.parseInt(text1.getText());
				int zahl2 = Integer.parseInt(text2.getText());
				int multiplikation = zahl1*zahl2 ;
				erg.setText("Ergebnis : "+multiplikation);
				
			} catch (Exception e) {
				erg.setText(e.getLocalizedMessage());
			}
			
		}
	});
		bDivision.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent arg0) {
			try {
				int zahl1 = Integer.parseInt(text1.getText());
				int zahl2 = Integer.parseInt(text2.getText());
				int division = zahl1/zahl2 ;
				erg.setText("Ergebnis : "+division);
				
			} catch (Exception e) {
				erg.setText(e.getLocalizedMessage());
				erg.setTextFill(Color.DARKRED);
			}
			
		}
	});
		root.getChildren().addAll(text1,bAdd,bMinus,bMultiplikation,bDivision,text2,erg);
		stage.setScene(scene);
		stage.show();
	}

}
