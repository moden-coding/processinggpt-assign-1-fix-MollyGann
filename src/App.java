import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");

    }

    public void settings() {
        size(400, 400);
    }
    

    public void setup() {
        background(167, 237, 252); 
    }
    public void draw() {
        fill(240, 207, 60); 
        stroke(235, 130, 49); 
        strokeWeight(10); 
        ellipse(80, 80, 100, 100); // (x, y, width, height)
       
        fill(92, 19, 19);
        stroke(46, 29, 29); 
        strokeWeight(4);  
        rect(200, 250, 150, 150); // Draw rectangle

        stroke(4, 124, 204); // Set line color 
        strokeWeight(1); // Set line thickness
        line(70, 0, 400, 287); // (x1, y1, x2, y2);

    }

}
