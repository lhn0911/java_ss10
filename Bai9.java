package ss10;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        if (name == null || name.isEmpty() || id < 0 || salary < 0) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }

    @Override
    public String toString() {
        return "Ten: " + name + ", ID: " + id + ", Luong: " + salary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        if (bonus < 0) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Thuong: " + bonus;
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        if (programmingLanguage == null || programmingLanguage.isEmpty()) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngon ngu: " + programmingLanguage;
    }
}

public class Bai9 {
    public static void main(String[] args) {
        Employee emp = new Employee("Nam", 101, 5000);
        Manager mgr = new Manager("An", 102, 8000, 2000);
        Developer dev = new Developer("Linh", 103, 7000, "Java");

        System.out.println(emp);
        System.out.println(mgr);
        System.out.println(dev);

        emp.increaseSalary(1000);
        System.out.println("Sau khi tang luong:");
        System.out.println(emp);
    }
}
