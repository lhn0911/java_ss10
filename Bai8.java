package ss10;

class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        if (name == null || name.isEmpty() || age < 0) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.name = name;
        this.age = age;
    }

    public String displayInfo() {
        return "Ten: " + name + ", Tuoi: " + age;
    }

    public String makeSound() {
        return "Some generic sound";
    }
}

class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        if (breed == null || breed.isEmpty()) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.breed = breed;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Giong: " + breed;
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}

class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        if (furColor == null || furColor.isEmpty()) {
            throw new IllegalArgumentException("Du lieu khong hop le");
        }
        this.furColor = furColor;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", Mau long: " + furColor;
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}

public class Bai8 {
    public static void main(String[] args) {
        Animals[] animals = new Animals[]{
                new Dog("Rex", 5, "Labrador"),
                new Cat("Mimi", 3, "Trang"),
                new Dog("Buddy", 2, "Husky"),
                new Cat("Tom", 4, "Den")
        };

        for (Animals animal : animals) {
            System.out.println(animal.displayInfo() + ", Sound: " + animal.makeSound());
        }
    }
}
