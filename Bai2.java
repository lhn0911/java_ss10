package ss10;

public class Bai2 {
    /*
    1.
        - Kế thừa là gì
            là một tính năng của lập trình hướng đối tượng
            cho phép một lớp (class) mới tiếp nhận các thuộc tính và phương thức của một lớp khác.
        - Lợi ích của tính kế thừa:
            + Tái sử dụng mã nguồn: Tránh viết lại cùng một logic cho nhiều lớp khác nhau.
            + Dễ bảo trì: Khi cần thay đổi logic chung, chỉ cần sửa trong lớp cha, tất cả lớp con sẽ cập nhật theo.
            + Mở rộng chức năng: Lớp con có thể thêm phương thức hoặc ghi đè phương thức của lớp cha mà không làm thay đổi lớp cha.
    2.
        - Sự khác biệt giữa tính kế thừa và bao đóng
        -- Tính kế thừa
        + khái niệm: Cho phép một lớp kế thừa thuộc tính và phương thức từ lớp cha.
            + mục đích: Tái sử dụng mã nguồn, tạo mối quan hệ cha - con giữa các lớp.
            + từ khóa chính: extends, super
            + ứng dụng: Dùng khi có các lớp có quan hệ chung và cần chia sẻ code.
        -- Tính bao đóng
        + khái niệm: Bảo vệ dữ liệu bằng cách giới hạn quyền truy cập trực tiếp.
            + mục đích: Đảm bảo dữ liệu không bị thay đổi một cách trực tiếp từ bên ngoài.
            + từ khóa chính: private, protected, public, getter, setter
            + ứng dụng: Dùng để ẩn thông tin chi tiết của đối tượng, bảo vệ dữ liệu.
    3.
        class cha{
            public void dilam(){
                System.out.println("........");
            }
        }
        class con extends cha(){
            public void onha(){
                System.out.println("---------");
            }
        }
        public class test(){
            con trai = new con(); // ke thua thuoc tinh cua lop cha
            trai.dilam();
        }
    4.
        - Ưu điểm:
            +, Tái sử dụng code
            +, Dễ dàng bảo trì
            +, Mở rộng tính năng
            +, Tăng tính linh hoạt
        - Nhược điểm:
            +, Thiếu linh hoạt
            +, Giới hạn đơn kế thừa
            +, Dễ tạo ra phụ thuộc chặt chẽ
    */

}
