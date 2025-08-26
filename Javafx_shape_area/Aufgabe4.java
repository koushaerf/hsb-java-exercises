package uebung11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
		FlowPane root = new FlowPane(10,10);
		root.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, null, null)));
		Scene scene = new Scene(root, 250, 300, Color.BURLYWOOD);
		Label label1 = new Label("Ihre Auswahl: ");
		ComboBox<String>box = new ComboBox<String>();
		box.getItems().add("Quadrat");
		box.getItems().add("Rechteck");
		box.getItems().add("Dreieck");
		box.getSelectionModel().select("Rechteck");
		Button button = new Button("bestätigen");
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(box.getSelectionModel().getSelectedItem().equals("Quadrat")) {
					
						
					
					Stage quadrat = new Stage();
					quadrat.setTitle("Quadrat");
					FlowPane subRoot = new FlowPane(10,10);
					Scene subScene = new Scene(subRoot, 250, 300, Color.CYAN);
					Label label1=new Label("Geben Sie die Seite ein: ");
					TextField seite = new TextField();
					Button subButton = new Button("berechnen");
					Label label2 = new Label("Flache ist gleich: ");
					subButton.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent arg0) {
							try {
								
							
							double seiteQuadrat = Double.parseDouble(seite.getText());
							double flache = seiteQuadrat*seiteQuadrat;
							label2.setText("Fläche : "+flache);
							} catch (Exception e) {
								label2.setText("Fehler!!!");
							}
						}
					});
					subRoot.getChildren().addAll(label1,seite,subButton,label2);
					quadrat.setScene(subScene);
					quadrat.show();
					
					
					
					
				}
				else if(box.getSelectionModel().getSelectedItem().equals("Rechteck")) {
					Stage rechteck = new Stage();
					rechteck.setTitle("Rechteck");
					FlowPane subRoot = new FlowPane(10,10);
					Scene subScene = new Scene(subRoot, 250, 300, Color.CYAN);
					Label label1=new Label("Geben Sie die SeiteA ein: ");
					TextField seiteA = new TextField();
					Label label2=new Label("Geben Sie die SeiteB ein: ");
					TextField seiteB = new TextField();
					Button subButton = new Button("berechnen");
					Label label3 = new Label("Flache ist gleich: ");
					subButton.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent arg0) {
							try {
								
							
							double seiteRechtA = Double.parseDouble(seiteA.getText());
							double seiteRechtB = Double.parseDouble(seiteB.getText());
							double flache = seiteRechtA*seiteRechtB;
							label3.setText("Fläche : "+flache);
							} catch (Exception e) {
								label3.setText("Fehler!!!");
							}
						}
					});
					subRoot.getChildren().addAll(label1,seiteA,label2,seiteB,subButton,label3);
					rechteck.setScene(subScene);
					rechteck.show();
					
				}
				else if(box.getSelectionModel().getSelectedItem().equals("Dreieck")) {
					Stage dreieck = new Stage();
					dreieck.setTitle("Dreieck");
					FlowPane subRoot = new FlowPane(10,10);
					Scene subScene = new Scene(subRoot, 250, 300, Color.CYAN);
					Label label1=new Label("Geben Sie die Grundseite ein: ");
					TextField grundSeite = new TextField();
					Label label2=new Label("Geben Sie die Höhe ein: ");
					TextField hohe = new TextField();
					Button subButton = new Button("berechnen");
					Label label3 = new Label("Flache ist gleich: ");
					subButton.setOnAction(new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent arg0) {
							try {
								
							
							double grundSeiteDreieck = Double.parseDouble(grundSeite.getText());
							double hoheDreieck = Double.parseDouble(hohe.getText());
							double flache = (grundSeiteDreieck*hoheDreieck)/2;
							label3.setText("Fläche : "+flache);
							} catch (Exception e) {
								label3.setText("Fehler!!!");
							}
						}
					});
					subRoot.getChildren().addAll(label1,grundSeite,label2,hohe,subButton,label3);
					dreieck.setScene(subScene);
					dreieck.show();
					
					
				}
				
			}
		});
		root.getChildren().addAll(label1,box,button);
		stage.setScene(scene);
		stage.show();
		
	}

}
