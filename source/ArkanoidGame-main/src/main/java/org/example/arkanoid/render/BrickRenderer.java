package org.example.arkanoid.render;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BrickRenderer extends Renderer {
    public BrickRenderer(Image sprite) {
        super(sprite);
    }

    @Override
    public void render(GraphicsContext gc, double x, double y, double width, double height) {
        if (sprite != null) {
            gc.drawImage(sprite, x, y, width, height);
        } else {
            gc.strokeRect(x, y, width, height); // fallback nếu chưa có ảnh
        }
    }
}
