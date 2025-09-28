package org.example.arkanoid.util;

import javafx.scene.media.AudioClip;

public class SoundManage {
    private static AudioClip hitSound;
    private static AudioClip breakSound;
    private static AudioClip powerupSound;

    // Gọi hàm này khi game khởi động
    public static void init() {
        hitSound = new AudioClip(new java.io.File("res/sounds/hit.wav").toURI().toString());
        breakSound = new AudioClip(new java.io.File("res/sounds/break.wav").toURI().toString());
        powerupSound = new AudioClip(new java.io.File("res/sounds/powerup.wav").toURI().toString());
    }

    public static void playHit() {
        if (hitSound != null) hitSound.play();
    }

    public static void playBreak() {
        if (breakSound != null) breakSound.play();
    }

    public static void playPowerup() {
        if (powerupSound != null) powerupSound.play();
    }
}
