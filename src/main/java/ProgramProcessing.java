import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgramProcessing extends PApplet {

    private Point p;
    private List<Point> points = new ArrayList<Point>();
    static final int ANGLE_COUNT = 3;

    static final Random random = new Random();

    public void settings() {
        size(800, 800);
//        this.noFill();
//        background(220);
    }

    public void draw() {
    }

    public void mouseClicked() {
        Point point = new Point(mouseX, mouseY, this);
        point.show();
        points.add(point);
        if (points.size() == 1) {
            point.show();
        }
        if(points.size()==ANGLE_COUNT) {
            point.show();
            Point tempPoint;
            for (int i = 0; i < 100000; i++) {
                tempPoint = getNonEquealsPoint(point);
                point = point.halfDistanceCoord(tempPoint);
                point.show();
            }
            points.clear();
        }
    }


    private Point getNonEquealsPoint(Point point) {
        Point tempPoint = points.get(random.nextInt(ANGLE_COUNT));
        while (point.equals(tempPoint)) {
            tempPoint = points.get(random.nextInt(ANGLE_COUNT));
        }
        return tempPoint;
    }

    public static void main(String... args) {
        PApplet.main("ProgramProcessing");
    }
}
