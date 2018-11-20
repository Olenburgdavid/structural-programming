import processing.core.PApplet;

public class Main extends PApplet {

    public void settings() {
        size(800, 800);
    }

    public void draw() {
        background(50, 40, 195);
        stroke(255, 0, 0);
        strokeWeight(3);

        float x = width / 2;
        float y = height / 2;
        float r = 100;
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r, y, x - r / 4, y - r / 4);
        line(x - r, y, x - r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y - r / 4);
        line(x + r / 4, y - r / 4, x, y - r);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x - r / 4, y + r / 4, x, y + r);


        x = width - width / 6;
        y = height / 6;
        r = 50;
        stroke(255, 255, 0);
        strokeWeight(3);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r, y, x - r / 4, y - r / 4);
        line(x - r, y, x - r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y - r / 4);
        line(x + r / 4, y - r / 4, x, y - r);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x - r / 4, y + r / 4, x, y + r);


        x = width / 6;
        y = height / 6;
        r = 50;
        stroke(0, 155, 80);
        strokeWeight(3);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r, y, x - r / 4, y - r / 4);
        line(x - r, y, x - r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y - r / 4);
        line(x + r / 4, y - r / 4, x, y - r);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x - r / 4, y + r / 4, x, y + r);


        x = width / 6;
        y = height - height / 6;
        r = 50;
        stroke(200, 155, 80);
        strokeWeight(3);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r, y, x - r / 4, y - r / 4);
        line(x - r, y, x - r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y - r / 4);
        line(x + r / 4, y - r / 4, x, y - r);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x - r / 4, y + r / 4, x, y + r);


        x = width - width / 6;
        y = height - height / 6;
        r = 50;
        stroke(250, 155, 180);
        strokeWeight(3);
        line(x - r, y, x + r, y);
        line(x, y - r, x, y + r);
        line(x - r / 4, y - r / 4, x + r / 4, y + r / 4);
        line(x + r / 4, y - r / 4, x - r / 4, y + r / 4);
        line(x - r, y, x - r / 4, y - r / 4);
        line(x - r, y, x - r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y + r / 4);
        line(x + r, y, x + r / 4, y - r / 4);
        line(x + r / 4, y - r / 4, x, y - r);
        line(x - r / 4, y - r / 4, x, y - r);
        line(x + r / 4, y + r / 4, x, y + r);
        line(x - r / 4, y + r / 4, x, y + r);
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}