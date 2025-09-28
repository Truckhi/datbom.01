package org.example.arkanoid.util;

import javafx.scene.image.Image;
import java.io.File;

public class ResourceLoader {
    // Load hình ảnh từ thư mục res
    public static Image loadImage(String path) {
        File file = new File("res/" + path);
        if (!file.exists()) {
            throw new RuntimeException("Không tìm thấy ảnh: " + file.getAbsolutePath());
        }
        return new Image(file.toURI().toString());
    }
}
