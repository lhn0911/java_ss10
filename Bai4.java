package ss10;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong duoc am!");
        }
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Book book = new Book("Dragon ball", "Toriyama akira", 199.99);

        System.out.println("Ten: " + book.getTitle());
        System.out.println("Tac gia: " + book.getAuthor());
        System.out.println("Gia: " + book.getPrice() + " VND");

        book.setTitle("7 vien ngoc rong");
        book.setAuthor("Torotaru");
        book.setPrice(-50);

        System.out.println("Ten: " + book.getTitle());
        System.out.println("Tac gia: " + book.getAuthor());
        System.out.println("Gia: " + book.getPrice() + " VND");
    }
}
