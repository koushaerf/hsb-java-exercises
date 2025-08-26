



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ampel extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Ampel");
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 250, 300, Color.WHITE);
		Circle rot = new Circle(30);
		rot.setFill(Color.RED);
		Circle gelb = new Circle(30);
		gelb.setFill(Color.DARKGRAY);
		Circle grun = new Circle(30);
		grun.setFill(Color.DARKGRAY);
		Button weiter = new Button("Weiter->");
		Button exit = new Button("Exit");
		weiter.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if((rot.getFill().equals(Color.RED)&&gelb.getFill().equals(Color.DARKGRAY))) {
					gelb.setFill(Color.YELLOW);
				}
				else if((rot.getFill().equals(Color.RED)&&gelb.getFill().equals(Color.YELLOW))) {
					grun.setFill(Color.GREEN);
					rot.setFill(Color.DARKGRAY);
					gelb.setFill(Color.DARKGRAY);
				}
				else if(grun.getFill().equals(Color.GREEN)) {
					grun.setFill(Color.DARKGRAY);
					gelb.setFill(Color.YELLOW);
				}
				else if((gelb.getFill().equals(Color.YELLOW)&&rot.getFill().equals(Color.DARKGRAY))) {
					gelb.setFill(Color.DARKGRAY);
					rot.setFill(Color.RED);
				}
				
				
			}
		});
		exit.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
		});
		VBox box = new VBox();
		box.getChildren().addAll(rot,gelb,grun);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(5);
		StackPane stackPane = new StackPane();
		Rectangle rechteck = new Rectangle(100,210);
		rechteck.setFill(Color.BLACK);
		stackPane.getChildren().addAll(rechteck,box);
		HBox boxButton = new HBox();
		boxButton.getChildren().addAll(weiter,exit);
		boxButton.setSpacing(20);
		boxButton.setAlignment(Pos.CENTER);
		root.setCenter(stackPane);
		root.setBottom(boxButton);
		stage.setScene(scene);
		stage.show();
		
		
	}

}
