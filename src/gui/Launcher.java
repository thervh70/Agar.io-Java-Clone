package gui;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;

/**
 * Created by Robin on 28-6-2015.
 */
public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        final double[] x = {0};
        final double[] y = {0};
        Pane root = new Pane();
        Scene scene = new Scene(root,1920, 1080);

        Color color = Color.BLACK;
        CornerRadii corner = new CornerRadii(0);
        Insets inset = new Insets(0);
        BackgroundFill fill = new BackgroundFill(color, corner, inset);
        Background black = new Background(fill);

        root.setBackground(black);

        Text location = new Text();
        location.setLayoutX(100);
        location.setLayoutY(50);
        location.setFill(Color.WHITE);

        Circle circle = new Circle(100,Color.BLUE);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                TranslateTransition tt = new TranslateTransition(Duration.millis(250), circle);
                Point mouse = MouseInfo.getPointerInfo().getLocation();

                x[0] = mouse.getX();
                y[0] = mouse.getY();

                location.setText(x[0] + ", " + y[0]);

                tt.setToX(x[0]);
                tt.setToY(y[0]);

                tt.play();

            }
        };

        timer.start();

        root.getChildren().addAll(circle, location);

        primaryStage.setFullScreenExitHint("");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
}
