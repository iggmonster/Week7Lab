import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.transform.Rotate;

/*
CS1131
Lab Section: L01
@author Keiffer Button
 */

public class ExtraProblem2 extends Application {
    public void start(Stage stage) {


        //Group root = new Group();
        //Scene scene = new Scene(root, 1250, 1250);

        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000);

        javafx.scene.shape.Line line1 = new javafx.scene.shape.Line(500, 0, 500, 1000);
        line1.setStroke(Color.rgb(0, 255, 0));
        line1.setStrokeWidth(3);
        root.getChildren().add(line1);
        javafx.scene.shape.Line line2 = new javafx.scene.shape.Line(0, 500, 1000, 500);
        line2.setStroke(Color.rgb(0, 255, 0));
        line2.setStrokeWidth(3);
        root.getChildren().add(line2);

int l = 50;
int m = 50;
        for (int i = 0; i < 30; i++) {
            Rotate rotate = new Rotate();
            rotate.setAngle(10*i);
            rotate.setPivotX(500+l*i);
            rotate.setPivotY(500-l*i);

            int pos = 250 + m * i;
            int pos2 = 500 - m * i;

            Rectangle rect = new Rectangle(pos, pos, pos2, pos2);
            //rect.setX(500);
            //rect.setY(500);
            //rect.getTransforms().add(new Rotate(30, 500, 500));
            rect.getTransforms().addAll(rotate);
            rect.setFill(Color.WHITE);
            rect.setStroke(Color.BLACK);
            rect.setStrokeWidth(10);
            root.getChildren().add(rect);
        }

        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();


    }

}
