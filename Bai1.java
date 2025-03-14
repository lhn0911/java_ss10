package ss10;

public class Bai1 {
    /*
    Tính đóng gói
   - Định nghĩa:
        Object là thể hiện cụ thể của một class.
        Nó chiếm giữ bộ nhớ và chứa trạng thái (state) và hành vi (behavior) xác định.
    - Vì sao nó quan trọng:
        Tăng tính bảo trì và mở rộng.
        Che giấu thông tin.
        Kiểm soát quyền truy cập.
        Bảo vệ dữ liệu.
    - Cách để áp dụng tính đóng gói trong Java:
         b1: Khai báo các thuộc tính (fields) là private, ngăn chặn truy cập trực tiếp từ bên ngoài.
         b2: Cung cấp các phương thức getter và setter để truy xuất và thay đổi giá trị thuộc tính.
         b3: Sử dụng các mức truy cập (private, protected, public) để kiểm soát quyền truy cập.
    - Giải thích getter và setter:
            + Getter: Lấy thông tin.
            + Setter: Thay đổi thông tin.
            Ví dụ:
        public class Person {
            private String name;
            private int age;
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                if (age > 0) {
                    this.age = age;
                } else {
                    System.out.println("Tuổi không hợp lệ!");
                }
            }

            public static void main(String[] args) {
                Person person = new Person("Nguyen van a", 19);
                System.out.println("Tên: " + person.getName() + ", Tuổi: " + person.getAge());

                person.setName("Nguyen van a");
                person.setAge(20);
                System.out.println("Tên: " + person.getName() + ", Tuổi: " + person.getAge());

                person.setAge(-5);
            }
        }

    - Lợi ích :
        Dễ dàng bảo trì và mở rộng: Code được tổ chức thành các module dễ quản lý.
        Tăng khả năng tái sử dụng: Các class và đối tượng có thể được sử dụng lại trong các phần khác nhau của chương trình.
        Hỗ trợ tốt hơn cho lập trình nhóm: OOP giúp chia công việc rõ ràng dựa trên từng module.
    */
}
