import processing.core.PApplet;

public class Main extends PApplet {

    static String N;

    float x;
    float y;

    public void settings() {
        fullScreen();}


    public void setup() {
        background(0);
        int n = Integer.parseInt(N);
        x = width / 2;
        y = height / 2;
        float dcolor = 255/n;
        for (int i = 0; i < 10; i++) {
            float color = dcolor + i * dcolor;
            float r = min(width, height) - i * min(width, height) / n;
            fill(color, 0, 0);
            ellipse(x, y, r, r);


        }


        frameRate(100);


    }




    public static void main(String... args) {
        PApplet.main("Main");
    }
}