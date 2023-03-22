package recta;

public class Straight {
    private Point point1;
    private Point point2;

    public Straight(Point point1, Point point2){
        setpoint1(point1);
        setpoint2(point2);
    }
    public Point getpoint1() {
        return point1;
    }
    public void setpoint1(Point point1) {
        this.point1 = point1;
    }
    public Point getpoint2() {
        return point2;
    }
    public void setpoint2(Point point2) {
        this.point2 = point2;
    }
    public double distancia(){
        return Math.sqrt(Math.pow((point2.getX()-point1.getX()),2)+Math.pow((point2.getY()-point1.getY()),2));
    }
}
