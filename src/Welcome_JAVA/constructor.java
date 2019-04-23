package Welcome_JAVA;

public class constructor {

    public static void main(String[] agrs){
        Point p=new Point(3,4);
        Point origin=new Point(6,8);
        double dis=p.distance(origin);
        System.out.println(dis);
        System.out.println(p);
    }



}



class Point {
    double x, y;

    public  Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public double distance(Point o) {
        return Math.sqrt((x - o.x) * (x - o.x) + (y - o.y) * (y - o.y));
    }
}