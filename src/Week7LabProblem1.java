import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/*
CS1131
Lab Section: L01
@author Keiffer Button
 */

public class Week7LabProblem1 extends Application {
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root, 1980, 1020);

        Rectangle rect1 = new Rectangle( 0, 0, 3000, 3000 );
        rect1.setFill(Color.rgb(50, 0, 255));
        rect1.setStroke(Color.rgb(0, 0, 255));
        rect1.setStrokeWidth(100);
        root.getChildren( ).add( rect1 );

        javafx.scene.shape.Line line = new javafx.scene.shape.Line( 0, 0, 2000, 600 );
        line.setStroke(Color.rgb(255, 200, 0));
        line.setStrokeWidth(10);
        root.getChildren( ).add( line );

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();

        javafx.scene.shape.Line line2 = new javafx.scene.shape.Line( 0, 600, 2000, 0 );
        line2.setStroke(Color.rgb(255, 200, 0));
        line2.setStrokeWidth(10);
        root.getChildren( ).add( line2 );

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();

        javafx.scene.shape.Line line1 = new javafx.scene.shape.Line( 0, 300, 2000, 300 );
        line1.setStroke(Color.rgb(255, 200, 0));
        line1.setStrokeWidth(10);
        root.getChildren( ).add( line1 );

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();




        Circle circle = new Circle( 1000, 300, 125 );
        circle.setFill(Color.rgb(255, 255, 0));
        circle.setStroke(Color.rgb(255, 200, 0));
        circle.setStrokeWidth(10);
        root.getChildren( ).add( circle );

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();


        Rectangle rect = new Rectangle( -30, 900, 3000, 200 );
        rect.setFill(Color.rgb(58, 29, 0));
        rect.setStroke(Color.rgb(0, 100, 0));
        rect.setStrokeWidth(100);
        root.getChildren( ).add( rect );
    }

}
