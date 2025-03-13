package ss10;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Hinh: " + name + ", Dien tich: " + calculateArea() + ", Chu vi: " + calculatePerimeter();
    }
}

class CircleSS10 extends Shape {
    private double radius;

    public CircleSS10(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Ban kinh khong hop le");
        }
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ban kinh: " + radius;
    }
}

class RectangleSS10 extends Shape {
    private double width, height;

    public RectangleSS10(String name, double width, double height) {
        super(name);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Chieu dai hoac chieu rong khong hop le");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return super.toString() + ", Chieu rong: " + width + ", Chieu cao: " + height;
    }
}

class TriangleSS10 extends Shape {
    private double a, b, c;

    public TriangleSS10(String name, double a, double b, double c) {
        super(name);
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Tam giac khong hop le");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return super.toString() + ", Canh: " + a + ", " + b + ", " + c;
    }
}

public class Bai10 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new CircleSS10("Hinh tron", 5),
                new RectangleSS10("Hinh chu nhat", 4, 6),
                new TriangleSS10("Tam giac", 3, 4, 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
