import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {


    float x;
    float y;
    float n;
    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);



    }


    public void draw() {
        background(0);

        for (int i = 0; i < n; i++) {
            ellipse(random(width), random(height), 50, 50);
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}