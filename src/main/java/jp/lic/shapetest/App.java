package jp.lic.shapetest;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

 
public class App extends Application{
 
	public static void main(String[] args) {
		launch(args);
	}
 
	@Override
	public void start(Stage primaryStage) {
		View v = new View();
		Scene scene = new Scene(v, 400, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
 
}
 
//画面にオブジェクトを表示するクラス
class View extends Group{
	public View() {
		//矩形の表示
		Rectangle rect = new Rectangle(150,100,100,100);
		getChildren().add(rect);
                
                rect.setX(10);
                
                
                Timeline timer = new Timeline(new KeyFrame(Duration.millis(33), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent event) {
                        rect.setRotate(rect.getRotate()+1);
                    }
                }));
                timer.setCycleCount(Timeline.INDEFINITE);
                timer.play();
                
	}
}