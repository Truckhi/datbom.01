package org.example.arkanoid.render;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Renderer {
    protected Image sprite;

    public Renderer(Image sprite) {
        this.sprite = sprite;
    }

    // Hàm abstract để các class con tự triển khai
    public abstract void render(GraphicsContext gc, double x, double y, double width, double height);
}
