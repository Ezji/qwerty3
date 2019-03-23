package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;


public class Hello1 extends Application {
	
	static double x1;
	static double x2;
	static double x3;
	static double x4;
	
	@Override
	public void start(Stage theStage) {
		theStage.setTitle( "Ïðèìåð ðàáîòû ñ êëàâèàòóðîé" );
		
		Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
		
		Canvas canvas = new Canvas (660, 150);
		root.getChildren().add(canvas); 
		
        
		
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		Image car = new Image("car2.png");
		Image road = new Image("road2.png");
		x1 = 0;
		x2 = 220;
		x3 = 440;
		x4 = 660;
		
		final long startTime = System.nanoTime();
		
		new AnimationTimer() {

			@Override
			public void handle(long t) {
				gc.drawImage(road, x1, 0);
				gc.drawImage(road, x2, 0);
				gc.drawImage(road, x3, 0);
				gc.drawImage(road, x4, 0);
				gc.drawImage(car, 250, 70);
				
                
				x1 -= 1;
				x2 -= 1;
				x3 -= 1;
				x4 -= 1;
				if (x1 == -220) {x1 = 660;}
				if (x2 == -220) {x2 = 660;}
				if (x3 == -220) {x3 = 660;}
				if (x4 == -220) {x4 = 660;}
			}
			
		}.start();
		
		
		theStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
