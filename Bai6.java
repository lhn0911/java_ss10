package ss10;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class MoveablePoint extends Point {
    private double xSpeed;
    private double ySpeed;

    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println("Diem ban dau: " + point);

        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 1, 1);
        System.out.println("Diem co the di chuyen: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Diem sau khi di chuyen: " + moveablePoint);
    }
}
