import java.awt.*;

public class Punkt {
    public static void main(String[] args) {

        Point blank;
        blank = new Point(4, 5);
        int x = blank.x;

        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;
        System.out.println(sum);
        printPoint(blank);
        Point p1;
        p1 = new Point(2, 3);
        Point p2;
        p2 = new Point(4, 5);

        System.out.println(distance(p1, p2));

        Rectangle box = new Rectangle(0, 0, 100, 200);
        System.out.println(box);
        System.out.println(findCenter(box));
        box.x = box.x + 50;
        box.y = box.y + 100;
        System.out.println(box);
        moveRect(box, 50, 100);
        System.out.println(box);
        box.translate(20, 70);
        System.out.println(box);
        NewLine.newLine();
        Rectangle box1 = new Rectangle(0, 0, 100, 200);
        Rectangle box2 = box1;
        System.out.println(box2.width);
        box1.grow(50, 50);
        System.out.println(box1.width);
        System.out.println(box1);
        NewLine.newLine();
        Point blank1 = null;
        System.out.println(blank1);


    }
    public static void moveRect (Rectangle box, int dx, int dy){
        box.x = box.x + dx;
        box.y = box.y + dy;
    }
    public static Point findCenter(Rectangle box){
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
    public static void printPoint(Point p){
        System.out.println("(" + p.x + ", " + p.y + ")" );
    }
    public static double distance (Point p1, Point p2){
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
