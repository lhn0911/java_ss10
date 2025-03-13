package ss10;

class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Loi: Ban kinh phai lon hon 0!");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Loi: Chieu cao phai lon hon 0!");
        }
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Dien tich hinh tron: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("The tich hinh tru: " + cylinder.getVolume());

        circle.setRadius(7);
        System.out.println("Dien tich hinh tron sau khi thay doi: " + circle.getArea());

        cylinder.setHeight(15);
        System.out.println("The tich hinh tru sau khi thay doi: " + cylinder.getVolume());
    }
}
