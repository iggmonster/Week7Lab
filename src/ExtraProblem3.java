import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

/*
CS1131
Lab Section: L01
@author Keiffer Button
 */

public class ExtraProblem3 extends Application {
    public void start(Stage stage) {


            Group root = new Group();
            Scene scene = new Scene(root, 1000, 1000);

        Rectangle rect1 = new Rectangle( 0, 0, 3000, 3000 );
        rect1.setFill(Color.BLACK);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(100);
        root.getChildren( ).add( rect1 );

        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Ellipse ellipse = new javafx.scene.shape.Ellipse(500, 500, 500-i, 0+i);
            ellipse.setStroke(Color.rgb(0, 255, 0));
            ellipse.setStrokeWidth(1);
            ellipse.setFill(Color.TRANSPARENT);
            root.getChildren().add(ellipse);

        }

        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Ellipse ellipse = new javafx.scene.shape.Ellipse(500, 500, 0+i, 500-i);
            ellipse.setStroke(Color.rgb(0, 255, 0));
            ellipse.setStrokeWidth(1);
            ellipse.setFill(Color.TRANSPARENT);
            root.getChildren().add(ellipse);
        }

        /*
        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Line line = new javafx.scene.shape.Line(500+i, 500, 500, 0+i);
            line.setStroke(Color.rgb(0, 255, 0));
            line.setStrokeWidth(1);
            root.getChildren().add(line);
        }
        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Line line = new javafx.scene.shape.Line(500+i, 500, 500, 1000-i);
            line.setStroke(Color.rgb(0, 255, 0));
            line.setStrokeWidth(1);
            root.getChildren().add(line);
        }
        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Line line = new javafx.scene.shape.Line(500-i, 500, 500, 0+i);
            line.setStroke(Color.rgb(0, 255, 0));
            line.setStrokeWidth(1);
            root.getChildren().add(line);
        }
        for (int i = 0; i < 500; i += 10) {
            javafx.scene.shape.Line line = new javafx.scene.shape.Line(500-i, 500, 500, 1000-i);
            line.setStroke(Color.rgb(0, 255, 0));
            line.setStrokeWidth(1);
            root.getChildren().add(line);
        }


         */

        javafx.scene.shape.Line line1 = new javafx.scene.shape.Line(500, 0, 500, 1000);
        line1.setStroke(Color.rgb(0, 255, 0));
        line1.setStrokeWidth(3);
        root.getChildren().add(line1);
        javafx.scene.shape.Line line2 = new javafx.scene.shape.Line(0, 500, 1000, 500);
        line2.setStroke(Color.rgb(0, 255, 0));
        line2.setStrokeWidth(3);
        root.getChildren().add(line2);


        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();


    }

}
