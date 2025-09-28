package org.example.arkanoid.render;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BallRenderer extends Renderer {
    public BallRenderer(Image sprite) {
        super(sprite);
    }

    @Override
    public void render(GraphicsContext gc, double x, double y, double width, double height) {
        if (sprite != null) {
            gc.drawImage(sprite, x, y, width, height);
        } else {
            gc.fillOval(x, y, width, height);
        }
    }
}
