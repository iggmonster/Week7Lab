import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import java.util.Random;


public class ExtraProblem4 extends Application {
    public void start(Stage stage) {
        Random rand = new Random();

        int x = 500;
        int y = 500;
        int r = 127;
        int g = 127;
        int b = 127;

        Group root = new Group();
        Scene scene = new Scene(root, 1000, 1000);
        for (int i = 0; i < 2000000; i++) {

            x += rand.nextInt(3)-1;
            y += rand.nextInt(3)-1;
            r += rand.nextInt(3)-1;
            g += rand.nextInt(3)-1;
            b += rand.nextInt(3)-1;

            if (r > 255){
                r = 0;
            } else if (r < 0) {
                r = 255;
            }
            if (g > 255){
                g = 0;
            } else if (g < 0) {
                g = 255;
            }
            if (b > 255){
                b = 0;
            } else if (b < 0) {
                b = 255;
            }

            if (x > 1000){
                x = 0;
            } else if (x < 0) {
                x = 1000;
            }
            if (y > 1000){
                y = 0;
            } else if (y < 0) {
                y = 1000;
            }

//System.out.println(x +  " " + y);
            javafx.scene.shape.Line line = new javafx.scene.shape.Line(x, y, x, y);
            line.setStroke(Color.rgb(r, g, b));
            line.setStrokeWidth(1);
            root.getChildren().add(line);

        }
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();


    }

}
