import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;

public class ExtraProblem1 extends Application {
    public void start(Stage stage) {
        Random rand = new Random();


        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000);
        for (int i = 0; i < 25; i++) {

            double x1 = rand.nextInt(1000);
            double y1 = rand.nextInt(1000);
            double x2 = rand.nextInt(1000);
            double y2 = rand.nextInt(1000);
            double x3 = rand.nextInt(1000);
            double y3 = rand.nextInt(1000);

            Polygon polygon = new Polygon();
            polygon.getPoints().addAll(new Double[]{
                    x1, y1,
                    x2, y2,
                    x3, y3 });


            int rgb1 = rand.nextInt(255);
            int rgb2 = rand.nextInt(255);
            int rgb3 = rand.nextInt(255);
            int srgb1 = rand.nextInt(255);
            int srgb2 = rand.nextInt(255);
            int srgb3 = rand.nextInt(255);
            int sw = rand.nextInt(50);
            double opa = (rand.nextDouble(1));

            polygon.setFill(Color.rgb(rgb1, rgb2, rgb3));
            polygon.setStroke(Color.rgb(srgb1, srgb2, srgb3));
            polygon.setStrokeWidth(sw);
            polygon.setOpacity(opa);
            root.getChildren( ).add( polygon );
        }
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();


    }

}
