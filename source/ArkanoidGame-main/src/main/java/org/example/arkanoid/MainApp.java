package org.example.arkanoid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        // Tạo Canvas để vẽ game
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Vẽ thử nền đen + Paddle trắng
        gc.setFill(javafx.scene.paint.Color.BLACK);
        gc.fillRect(0, 0, 800, 600);

        gc.setFill(javafx.scene.paint.Color.WHITE);
        gc.fillRect(350, 550, 100, 20); // Paddle demo

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root);

        stage.setTitle("Arkanoid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}