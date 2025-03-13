package ss10;

import java.time.LocalDate;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > LocalDate.now().getYear()) {
            System.out.println("Nam san xuat khong duoc lon hon nam hien tai");
        } else {
            this.year = year;
        }
    }
}

class Bai3 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civi", 2025);
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2026);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
