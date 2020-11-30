import processing.core.PApplet;

class Point extends PApplet {

    private PApplet sketch;

    private float x;
    private float y;

    Point(float x, float y,PApplet sketch) {
        this.x = x;
        this.y = y;
        this.sketch = sketch;
    }

    Point halfDistanceCoord(Point a){
        return new Point((this.x+a.x)/2,(this.y+a.y)/2,this.sketch);
    }

    void show() {
//        sketch.noFill();
        sketch.ellipse(this.x,this.y,5,5);
        sketch.color(255,255,255);
        sketch.stroke(100, 0, 0);

//        sketch.strokeWeight(1);
//        strokeWeight(10);
    }
}