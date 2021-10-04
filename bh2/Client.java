package bh2;

public class Client {
    public static void main(String[] args) {
        LopHoc java = new LopHoc();

        java.them(new SinhVien(1, "Khanh", 10));
        java.them(new SinhVien(2, "Tan", 10));
        java.them(new SinhVien(2, "Huong", 10)); // Không được thêm vì ma = 2 đã tồn tại

        SinhVien kq = java.tim(1);
        kq.setTen("Khac Khanh");

        java.xoa(4);

        System.out.println(java);
    }
}
