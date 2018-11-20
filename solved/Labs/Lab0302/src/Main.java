import processing.core.PApplet;

public class Main extends PApplet {

    float x = 0;
    float dx = 3;
    float y = 0;
    float dy = 5;
    public void settings() {
        fullScreen();
    }


    public void draw() {

        background(0, 0, 0);
        fill(255, 0, 0);
        ellipse(x, height / 2, 100, 100);
        x = x + dx;

        if(x < 0) {
            x = 0;
            dx = -dx;
        }

        if(y > height) {
            y = height -1;
            dy = -dy;

        }
        if(y < 0) {
            y = 0;
            dy = -dy;

        }



    }




}