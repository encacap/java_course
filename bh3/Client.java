package bh3;

public class Client {
    public static void main(String[] args) {
        IGioHang gh = new GioHang();
        SanPham sp1 = new SanPham(1, "Tivi", 100);
        SanPham sp2 = new SanPham(2, "Laptop", 100);
        gh.them(sp1, 1);
        gh.them(sp1, 10);
        gh.them(sp2, 2);
        System.out.println("So mat hang: " + gh.soMatHang());
        System.out.println("So san pham: " + gh.soSanPham());
        System.out.println("Tong tien: " + gh.tongTien());
        gh.hienThi();
    }
}
